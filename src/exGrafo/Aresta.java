package src.exGrafo;

public class Aresta {
    private char info;
    private Vertice ponta1, ponta2;

    /** Construtores **/
    public Aresta(char c){
        info = c;
        ponta1 = null;
        ponta2 = null;
    }

    //Cria uma aresta que conecta os vértices u e v
    public Aresta(char c, Vertice u, Vertice v){
        info = c;
        ponta1 = u;
        ponta2 = v;
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
