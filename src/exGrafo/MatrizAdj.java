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
    //Mantém a simetria da matriz em relação ao elemento Aij
    public void simetria(int i, int j){
        //Verifica se o elemento simétrico é nulo e não é um auto-loop
        if(!M[j][i].isExistente() && i != j){
            //Pega as informações da aresta de Aij
            char c = M[i][j].getAresta().getInfo();
            Vertice origem = M[i][j].getAresta().getPonta1();
            Vertice fim = M[i][j].getAresta().getPonta2();

            //Copia as informações da aresta na ordem inversa de vértices
            M[j][i].setAresta(c, fim, origem);
        }
    }

}
