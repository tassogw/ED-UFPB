package src.exLinkedList;

import java.util.Scanner;

public class MainListaEncad {

    public static void main(String[] args) {
        //Variáveis
        Scanner sc = new Scanner(System.in);
        int pos, valor, op, op2;
        //Lista encadeada vazia
        ListaEncad lista = new ListaEncad();
        System.out.println("Lista encadeada vazia criada!");

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
                        System.out.println("1 - Modificar um elemento");
                        System.out.println("2 - Inserir um elemento");
                        System.out.println("3 - Remover um elemento");
                        System.out.println("4 - Voltar");

                        op2 = sc.nextInt();

                        switch (op2){
                            case 1:{
                                //Modificar um elemento
                                System.out.println("Insira o novo valor");
                                valor = sc.nextInt();
                                System.out.println("Insira a posição do elemento a ser trocado");
                                pos = sc.nextInt();
                                lista.setElemento(pos, valor);
                                break;
                            }
                            case 2:{
                                //Inserir um elemento
                                System.out.println("Insira o novo valor");
                                valor = sc.nextInt();
                                System.out.println("Insira a posição do novo elemento");
                                pos = sc.nextInt();
                                lista.insere(valor, pos);
                                break;
                            }
                            case 3:{
                                //Remover um elemento
                                System.out.println("Insira a posição do elemento a ser removido");
                                pos = sc.nextInt();
                                lista.retira(pos);
                                break;
                            }
                            default:{
                                //Cancelando
                                if (op2 != 4) {
                                    System.out.println("Opção não reconhecida, tente novamente");
                                }
                                break;
                            }
                        }
                    } while (op2 != 4);
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
