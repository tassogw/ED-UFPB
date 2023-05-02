package src.exGrafo;
public class Vertice {
    private char info;
    private Vertice adjacente;

    //Construtor
    public Vertice(char c){
        this.info = c;
        this.adjacente = null;
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
