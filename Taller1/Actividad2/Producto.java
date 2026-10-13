public class Producto {
 
    // Atributos del producto
    private int codigo;
    private String nombre;
    private double precio;
    private int cantidad;
 
    // Constructor
    public Producto(int codigo, String nombre, double precio, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
 
    // Métodos get
    public int getCodigo() {
        return codigo;
    }
 
    public String getNombre() {
        return nombre;
    }
 
    public double getPrecio() {
        return precio;
    }
 
    public int getCantidad() {
        return cantidad;
    }
 
    // Valor total de este producto (precio x cantidad)
    public double getValorTotal() {
        return precio * cantidad;
    }
 
    // Representación en texto del producto
    @Override
    public String toString() {
        return "[ Código: " + codigo + " | Nombre: " + nombre + " | Precio: $" + precio + " | Cantidad: " + cantidad "]";
    }
}