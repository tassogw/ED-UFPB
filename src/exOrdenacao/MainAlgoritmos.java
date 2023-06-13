package src.exOrdenacao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainAlgoritmos {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner askFile = new Scanner(System.in);
        int fileNum;
        System.out.print("Insira o número do arquivo desejado (1 a 12): ");
        fileNum = askFile.nextInt();
        String pathname = getFile(fileNum);

        System.out.println("Executando o arquivo " + pathname);
        Scanner sc = new Scanner(new File(pathname));

        //Definir o tamanho do vetor baseado na primeira linha do arquivo
        int size = sc.nextInt();
        long[] array = new long[size];

        //Ler o arquivo e adicionar os valores ao vetor
        int i = 0;
        while (sc.hasNextLong()){
            array[i++] = sc.nextLong();
        }

        //Exibir o vetor
        System.out.println("Vetor original:");
        showVector(array);

        //Iniciar todas as threads de algoritmos
        for (int j = 1; j <= 5; j++) {
            new Algoritmos(j, array).run();
        }
    }

    public static void showVector(long[] array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1){
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i] + "]\n");
            }
        }
        System.out.println();
    }

    public static String getFile(int n){
        String file = switch (n) {
            default -> "src/files/instanciasSorting/inst1000_1.txt";
            case 2 -> "src/files/instanciasSorting/inst1000_2.txt";
            case 3 -> "src/files/instanciasSorting/inst1000_3.txt";
            case 4 -> "src/files/instanciasSorting/inst1000_4.txt";
            case 5 -> "src/files/instanciasSorting/inst10000_1.txt";
            case 6 -> "src/files/instanciasSorting/inst10000_2.txt";
            case 7 -> "src/files/instanciasSorting/inst10000_3.txt";
            case 8 -> "src/files/instanciasSorting/inst10000_4.txt";
            case 9 -> "src/files/instanciasSorting/inst100000_1.txt";
            case 10 -> "src/files/instanciasSorting/inst100000_2.txt";
            case 11 -> "src/files/instanciasSorting/inst100000_3.txt";
            case 12 -> "src/files/instanciasSorting/inst100000_4.txt";
        };

        return file;
    }

}
