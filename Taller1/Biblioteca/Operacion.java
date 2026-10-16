public class Operacion {

    // Atributos de la operación
    private int id;
    private String descripcion;
    private String tipo;

    // Constructor
    public Operacion(int id, String descripcion, String tipo) {
        this.id = id;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }

    // Métodos get
    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    // Representación en texto de la operación
    @Override
    public String toString() {
        return "ID: " + id + " | Tipo: " + tipo + " | " + descripcion;
    }
}