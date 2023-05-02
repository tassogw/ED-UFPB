package src.exGrafo;
/********************
 LISTA DE ADJACÊNCIAS
 ********************/

public class ArrayAdj {
    private int numVertices;
    private ListaAdj[] listas;

    //Construtor
    public ArrayAdj(int n){
        numVertices = n;
        listas = new ListaAdj[n];
    }

    /** Métodos **/
    //Cria o elemento Adj[u] na posição "pos" do array
    public void setVertice(int pos, char u){
        listas[pos] = new ListaAdj(u);
    }

    //Adiciona um elemento v na lista encadeada do vértice u
    public void adcAdjacente(int pos, char v){
        listas[pos].insereAdj(v);
    }

    //
}
