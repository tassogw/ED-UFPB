package src.exOrdenacao;

public class Algoritmos implements Runnable{
    private int id;
    private int[] array;
    private int tempoInicial, tempoFinal, tempoTotal;

    //Construtor
    public Algoritmos(int id, int[] array){
        this.id = id;
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public int getId() {
        return id;
    }

    @Override
    public void run() {
        //De acordo com o id, escolher o algoritmo
        switch (id){
            //Selection Sort
            case 1: {

            }

            //Bubble Sort
            case 2: {

            }

            //Insertion Sort
            case 3: {

            }

            //Merge Sort
            case 4: {

            }

            //Quick Sort
            case 5: {

            }
        }
    }

    //Métodos de ordenação
    public int[] SelectionSort(int[] array){
        int[] sorted = array;
        int size = array.length;
        int min, aux;

        for (int i = 0; i <= size - 2; i++) {
            min = i;
            for (int j = i + 1; j <= size - 1; j++) {
                if (sorted[j] < sorted[min]){
                    min = j;
                }
            }
            aux = sorted[min];
            sorted[min] = sorted[i];
            sorted[i] = aux;
        }

        return sorted;
    }

}
