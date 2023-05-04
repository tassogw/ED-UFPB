package src.exGrafo;

public class Aresta {
    private char info;
    private Vertice ponta1, ponta2;

    /** Construtor **/
    public Aresta(char c){
        info = c;
        ponta1 = null;
        ponta2 = null;
    }

    /** Métodos **/
    public char getInfo() {
        return info;
    }

    public Vertice getPonta1() {
        return ponta1;
    }

    public Vertice getPonta2() {
        return ponta2;
    }

    //Cria uma aresta que conecta os vértices u e v
    public void conecta(Vertice u, Vertice v){
        ponta1 = u;
        ponta2 = v;
    }

    //Checa se as pontas são os vértices u e v em qualquer ordem (Não ordenado)
    public boolean verifica(Vertice u, Vertice v){
        if (this.ponta1 == u && this.ponta2 == v){
            return true;
        } else if (this.ponta1 == v && this.ponta2 == u) {
            return true;
        } else {
            return false;
        }
    }
}
