public class EjecutarInventario {
    public static void main(String[] args) {
 
        // Creación del objeto para llamar los métodos de la clase
        // OperacionesInventario.java
        OperacionesInventario objI = new OperacionesInventario();
 
        // Crear la matriz de 3 filas x 4 columnas
        Producto[][] inventario = objI.crearInventario(3, 4);
 
        // Registrar productos en posiciones específicas
        System.out.println("\nREGISTRO DE PRODUCTOS");
        System.out.println(objI.registrarProducto(inventario, 0, 0, new Producto(101, "Teclado", 45000, 20)));
        System.out.println(objI.registrarProducto(inventario, 0, 2, new Producto(102, "Mouse", 25000, 35)));
        System.out.println(objI.registrarProducto(inventario, 1, 1, new Producto(103, "Monitor", 650000, 8)));
        System.out.println(objI.registrarProducto(inventario, 1, 3, new Producto(104, "Impresora", 480000, 5)));
        System.out.println(objI.registrarProducto(inventario, 2, 0, new Producto(105, "Cable HDMI", 15000, 50)));
        System.out.println(objI.registrarProducto(inventario, 2, 2, new Producto(106, "Disco Duro", 280000, 12)));
 
        // Pruebas de validación (posición ocupada y posición inexistente)
        System.out.println(objI.registrarProducto(inventario, 0, 0, new Producto(107, "Webcam", 90000, 10)));
        System.out.println(objI.registrarProducto(inventario, 5, 5, new Producto(108, "Parlantes", 70000, 15)));
 
        // Mostrar el inventario con fila y columna
        System.out.println("\nINVENTARIO");
        System.out.println(objI.imprimirInventario(inventario));
 
        // Buscar un producto por código
        System.out.println("\nBÚSQUEDA POR CÓDIGO");
        System.out.println(objI.buscarProducto(inventario, 103));
        System.out.println(objI.buscarProducto(inventario, 999));
 
        // Valor total del inventario
        System.out.println("\nVALOR TOTAL DEL INVENTARIO");
        System.out.println("$" + objI.calcularValorTotal(inventario));
 
        // Producto con mayor cantidad
        System.out.println("\nPRODUCTO CON MAYOR CANTIDAD");
        System.out.println(objI.productoMayorCantidad(inventario));
 
        // Posiciones vacías
        System.out.println("\nPOSICIONES VACÍAS");
        System.out.println("Cantidad de posiciones vacías: " + objI.contarPosicionesVacias(inventario));
    }
}