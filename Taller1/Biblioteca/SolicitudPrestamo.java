public class SolicitudPrestamo {

    // Atributos de la solicitud
    private int id;
    private String solicitante;
    private int codigoLibro;

    // Constructor
    public SolicitudPrestamo(int id, String solicitante, int codigoLibro) {
        this.id = id;
        this.solicitante = solicitante;
        this.codigoLibro = codigoLibro;
    }

    // Métodos get
    public int getId() {
        return id;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public int getCodigoLibro() {
        return codigoLibro;
    }

    // Representación en texto de la solicitud
    @Override
    public String toString() {
        return "Solicitud #" + id + " | Solicitante: " + solicitante + " | Código del libro: " + codigoLibro;
    }
}