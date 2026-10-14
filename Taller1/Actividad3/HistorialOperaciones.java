import java.util.*;
 
public class HistorialOperaciones {
 
    // Capacidad máxima de la pila
    private final int CAPACIDAD = 10;
 
    // Pila de objetos Operacion
    private Stack<Operacion> pila = new Stack<>();
 
    // Validar si la pila está vacía
    public boolean estaVacia() {
        return pila.empty();
    }
 
    // Validar si la pila está llena
    public boolean estaLlena() {
        return pila.size() == CAPACIDAD;
    }
 
    // Obtener el tamaño de la pila
    public int tamanio() {
        return pila.size();
    }
 
    // Apilar una nueva operación
    public String apilar(Operacion op) {
        if (estaLlena()) {
            return "Error: la pila está llena (" + CAPACIDAD + "/" + CAPACIDAD
                    + "). No se pudo apilar la operación con ID " + op.getId() + ".";
        }
        pila.push(op);
        return "Operación apilada --> " + op;
    }
 
    // Desapilar la última operación registrada
    public String desapilar() {
        if (estaVacia()) {
            return "Error: la pila está vacía. No hay operaciones para desapilar.";
        }
        Operacion op = pila.pop();
        return "Operación desapilada --> " + op;
    }
 
    // Consultar el elemento que se encuentra en el tope (sin removerlo)
    public String consultarTope() {
        if (estaVacia()) {
            return "La pila está vacía. No hay tope.";
        }
        return "Tope de la pila --> " + pila.peek();
    }
 
    // Mostrar los elementos de la pila (del tope hacia la base)
    public String mostrar() {
        if (estaVacia()) {
            return "La pila está vacía.";
        }
        String cad = "";
        for (int i = pila.size() - 1; i >= 0; i--) {
            cad += "[" + (i + 1) + "] " + pila.get(i);
            if (i == pila.size() - 1) {
                cad += "   <-- TOPE";
            }
            cad += "\n";
        }
        return cad;
    }
}