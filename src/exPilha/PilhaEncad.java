package src.exPilha;

public class PilhaEncad {
    //Atributos
    private NoPilha topo;
    private int tamanho;

    //Construtor
    public PilhaEncad(){
        topo = null;
        tamanho = 0;
    }

    //Métodos

    public int getTopo() { return topo.getConteudo(); }

    public int getTamanho() { return tamanho; }

    public boolean vazia() {
        return (getTamanho() == 0);
    }

    public void insere(int dado){
        NoPilha novo = new NoPilha(dado);
        if (!vazia()){
            novo.setProx(topo);
        }
        topo = novo;
        tamanho++;
    }

    public int remove(){
        if (vazia()){
            return -1;
        }
        //NoPilha aux = topo;
        int dado = topo.getConteudo();
        topo = topo.getProx();
        //aux = null;
        tamanho--;
        return dado;
    }

    public void mostra(){
        String dash = "--------";
        if (vazia()){
            System.out.println("A lista está vazia");
        } else {
            System.out.println(dash);
            NoPilha aux = topo;
            do {
                System.out.println(aux.getConteudo());
                aux = aux.getProx();
            } while (aux != null);
            System.out.println(dash);
        }
    }
}
