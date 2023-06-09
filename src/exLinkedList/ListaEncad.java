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
        /*Se a lista estiver vazia, simplesmente mudar o
        valor de cabeca*/
        if (vazia()) {
            cabeca.setConteudo(valor);
        } else { //A lista contém pelo menos um elemento
        /*Criar um novo nó que apontará para onde cabeca aponta,
        após isso, fazer com que cabeca aponte para esse nó*/
            NoInt novo = new NoInt(valor);
            novo.setProx(cabeca);
            cabeca = novo;
        }

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
        } else if ((pos == tamanho + 1)&&(!vazia())){ //Insere no fim da lista
            insereFim(valor);
        } else { //Insere no meio da lista
            insereMeio(valor, pos);
        }
    }

    public int retiraInicio(){
        /*Cria um auxiliar com o valor de cabeca e armazena seu conteúdo*/
        NoInt aux = cabeca;
        int dado = aux.getConteudo();

        /*Cabeca agora tem o valor do próximo elemento da lista, o tamanho
        é diminuído e aux é deletado */
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

        //Busca falhou
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

        if (pos == 1) { //Retira o primeiro elemento
            return retiraInicio();
        } else { //Retira um elemento no meio da lista
            return retiraMeio(pos);
        }
    }

    public void mostra(){
        NoInt aux = cabeca;
        String dash = "--------";

        //Verificando se a lista é vazia
        if(vazia()){
            System.out.println("A lista está vazia");
        } else {
            System.out.println(dash);
            while (aux != null) {
                //Imprime o atual valor e o atualiza
                System.out.println(aux.getConteudo());
                aux = aux.getProx();
            }
            System.out.println(dash);
        }
    }
}
