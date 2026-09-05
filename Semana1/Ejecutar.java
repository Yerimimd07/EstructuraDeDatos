package Semana1;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Ejecutar {
    public static void main(String[] args) {
        //Declaracion del arreglo-array-vector (Forma 1)
        int[] a={5, 16, 8, 9, 10, 25, 19, 3, 6, 22, 2};
       
        for(int i = 0; i < a.length; i++){
        System.out.println("a[" + i + "]=" + a[i]);
        }
        //Sumar todos los elementos del arreglo a
        int suma = 0;
        for(int i= 0; i < a.length; i++){
            suma += a[i];
        }

        System.out.println("La suma de los elementos del arreglo a: " + suma);

    }
}
