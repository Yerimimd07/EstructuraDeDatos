public class OperacionesMatrices {
    
    //Método que permite llenar la matriz con números enteros
    public int[][] llenarMatriz(int f, int c, int min, int max){
        int[][] m = new int[f][c]; //Declarando la matriz
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[0].length; j++){
                m[i][j] = (int)(Math.random() * (max - min - 1 ) + min);
            }
        }
        return m;
    }
    
    //Método que permite mostrar una matriz de enteros.
    public String imprimirMatriz(int[][] m){
        String cad = "";
        for(int i = 0; i < m.length; i++){
            cad += "|";
            for(int j = 0; j < m[0].length; j++){
                cad+= m[i][j] + "|";
            }
            cad+= "\n"; //Salto de línea --> \n
        }
        return cad;
    }

    //Sumar los elementos de cada fila y cada columna de una matriz.
    public String sumarFilasColumnas(int[][]m){
        for (int i = 0; i < m.length; i++){
            int sumaFilas = 0;
            for(int j = 0; j < m[0].length; j++){
                sumaFilas += m[i][j];
            }
        }
    }
    public String sumarFilasColumnas(int[][]m){
        for (int j = 0; j < m.length; j++){
            int sumaColumnas = 0;
            for(int i = 0; i < m[0].length; i++){
                sumaColumnas += m[i][j];
            }
        }
    }
}