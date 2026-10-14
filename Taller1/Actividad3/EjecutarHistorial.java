public class EjecutarHistorial {
    public static void main(String[] args) {

        HistorialOperaciones objH = new HistorialOperaciones();

        // Validar si la pila esta vacia

        System.out.println("La pila esta vacia: " + objH.estaVacia());
        System.out.println(objH.desapilar());
        System.out.println(objH.consultarTope());

    }

}
