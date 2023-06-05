package src.exOrdenacao;

public class Algoritmos implements Runnable{
    private int id;
    private int[] array;
    private long tempoInicial, tempoFinal;
    private String sort;

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
                sort = "Selection Sort";
                tempoInicial = System.currentTimeMillis();
                SelectionSort(array);
                tempoFinal = System.currentTimeMillis();
                break;
            }

            //Bubble Sort
            case 2: {
                sort = "Bubble Sort";
                tempoInicial = System.currentTimeMillis();
                BubbleSort(array);
                tempoFinal = System.currentTimeMillis();
                break;
            }

            //Insertion Sort
            case 3: {
                sort = "Insertion Sort";
                tempoInicial = System.currentTimeMillis();
                InsertionSort(array);
                tempoFinal = System.currentTimeMillis();
                break;
            }

            //Merge Sort
            case 4: {
                sort = "Merge Sort";
                tempoInicial = System.currentTimeMillis();
                //MergeSort(array);
                tempoFinal = System.currentTimeMillis();
                break;
            }

            //Quick Sort
            case 5: {
                sort = "Quick Sort";
                tempoInicial = System.currentTimeMillis();
                //QuickSort(array);
                tempoFinal = System.currentTimeMillis();
                break;
            }
        }
    }

    //Marcador de tempo
    public synchronized void showTime(){
        long tempoTotal = tempoFinal - tempoInicial;
        System.out.println(sort);
        System.out.println("Tempo de execução: " + tempoTotal + "ms");
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

    public int[] BubbleSort(int[] array){
        int[] sorted = array;
        int size = array.length;
        int aux;

        for (int i = 0; i <= size - 1; i++) {
            for (int j = i + 1; j <= size - 1; j++) {
                if (sorted[i] > sorted[j]){
                    aux = sorted[i];
                    sorted[i] = sorted[j];
                    sorted[j] = aux;
                }
            }
        }

        return sorted;
    }

    public int[] InsertionSort(int[] array){
        int[] sorted = array;
        int size = array.length;
        int aux, current;
        //35142
        for (int i = 1; i <= size - 1; i++) {
            current = sorted[i];
            aux = i;
            while (aux > 0 && sorted[aux - 1] > current){
                sorted[aux] = sorted[aux - 1];
                --aux;
            }
            sorted[aux] = current;
        }

        return sorted;
    }

}
