import java.util.*;

public class Biblioteca {

    // Capacidades
    private final int MAX_LIBROS = 12;      // 3 secciones x 4 estantes
    private final int MAX_HISTORIAL = 10;   // últimas 10 operaciones

    // Nombres de las secciones (filas de la matriz)
    private String[] nombresSecciones = {"Tecnología", "Ciencias", "Humanidades"};

    // 1. ARREGLO de objetos: registro general de libros
    private Libro[] libros = new Libro[MAX_LIBROS];
    private int totalLibros = 0;

    // 2. MATRIZ de objetos: libros organizados por sección (fila) y estante (columna)
    private Libro[][] secciones = new Libro[3][4];

    // 3. COLA: solicitudes de préstamo (FIFO)
    private Queue<SolicitudPrestamo> cola = new LinkedList<>();

    // 4. PILA: historial de las últimas operaciones (LIFO)
    private Stack<Operacion> historial = new Stack<>();

    // Contadores para generar los identificadores
    private int contadorSolicitudes = 0;
    private int contadorOperaciones = 0;

    // Obtener los nombres de las secciones (para mostrarlos en el menú)
    public String mostrarNombresSecciones() {
        String cad = "";
        for (int i = 0; i < nombresSecciones.length; i++) {
            cad += i + " = " + nombresSecciones[i] + "\n";
        }
        return cad;
    }

    // Método privado que registra una operación en la pila (conserva solo las últimas 10)
    private void registrarOperacion(String descripcion, String tipo) {
        contadorOperaciones++;
        if (historial.size() == MAX_HISTORIAL) {
            historial.remove(0); // se elimina la operación más antigua (base de la pila)
        }
        historial.push(new Operacion(contadorOperaciones, descripcion, tipo));
    }

    // Método privado que busca un libro por código en el arreglo
    private Libro buscarLibro(int codigo) {
        for (int i = 0; i < totalLibros; i++) {
            if (libros[i].getCodigo() == codigo) {
                return libros[i];
            }
        }
        return null;
    }

    // ===================== LIBROS (arreglo + matriz) =====================

    // Registrar un libro en el arreglo y en una sección/estante de la matriz
    public String registrarLibro(Libro l, int seccion, int estante) {
        if (totalLibros == MAX_LIBROS) {
            return "Error: la biblioteca está llena (" + MAX_LIBROS + " libros).";
        }
        if (seccion < 0 || seccion >= secciones.length || estante < 0 || estante >= secciones[0].length) {
            return "Error: la sección " + seccion + " / estante " + estante + " no existe.";
        }
        if (buscarLibro(l.getCodigo()) != null) {
            return "Error: ya existe un libro con el código " + l.getCodigo() + ".";
        }
        if (secciones[seccion][estante] != null) {
            return "Error: la sección " + nombresSecciones[seccion] + ", estante " + estante + " ya está ocupada.";
        }
        libros[totalLibros] = l;
        totalLibros++;
        secciones[seccion][estante] = l;
        registrarOperacion("Se registró el libro '" + l.getTitulo() + "' en " + nombresSecciones[seccion]
                + ", estante " + estante, "Registro");
        return "Libro '" + l.getTitulo() + "' registrado en " + nombresSecciones[seccion] + ", estante " + estante + ".";
    }

    // Consultar todos los libros registrados (recorre el arreglo)
    public String consultarLibros() {
        if (totalLibros == 0) {
            return "No hay libros registrados.";
        }
        String cad = "";
        for (int i = 0; i < totalLibros; i++) {
            cad += (i + 1) + ". " + libros[i] + "\n";
        }
        return cad;
    }

    // Consultar un libro por código e indicar su ubicación en la matriz
    public String consultarLibro(int codigo) {
        for (int i = 0; i < secciones.length; i++) {
            for (int j = 0; j < secciones[0].length; j++) {
                if (secciones[i][j] != null && secciones[i][j].getCodigo() == codigo) {
                    return secciones[i][j] + "\nUbicación: sección " + nombresSecciones[i] + ", estante " + j;
                }
            }
        }
        return "No se encontró ningún libro con el código " + codigo + ".";
    }

