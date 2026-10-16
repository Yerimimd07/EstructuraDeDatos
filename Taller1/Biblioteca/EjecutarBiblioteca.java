import java.util.*;

public class EjecutarBiblioteca {

    // Método auxiliar para leer un número entero validando la entrada
    public static int leerEntero(Scanner sc, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Debe ingresar un número entero.");
            }
        }
    }

    public static void main(String[] args) {

        // Creación del objeto para llamar los métodos de la clase
        // Biblioteca.java
        Biblioteca objB = new Biblioteca();
        Scanner sc = new Scanner(System.in);

        // Datos de ejemplo para poder probar la aplicación de inmediato
        objB.registrarLibro(new Libro(101, "Java Fundamentals", "Cay Horstmann"), 0, 0);
        objB.registrarLibro(new Libro(102, "Estructuras de Datos", "Mark Weiss"), 0, 1);
        objB.registrarLibro(new Libro(201, "Física Universitaria", "Sears Zemansky"), 1, 0);
        objB.registrarLibro(new Libro(301, "Cien Años de Soledad", "Gabriel García Márquez"), 2, 0);

        int opcion;
        do {
            System.out.println("\n===== BIBLIOTECA UNIVERSITARIA =====");
            System.out.println("1. Registrar libro");
            System.out.println("2. Consultar todos los libros");
            System.out.println("3. Buscar libro por código");
            System.out.println("4. Mostrar libros por secciones");
            System.out.println("5. Solicitar préstamo");
            System.out.println("6. Ver solicitudes pendientes");
            System.out.println("7. Procesar siguiente solicitud");
            System.out.println("8. Devolver libro");
            System.out.println("9. Ver historial de operaciones");
            System.out.println("0. Salir");
            opcion = leerEntero(sc, "Seleccione una opción: ");
            System.out.println();

            switch (opcion) {
                case 1:
                    int codigo = leerEntero(sc, "Código del libro: ");
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Autor: ");
                    String autor = sc.nextLine();
                    System.out.println("Secciones disponibles:");
                    System.out.print(objB.mostrarNombresSecciones());
                    int seccion = leerEntero(sc, "Número de la sección: ");
                    int estante = leerEntero(sc, "Número del estante (0 a 3): ");
                    System.out.println(objB.registrarLibro(new Libro(codigo, titulo, autor), seccion, estante));
                    break;
                case 2:
                    System.out.println(objB.consultarLibros());
                    break;
                case 3:
                    System.out.println(objB.consultarLibro(leerEntero(sc, "Código del libro: ")));
                    break;
                case 4:
                    System.out.println(objB.mostrarSecciones());
                    break;
                case 5:
                    System.out.print("Nombre del solicitante: ");
                    String solicitante = sc.nextLine();
                    int codSolicitud = leerEntero(sc, "Código del libro solicitado: ");
                    System.out.println(objB.solicitarPrestamo(solicitante, codSolicitud));
                    break;
                case 6:
                    System.out.println(objB.mostrarSolicitudes());
                    break;
                case 7:
                    System.out.println(objB.procesarSolicitud());
                    break;
                case 8:
                    System.out.println(objB.devolverLibro(leerEntero(sc, "Código del libro a devolver: ")));
                    break;
                case 9:
                    System.out.println(objB.mostrarHistorial());
                    break;
                case 0:
                    System.out.println("Fin del programa.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}