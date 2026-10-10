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
        return "Estudiantes [codigoId=" + codigoId + ", nombres=" + nombres + ", programaAc=" + programaAc
                + ", promedio=" + promedio + "]";
    }

}
