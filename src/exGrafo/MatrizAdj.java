package src.exGrafo;
/*********************
 MATRIZ DE ADJACÊNCIAS
 *********************/

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

    /** Métodos **/
    //Define uma aresta e altera os elementos Aij e Aji
    public void conecta(int i, int j, char c, Vertice u, Vertice v){
        //Define os elementos de Aij
        M[i][j].setAresta(c, u, v);
        //Verifica se o elemento simétrico é nulo e não é um auto-loop
        if(!M[j][i].isExistente() && i != j){
            //Define os elementos de Aji
            M[j][i].setAresta(c, v, u);
        }
    }

}
