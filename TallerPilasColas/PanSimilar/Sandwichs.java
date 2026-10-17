import java.util.*;

public class Sandwichs {
    public static void main(String[] args) {

        Deque<String> sw1 = new ArrayDeque<>();
        Deque<String> sw2 = new ArrayDeque<>();

        //List<String> s1 = Arrays.asList("Pan blanco", "Queso", "pan blanco");
        //List<String> s2 = Arrays.asList("Pan blanco", "Queso", "pan blanco");

        sw1.add("pan blanco");
        sw1.add("queso");
        sw1.add("jamon");
        sw1.add("pan blanco");

        sw2.add("pan blanco");
        sw2.add("lechuga");
        sw2.add("pan integral");
        

        System.out.println(mismopan(sw1, sw2));

    }

    public static boolean mismopan(Deque<String> s1, Deque<String> s2) {

        if(s1.isEmpty() || s2.isEmpty()){
            System.out.println("Uno de los sandwiches esta vacio");
            return false;
        }

        if (s1.peekFirst().equals(s2.peekFirst()) && s1.peekLast().equals(s2.peekLast())) {
            System.out.println("Los panes son iguales");
        } else {
            System.out.println("Los panes son diferentes");
        }

        return s1.peekFirst().equals(s2.peekFirst()) && s1.peekLast().equals(s2.peekLast());
    }

}
