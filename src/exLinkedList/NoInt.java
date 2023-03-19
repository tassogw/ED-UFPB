package src.exLinkedList;

public class NoInt {
    //Atributos
    private int conteudo;
    private NoInt prox;

    //Construtores
    public NoInt(){
        prox = null;
    }

    public NoInt(int conteudo){
        this.conteudo = conteudo;
        prox = null;
    }

    //Métodos
    public NoInt getProx(){
        return prox;
    }

    public void setProx(NoInt valor){
        prox = valor;
    }

    public int getConteudo() {
        return conteudo;
    }

    public void setConteudo(int valor){
        conteudo = valor;
    }
}
