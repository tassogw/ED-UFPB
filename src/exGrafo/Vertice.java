package src.exGrafo;
public class Vertice {
    //Usado em Matriz de adjacências
    private int indice;
    private char info;
    private Vertice adjacente;

    /** Construtores **/
    //Para lista de adjacências
    public Vertice(char c){
        info = c;
        adjacente = null;
    }

    //Para matriz de adjacências
    public Vertice(char c, int i){
        info = c;
        indice = i;
    }

    public char getInfo() {
        return info;
    }

    public Vertice getAdjacente(){
        return adjacente;
    }

    public void setAdjacente(Vertice adj) {
        this.adjacente = adj;
    }
}
