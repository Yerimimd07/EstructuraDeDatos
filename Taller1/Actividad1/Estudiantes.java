public class Estudiantes {

    // Atributos
    private int codigoId;
    private String nombres;
    private String programaAc;
    private double promedio;

    public Estudiantes(int codigoId, String nombres, String programaAc, double promedio) {
        this.codigoId = codigoId;
        this.nombres = nombres;
        this.programaAc = programaAc;
        this.promedio = promedio;
    }

    public int getCodigoId() {
        return codigoId;
    }

    public String getNombres() {
        return nombres;
    }

    public String getProgramaAc() {
        return programaAc;
    }

    public double getPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        return "[Id : " + codigoId + ", Nombres : " + nombres + ", Programa Academico :" + programaAc
                + ", Promedio : " + promedio + "]";
    }

    // Listar estudiantes

    public void listarEstudiantes(Estudiantes[] e) {
        System.out.println("\nLa lista de estudiantes: ");
        for (int i = 0; i < e.length; i++) {
            if (e[i] != null) {
                System.out.println(e[i]);
            }
        }
    }

    // Metodo para buscar un estudiante por codigo
    public Estudiantes buscarEstudiante(Estudiantes[] e, int codigoId) {

        for (int i = 0; i < e.length; i++) {

            if (e[i] != null && e[i].getCodigoId() == codigoId) {
                System.out.println("\nEl estudiante es:");
                System.out.println(e[i]);
                return e[i];
            }
        }

        System.out.println("\nNo se encontro el estudiante con codigo: " + codigoId);
        return null;
    }

    // Promedio igual o mayor a 4
    public void mostrarPromedio(Estudiantes[] e) {
        System.out.println("\nLos estudiantes con promedio igual o superior a 4.0 son: ");
        for (int i = 0; i < e.length; i++) {
            if (e[i] != null && e[i].getPromedio() >= 4.0) {
                System.out.println(e[i]);
            }
        }
    }

    // Metodo para identificar el estudiante con mayor promedio
    public Estudiantes mayorPromedio(Estudiantes[] e) {
        Estudiantes mayor = null;

        for (int i = 0; i < e.length; i++) {
            if (e[i] != null) {
                if (mayor == null || e[i].getPromedio() > mayor.getPromedio()) {
                    mayor = e[i];
                }
            }
        }
        System.out.println("\nEl estudiante con el mejor promedio es: " + mayor);
        return mayor;
    }

}