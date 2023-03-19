package src.exLinkedList;

public class ListaEncad {
    //Atributos
    private NoInt cabeca;
    private int tamanho;

    //Construtor (cria lista vazia)
    public ListaEncad(){
        cabeca = new NoInt();
        tamanho = 0;
    }

    //Métodos
    public boolean vazia(){
        if (tamanho > 0) {return false;} //Lista não vazia
        return true; //Lista vazia
    }

    public int getTamanho(){
        return tamanho;
    }

    public int getElemento(int pos){
        //Iniciar um contador e um apontador pro proximo elemento
        int count = 1;
        NoInt seguinte = cabeca;

        //Checar se a posição é válida
        if ((pos < 1) || (vazia()) || (pos > tamanho)){
            //Código de erro
            return -1;
        }

        //Iniciando a busca
        while (count < pos){
            seguinte = seguinte.getProx();
            count++;
        }

        //Retornando seu valor
        int aux = seguinte.getConteudo();
        return aux;
    }

    public int setElemento(int valor, int pos){
        //Iniciar um contador e um apontador pro proximo elemento
        int count = 1;
        NoInt seguinte = cabeca;

        //Checar se a posição é válida
        if ((pos < 1) || (vazia()) || (pos > tamanho)){
            //Código de erro
            return -1;
        }

        //Iniciando a busca
        while (count < pos){
            seguinte = seguinte.getProx();
            count++;
        }

        //Alterando o elemento e retornando seu valor
        int aux = seguinte.getConteudo();
        seguinte.setConteudo(valor);
        return aux;
    }

    public boolean insereComeco(int valor){
        /*Criar um novo nó que apontará para onde cabeca aponta,
        após isso, fazer com que cabeca aponte para esse nó*/
        NoInt novo = new NoInt(valor);
        novo.setProx(cabeca.getProx());
        cabeca.setProx(novo);
        tamanho++;

        return true;
    }

    public boolean insereMeio(int valor, int pos){
        //Cria o novo nó com o valor dado
        NoInt novo = new NoInt(valor);

        //Iniciar um contador e um apontador pro proximo elemento
        int count = 1;
        NoInt aux = cabeca;

        /*Inicia a busca pela posição anterior a posição
        em que queremos inserir o novo elemento*/
        while ((count < pos - 1)&&(aux != null)){
            aux = aux.getProx();
            count++;
        }

        //Não existe próximo elemento
        if (aux == null){return false;}

        /*Definindo o apontador do novo nó, que
        apontará para o elemento que aux aponta*/
        novo.setProx(aux.getProx());
        aux.setProx(novo); //Aux agora aponta para o novo elemento
        tamanho++;

        return true;
    }

    public boolean insereFim(int valor){
        //Criar o novo nó com o valor dado
        NoInt novo = new NoInt(valor);

        /*Procura o fim da lista varrendo-a, verificando se o
        elemento aponta para null */
        NoInt aux = cabeca;
        while (aux != null){
            aux = aux.getProx();
        }

        /*Define o apontador de novo para null e faz com que
        aux aponte para novo*/
        novo.setProx(null);
        aux.setProx(novo);
        tamanho++;
        return true;
    }

    public void insere(int valor, int pos){
        if (pos == 1){ //Inserir no começo
            insereComeco(valor);
        } else if (pos == tamanho + 1){ //Insere no fim da lista
            insereFim(valor);
        } else { //Insere no meio da lista
            insereMeio(valor, pos);
        }
    }

    public int retiraInicio(){
        /*Muda o elemento cabeca, passando a ser o
        segundo elemento da lista*/
        NoInt aux = cabeca;
        int dado = aux.getConteudo();

        cabeca = aux.getProx();
        tamanho--;

        aux = null;
        return dado;
    }

    public int retiraMeio(int pos){
        //Iniciando o contador e os auxiliares
        int count = 1, dado = -1;
        NoInt aux = cabeca;
        NoInt anterior = null;

        //Verificar se a posição é inválida
        if ((pos < 1) || (pos > tamanho) || (vazia())){
            return -1;
        }

        //Buscando o elemento na posição dada
        while ((count < pos) && (aux != null)){
            anterior = aux;
            aux = aux.getProx();
            count++;
        }

        if (aux == null){return -1;}

        //Retirar o elemento  (aux)
        dado = aux.getConteudo();
        anterior.setProx(aux.getProx());
        tamanho--;

        //Forçando a retirada do atual da memória
        aux = null;
        return dado;
    }

    public int retira(int pos){
        if(vazia()) {return -1;}

        if (pos == 1) {
            return retiraInicio();
        } else {
            return retiraMeio(pos);
        }
    }

    //Método de imprimir a lista
}
