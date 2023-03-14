package src.exArrayList;

import java.util.Scanner;
public class MainArraySeq {

    public static void main(String[] args){
        //Variáveis
        Scanner sc = new Scanner(System.in);
        int op, op2, valor, pos;
        ArraySeq lista;

        //Criando uma lista vazia
        lista = new ArraySeq();
        System.out.println("Lista vazia criada!");

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
                    //Verificando o estado
                    if (lista.cheia()){
                        //A lista está cheia
                        System.out.println("A lista está cheia");
                    } else if (lista.vazia()) {
                        //A lista está vazia
                        System.out.println("A lista está vazia");
                    } else {
                        //A lista contém um certo número de elementos
                        System.out.printf("A lista contém " + lista.getTamAtual() + " elemento(s)%n");
                    }
                    break;
                }
                case 2:{
                    //Mostrar a lista
                    lista.mostraLista();
                    break;
                }
                case 3:{
                    do {
                        System.out.println("O que deseja fazer?");
                        System.out.println("1 - Modificar um elemento");
                        System.out.println("2 - Inserir um elemento");
                        System.out.println("3 - Remover um elemento");
                        System.out.println("4 - Voltar");

                        op2 = sc.nextInt();

                        switch (op2){
                            case 1:{
                                System.out.println("Insira o novo valor");
                                valor = sc.nextInt();
                                System.out.println("Insira a posição do elemento a ser trocado");
                                pos = sc.nextInt();
                                lista.setElemento(pos, valor);
                                break;
                            }
                            case 2:{
                                System.out.println("Insira o novo valor");
                                valor = sc.nextInt();
                                System.out.println("Insira a posição do novo elemento");
                                pos = sc.nextInt();
                                lista.insere(pos, valor);
                                break;
                            }
                            case 3:{
                                System.out.println("Insira a posição do elemento a ser removido");
                                pos = sc.nextInt();
                                lista.remove(pos);
                                break;
                            }
                            default:{
                                //System.out.println("Cancelando operação...");
                                break;
                            }
                        }
                    } while (op2 != 4);
                    break;
                }
                case 4:{
                    System.out.println("Saindo...");
                    break;
                }
                default:{
                    System.out.println("Opção não reconhecida, tente novamente");
                    break;
                }
            }
        } while (op != 4);
    }
}
