package src.exArrayList;

public class ArraySeq {
    //Atributos do tipo lista
    private int dados[];
    private int tamAtual;
    private int tamMax;

    //Construtor (Lista vazia)
    public ArraySeq(){
        tamMax = 100;
        tamAtual = 0;
        dados = new int[tamMax];
    }

    //Métodos
    //Verificar se a lista está vazia
    public boolean vazia(){
        if (tamAtual == 0){
            //A lista está vazia
            return true;
        }
        //A lista não está vazia
        return false;
    }

    //Verificar se a lista está cheia
    public boolean cheia(){
        if (tamAtual == tamMax){
            //A lista está cheia
            return true;
        }
        return false;
    }

    //Retorna o tamanho atual da lista
    public int getTamAtual() {
        return tamAtual;
    }

    /* Obtém o elemento da posição i ou retorna -1
    * caso a posição seja inválida */
    public int getElemento(int pos){
        int dado;

        //Verificar a validade da posição
        if (pos < 1 || pos > tamMax){
            //Inválida
            return -1;
        }

        //Retorna o conteúdo da posição no vetor
        dado = dados[pos - 1];
        return dado;
    }

    //Alterar um elemento dada a posição
    public boolean setElemento(int pos, int valor){
        //Verificar a validade da posição
        if (pos < 1 || pos > tamMax){
            //Inválida (código de erro)
            return false;
        }

        //Modificando o dado (+ código de retorno normal)
        //int aux = dados[pos -1];
        dados[pos - 1] = valor;
        return true;
    }

    //Insere um elemento dada a posição
    public boolean insere(int pos, int valor){
        /* Verificar a validade da posição OU se
        * a lista está cheia */
        if (pos < 1 || pos > tamAtual + 1 || cheia()){
            return false;
        }

        //Deslocando todos os itens à direita
        for (int i = tamAtual; i >= pos ; i--) {
            dados[i] = dados[i - 1];
        }

        //Alterando o valor da posição
        dados[pos - 1] = valor;
        tamAtual++;

        //Código de retorno normal
        return true;
    }

    /* Remove um elemento, dada a posição, e retorna
    * seu valor. Retorna -1 caso a remoção falhe */
    public int remove(int pos){
        int dado;

        /* Verifica a validade da posição OU se
        * a lista está vazia*/
        if (pos < 1 || pos > tamAtual || vazia()){
            //Inválida (Código de erro)
            return -1;
        }

        //Pegando o valor do dado da posição dada
        dado = dados[pos -1];

        //Desloca todos os itens à esquerda
        for (int i = (pos - 1); i < tamAtual; i++) {
            dados[i] = dados[i + 1];
        }

        tamAtual--;
        return dado;
    }
}
