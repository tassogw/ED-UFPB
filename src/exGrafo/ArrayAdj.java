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
    /** Posição 1 = Elemento 0 do array **/
    public boolean setVertice(int pos, char u){
        if (pos < 1 || pos > listas.length){
            //Posição inválida
            return false;
        }
        listas[pos - 1] = new ListaAdj(u);
        return true;
    }

    //Adiciona um elemento v na lista encadeada do vértice u
    /** Posição 1 = Elemento 0 do array **/
    public boolean adcAdjacente(int pos, char v){
        if (pos < 1 || pos > listas.length){
            //Posição inválida
            return false;
        }
        listas[pos - 1].insereAdj(v);
        return true;
    }


}
