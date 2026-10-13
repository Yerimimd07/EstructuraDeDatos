public class OperacionesInventario {
 
    // Método que crea la matriz de productos (todas las posiciones quedan vacías: null)
    public Producto[][] crearInventario(int f, int c) {
        Producto[][] m = new Producto[f][c];
        return m;
    }
 
    // Método que registra un producto en una posición específica
    public String registrarProducto(Producto[][] m, int fila, int columna, Producto p) {
        // Validar que la posición exista
        if (fila < 0 || fila >= m.length || columna < 0 || columna >= m[0].length) {
            return "Error: la posición [" + fila + "][" + columna + "] no existe.";
        }
        // Validar que la posición esté libre
        if (m[fila][columna] != null) {
            return "Error: la posición [" + fila + "][" + columna + "] ya está ocupada.";
        }
        m[fila][columna] = p;
        return "Producto '" + p.getNombre() + "' registrado en fila " + fila + ", columna " + columna + ".";
    }
 
    // Método que muestra los productos indicando fila y columna
    public String imprimirInventario(Producto[][] m) {
        String cad = "";
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                cad += "Fila " + i + ", Columna " + j + " --> ";
                if (m[i][j] == null) {
                    cad += "[VACÍO]";
                } else {
                    cad += m[i][j];
                }
                cad += "\n";
            }
        }
        return cad;
    }
 
    // Método que busca un producto por código
    public String buscarProducto(Producto[][] m, int codigo) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (m[i][j] != null && m[i][j].getCodigo() == codigo) {
                    return "Producto encontrado en fila " + i + ", columna " + j + ":\n" + m[i][j];
                }
            }
        }
        return "No se encontró ningún producto con el código " + codigo + ".";
    }
 
    // Método que calcula el valor total del inventario (suma de precio x cantidad)
    public double calcularValorTotal(Producto[][] m) {
        double total = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (m[i][j] != null) {
                    total += m[i][j].getValorTotal();
                }
            }
        }
        return total;
    }
 
    // Método que identifica el producto con mayor cantidad disponible
    public String productoMayorCantidad(Producto[][] m) {
        Producto mayor = null;
        int filaMayor = -1, colMayor = -1;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (m[i][j] != null && (mayor == null || m[i][j].getCantidad() > mayor.getCantidad())) {
                    mayor = m[i][j];
                    filaMayor = i;
                    colMayor = j;
                }
            }
        }
        if (mayor == null) {
            return "El inventario está vacío.";
        }
        return "Producto con mayor cantidad (fila " + filaMayor + ", columna " + colMayor + "):\n" + mayor;
    }
 
    // Método que cuenta las posiciones vacías
    public int contarPosicionesVacias(Producto[][] m) {
        int vacias = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (m[i][j] == null) {
                    vacias++;
                }
            }
        }
        return vacias;
    }
}