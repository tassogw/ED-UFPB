package src.exGrafo;

public class ElementoMatriz {
    //Ponteiro para a aresta
    private Aresta aresta;
    //Indica se existe a aresta apontada pelo elemento
    private boolean existente;

    /** Construtor **/
    public ElementoMatriz(){
        aresta = null;
        existente = false;
    }

    /** Métodos **/
    public boolean isExistente() {
        return existente;
    }

    public Aresta getAresta() {
        return aresta;
    }

    //Cria uma aresta que conecta os vértices u e v

    public void setAresta(char c, Vertice u, Vertice v) {
        this.aresta = new Aresta(c, u, v);
        existente = true;
    }
}
