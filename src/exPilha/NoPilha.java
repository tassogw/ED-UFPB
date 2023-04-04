package src.exPilha;

public class NoPilha {
    //Atributos
    private int conteudo;
    NoPilha prox;

    //Construtores
    public NoPilha(){
        prox = null;
    }

    public NoPilha(int conteudo){
        this.conteudo = conteudo;
        prox = null;
    }

    //Métodos
    public NoPilha getProx() { return prox; }

    public void setProx(NoPilha prox) { this.prox = prox; }

    public int getConteudo() { return conteudo; }

    //public void setConteudo(int conteudo) { this.conteudo = conteudo; }
}
