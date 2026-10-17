import java.util.*;

public class votos {

    public static void main(String[] args) {

        // Contadores
        int upvotes = 0;
        int downvotes = 0;
        int totalVotos = 0;

        // Creación de la cola
        Queue<String> colaDeVotos = new LinkedList<>();

        // Agregamos votos a la cola
        colaDeVotos.offer("UPVOTE");
        colaDeVotos.offer("UPVOTE");
        colaDeVotos.offer("DOWNVOTE");
        colaDeVotos.offer("UPVOTE");
        colaDeVotos.offer("DOWNVOTE");
        colaDeVotos.offer("DOWNVOTE");
        colaDeVotos.offer("DOWNVOTE");
        colaDeVotos.offer("UPVOTE");
        colaDeVotos.offer("UPVOTE");

        int cantidadVotos = colaDeVotos.size();

        for (int i = 0; i < cantidadVotos; i++) {
            String voto = colaDeVotos.poll();

            // Comparamos el texto de forma segura con .equals()
            if ("UPVOTE".equals(voto)) {
                upvotes++;
                totalVotos++;
            } else if ("DOWNVOTE".equals(voto)) {
                downvotes++;
                totalVotos--;
            }

        }
        System.out.println("Total votos a favor: " + upvotes);
        System.out.println("Total votos en contra: " + downvotes);
        System.out.println("Total salida esperada: " + totalVotos);

    }

}
