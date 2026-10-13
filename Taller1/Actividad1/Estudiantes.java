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
        return "Estudiantes [codigoId : " + codigoId + ", nombres : " + nombres + ", programaAc :" + programaAc
                + ", promedio : " + promedio + "]";
    }

    // Listar estudiantes

    public static void listarEstudiantes(Estudiantes[] e) {
        for (int i = 0; i < e.length; i++) {
            if (e[i] != null) {
                System.out.println(e[i]);
            }
        }
    }

    // Metodo para buscar un estudiante por codigo
    public static Estudiantes buscarEstudiante(Estudiantes[] e, int codigo) {
        for (int i = 0; i < e.length; i++) {
            if (e[i] != null && e[i].getCodigoId() == codigo) {
                return e[i];
            }
        }
        return null;
    }

    // Promedio igual o mayor a 4
    public void mostrarPromedio(Estudiantes[] e) {
        System.out.println("Los estudiantes con promedio igual o superior a 4.0 son: ");
        for (int i = 0; i < e.length; i++) {
            if (e[i] != null && e[i].getPromedio() >= 4.0) {
                System.err.println(e[i]);
            }
        }
    }

}