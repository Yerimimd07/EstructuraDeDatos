import java.util.*;

public class Raices {

    public static void main(String[] args) {

        // Creación de la Pila de Enteros
        Stack<Integer> pila = new Stack<>();
        // Validar si la pila está vacía
        System.out.println("La pila esta vacia " + pila.empty());

        pila.push(125);
        pila.push(25);

        pila.push(27);
        pila.push(9);

        pila.push(48);
        pila.push(16);

        pila.push(8);
        pila.push(4);

        // Imprimir la pila
        System.out.println(pila); //

        // Validar si la pila está vacía
        System.out.println("La pila esta vacia " + pila.empty());

        double tolerancia = 1e-5; // Tolerancia razonable con 5 decimales

        int totalPares = pila.size() / 2;

        for (int i = 0; i < totalPares; i++) {

            int a = pila.pop(); // Saca el primero (a)
            int b = pila.pop(); // Saca el segundo (b)

            double raizA = Math.sqrt(a);
            double raizB = Math.cbrt(b);

            boolean sonIguales = Math.abs(raizA - raizB) < tolerancia;

            System.out.println("\nPar: " + (i + 1) + " a: " + a + ", b: " + b + " | ¿Son iguales? " + sonIguales);

        }

    }

}
