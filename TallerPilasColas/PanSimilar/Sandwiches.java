import java.util.*;

public class Sandwiches {
    public static void main(String[] args) {

        // Inicialización directa pasando la lista al constructor de ArrayDeque
        Deque<String> sw1 = new ArrayDeque<>(Arrays.asList("pan blanco", "queso", "jamon", "pan blanco"));
        Deque<String> sw2 = new ArrayDeque<>(Arrays.asList("pan blanco", "lechuga", "pan blanco"));

        System.out.println(mismopan(sw1, sw2));
    }

    public static boolean mismopan(Deque<String> s1, Deque<String> s2) {
        if (s1.isEmpty() || s2.isEmpty()) {
            return false;
        }

        boolean iguales = s1.peekFirst().equalsIgnoreCase(s2.peekFirst()) && s1.peekLast().equalsIgnoreCase(s2.peekLast());

        if (iguales) {
            System.out.println("Los panes son iguales");
        } else {
            System.out.println("Los panes son diferentes");
        }

        return iguales;
    }

}
