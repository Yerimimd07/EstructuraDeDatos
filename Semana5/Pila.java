import java.util.*;

public class Pila {

    public static void main(String[] args) {
        
        //Creación de la Pila de Enteros
        Stack<Integer> pila = new Stack<>();
        
        //Validar si la pila está vacía
        
        //Agregar elementos a la pila
        pila.push(5);
        pila.push(8);
        pila.push(10);
        pila.push(2);
        pila.push(20);
        pila.push(15);
        pila.push(1);
        
        //Imprimir la pila
        System.out.println(pila);
        
        //Mostrar el tope de la pila sin remover el elemento
        System.out.println("Tope de la pila: " + pila.peek());
    }   
}
