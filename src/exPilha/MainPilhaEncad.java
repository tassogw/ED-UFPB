package src.exPilha;

import java.util.Scanner;

public class MainPilhaEncad {

    public static void main(String[] args) {
        //Variáveis
        Scanner sc = new Scanner(System.in);
        int valor, op, op2;
        //Lista encadeada vazia
        PilhaEncad lista = new PilhaEncad();
        System.out.println("Pilha encadeada vazia criada!");

        //Menu
        do {
            //Pedindo a opção do usuário
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Verificar estado da lista");
            System.out.println("2 - Ver a lista detalhada");
            System.out.println("3 - Modificar lista");
            System.out.println("4 - Sair");

            op = sc.nextInt();
            switch (op){
                case 1:{
                    //Verificar estado da lista
                    if(lista.vazia()){
                        System.out.println("A lista está vazia");
                    } else {
                        System.out.println("A lista tem " + lista.getTamanho() + " elemento(s)");
                        System.out.println("Topo da lista: " + lista.getTopo());
                    }
                    break;
                }
                case 2:{
                    //Mostrar a lista
                    lista.mostra();
                    break;
                }
                case 3:{
                    //Modificar lista
                    do {
                        System.out.println("O que deseja fazer?");
                        //System.out.println("1 - Modificar um elemento");
                        System.out.println("1 - Inserir um elemento");
                        System.out.println("2 - Remover um elemento");
                        System.out.println("3 - Voltar");

                        op2 = sc.nextInt();

                        switch (op2){
                            case 1:{
                                //Inserir um elemento
                                System.out.println("Insira o novo valor");
                                valor = sc.nextInt();
                                lista.insere(valor);
                                break;
                            }
                            case 2:{
                                //Remover o elemento topo
                                if (!lista.vazia()) {
                                    System.out.println("Elemento " + lista.remove() + " removido");
                                }
                                break;
                            }
                            default:{
                                //Cancelando
                                if (op2 != 3) {
                                    System.out.println("Opção não reconhecida, tente novamente");
                                }
                                break;
                            }
                        }
                    } while (op2 != 3);
                    break;
                }
                case 4:{
                    //Sair
                    System.out.println("Saindo...");
                    break;
                }
                default:{
                    //Opção inválida
                    System.out.println("Opção não reconhecida, tente novamente");
                    break;
                }
            }

        } while (op != 4);
    }
}
