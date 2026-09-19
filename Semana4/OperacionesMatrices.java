package Semana4;

public class OperacionesMatrices {

    public int[][] llenarMatriz(in l, int c, int min, int max){
        int[][] m= new int[l][c]; //declarando la matriz
        for (int i=0;i< m.length; i ++){
            for|(int j=0; j< m[0].length; j++ ){
                m[i][j] - (int)(Math.random() *(max - min -1)+ min);
            }
        }
        return m;
    }

}

    // metodo que permita mostrar la matriz
    public String imprimirMatriz(int[][] m) {
        String cad = "";
        for (int i = 0; i < m.length; i++) {
            cad += "|";
            for (int j = 0; j < m[0].length; j++) {
                cad += m[i][j] + "|";
            }
            cad += "\n"; // Salto de línea --> \n
        }
        return cad;
    }
}