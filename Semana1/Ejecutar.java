package Semana1;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Ejecutar {
    public static void main(String[] args) {
        // Declaracion del arreglo-array-vector (Forma 1)
        int[] a = { 5, 16, 8, 9, 10, 25, 19, 3, 6, 22, 2 };

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "]=" + a[i]);

        }
        // Sumar todos los elementos del arreglo a
        int suma = 0;
        for (int i = 0; i < a.length; i++) {
            suma += a[i];
        }
        System.out.println();
        System.out.println("La suma de los elementos del arreglo a: " + suma);
        System.out.println();

        // Declaracion del arreglo-array-vector (Forma 2)

        int[] b = new int[11];
        int min = 1;
        int max = 30;
        for (int i = 0; i < a.length; i++) {
            // llenar el arreglo b con numero aleatorios entre 1(minimo) y 50(Maximo)
            b[i] = (int) (Math.random() * (max - min - 1) + min);
        }
        //Mostrar arreglo b --> Elevar al cuadrado cada posicion 
        for (int i = 0; i < b.length; i++) {
            System.out.println("b[" + i + "]=" + b[i] + " Potencia 2 = " + Math.pow(b[i],2));
        }

    }
}
