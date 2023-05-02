package src.exGrafo;

public class ListaAdj {
    private Vertice cabeca;
    //private char vertInfo;
    private int tamanho;

    //Construtor
    public ListaAdj(char c){
        //this.vertInfo = c;
        cabeca = new Vertice(c);
        //tamanho = 0;
    }

    //Métodos
    /*
    public char getVertInfo() {
        return vertInfo;
    }
    */

    public int getTamanho(){
        return tamanho;
    }

    public boolean vazia(){
        if (tamanho > 0) {return false;} //Lista não vazia
        return true; //Lista vazia
    }

    public boolean insereAdj(char info){
        //Insere sempre no fim
        Vertice adj = new Vertice(info);
        Vertice aux = cabeca;

        while (aux.getAdjacente() != null){
            aux = aux.getAdjacente();
        }

        adj.setAdjacente(null);
        aux.setAdjacente(adj);
        tamanho++;
        return true;
    }

    public boolean buscaAdj(char info){
        if(vazia()){ return false; }
        Vertice aux = cabeca;

        while (aux != null){
            aux = aux.getAdjacente();
            if(aux.getInfo() == info){ return true; }
        }
        return false;
    }



}
