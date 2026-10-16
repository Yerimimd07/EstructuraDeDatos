public class Libro {

    // Atributos del libro
    private int codigo;
    private String titulo;
    private String autor;
    private boolean disponible;

    // Constructor (todo libro nuevo queda disponible)
    public Libro(int codigo, String titulo, String autor) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    // Métodos get y set
    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // Representación en texto del libro
    @Override
    public String toString() {
        return "Código: " + codigo + " | Título: " + titulo + " | Autor: " + autor
                + " | Estado: " + (disponible ? "Disponible" : "Prestado");
    }
}