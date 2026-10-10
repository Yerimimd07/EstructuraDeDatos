public class GesEstudiantes {

    // Atributos
    private int id;
    private String nombre;
    private String apellido;
    private String programaAc;
    private double calificaciones;

    public GesEstudiantes(int id, String nombre, String apellido, String programaAc, double calificaciones) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.programaAc = programaAc;
        this.calificaciones = calificaciones;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getProgramaAc() {
        return programaAc;
    }

    public double getCalificaciones() {
        return calificaciones;
    }

    @Override
    public String toString() {
        return "GesEstudiantes [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", programaAc="
                + programaAc + ", calificaciones=" + calificaciones + "]";
    }

     //Método que permite calcular el promedio de las calificaciones de los estudiantes
   
    public double promediocal(GesEstudiantes[] t){
        int sumaCal = 0.0;
        for(int i = 0; i < t.length; i++){
            sumaCal += t[i].getCalificaciones();
        }
        double promCal = sumaCal / t.length;
        return promCal;
    }
}
