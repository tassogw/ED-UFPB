package src.exGrafo;

public class MatrizAdj {
    //private int n;
    private ElementoMatriz[][] M;

    /** Construtor **/
    public MatrizAdj(int n){
        M = new ElementoMatriz[n][n];
        //Define cada elemento da matriz como nulo
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                M[i][j] = new ElementoMatriz();
            }
        }
    }


}
