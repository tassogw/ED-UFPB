package src.exOrdenacao;

import java.util.Scanner;

public class MainAlgoritmos {

    public static void main(String[] args) {
        int[] array;
        int size;
        Scanner sc = new Scanner(System.in);

        //Pedir o tamanho do vetor
        System.out.print("Insira o tamanho do vetor: ");
        size = sc.nextInt();
        array = new int[size];

        //Colocar os elementos do vetor
        for (int i = 0; i < size; i++) {
            System.out.printf("Insira o elemento %d/%d do vetor: ", i + 1, size);
            array[i] = sc.nextInt();
        }

        //Exibir o vetor
        System.out.println("Vetor original:");
        showVector(array);

        //Iniciar todas as threads de algoritmos
        for (int i = 1; i <= 5; i++) {
            new Algoritmos(i, array).run();
        }
    }

    public static void showVector(int[] array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1){
                System.out.printf("%d, ", array[i]);
            } else {
                System.out.printf("%d]\n", array[i]);
            }
        }
    }

}