    // Mostrar la matriz de libros organizada por secciones
    public String mostrarSecciones() {
        String cad = "";
        for (int i = 0; i < secciones.length; i++) {
            cad += "--- Sección " + nombresSecciones[i] + " ---\n";
            for (int j = 0; j < secciones[0].length; j++) {
                cad += "  Estante " + j + " --> ";
                if (secciones[i][j] == null) {
                    cad += "[VACÍO]";
                } else {
                    cad += secciones[i][j];
                }
                cad += "\n";
            }
        }
        return cad;
    }

    // ===================== PRÉSTAMOS (cola) =====================

    // Agregar una solicitud de préstamo a la cola
    public String solicitarPrestamo(String solicitante, int codigoLibro) {
        Libro l = buscarLibro(codigoLibro);
        if (l == null) {
            return "Error: no existe un libro con el código " + codigoLibro + ". La solicitud no fue registrada.";
        }
        contadorSolicitudes++;
        SolicitudPrestamo s = new SolicitudPrestamo(contadorSolicitudes, solicitante, codigoLibro);
        cola.add(s);
        registrarOperacion("Solicitud #" + s.getId() + " de " + solicitante + " para '" + l.getTitulo() + "'",
                "Solicitud");
        return "Solicitud agregada a la cola --> " + s + " (posición en cola: " + cola.size() + ")";
    }

    // Mostrar las solicitudes pendientes (en orden de llegada)
    public String mostrarSolicitudes() {
        if (cola.isEmpty()) {
            return "No hay solicitudes pendientes.";
        }
        String cad = "";
        int pos = 1;
        for (SolicitudPrestamo s : cola) {
            cad += pos + ". " + s + "\n";
            pos++;
        }
        return cad;
    }

    // Procesar la siguiente solicitud de la cola (la primera en llegar)
    public String procesarSolicitud() {
        if (cola.isEmpty()) {
            return "No hay solicitudes pendientes para procesar.";
        }
        SolicitudPrestamo s = cola.poll();
        Libro l = buscarLibro(s.getCodigoLibro());
        if (l.isDisponible()) {
            l.setDisponible(false);
            registrarOperacion("Préstamo de '" + l.getTitulo() + "' a " + s.getSolicitante(), "Préstamo");
            return "Solicitud #" + s.getId() + " APROBADA: '" + l.getTitulo() + "' prestado a " + s.getSolicitante() + ".";
        }
        registrarOperacion("Solicitud #" + s.getId() + " rechazada: '" + l.getTitulo() + "' no está disponible",
                "Rechazo");
        return "Solicitud #" + s.getId() + " RECHAZADA: '" + l.getTitulo() + "' no está disponible.";
    }

    // Devolver un libro prestado
    public String devolverLibro(int codigo) {
        Libro l = buscarLibro(codigo);
        if (l == null) {
            return "Error: no existe un libro con el código " + codigo + ".";
        }
        if (l.isDisponible()) {
            return "El libro '" + l.getTitulo() + "' ya se encuentra disponible.";
        }
        l.setDisponible(true);
        registrarOperacion("Devolución de '" + l.getTitulo() + "'", "Devolución");
        return "Libro '" + l.getTitulo() + "' devuelto correctamente.";
    }

    // ===================== HISTORIAL (pila) =====================

    // Mostrar el historial (la operación más reciente primero, por ser una pila)
    public String mostrarHistorial() {
        if (historial.empty()) {
            return "No hay operaciones registradas.";
        }
        String cad = "";
        for (int i = historial.size() - 1; i >= 0; i--) {
            cad += historial.get(i);
            if (i == historial.size() - 1) {
                cad += "   <-- MÁS RECIENTE";
            }
            cad += "\n";
        }
        return cad;
    }
}