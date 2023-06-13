package src.exOrdenacao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainAlgoritmos {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/files/instanciasSorting/inst100000_1.txt"));

        int size = sc.nextInt();
        long[] array = new long[size];
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

}
