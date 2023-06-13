package src.exOrdenacao;

public class Algoritmos implements Runnable{
    private int id;
    private long[] array;
    private long tempoInicial, tempoFinal;
    private String sort;

    //Construtor
    public Algoritmos(int id, long[] array){
        this.id = id;
        this.array = array;
    }

    @Override
    public void run() {
        //De acordo com o id, escolher o algoritmo
        switch (id){
            //Selection Sort
            case 1: {
                sort = "Selection Sort";
                tempoInicial = System.nanoTime();
                array = SelectionSort(array);
                tempoFinal = System.nanoTime();
                break;
            }

            //Bubble Sort
            case 2: {
                sort = "Bubble Sort";
                tempoInicial = System.nanoTime();
                array = BubbleSort(array);
                tempoFinal = System.nanoTime();
                break;
            }

            //Insertion Sort
            case 3: {
                sort = "Insertion Sort";
                tempoInicial = System.nanoTime();
                array = InsertionSort(array);
                tempoFinal = System.nanoTime();
                break;
            }

            //Merge Sort
            case 4: {
                sort = "Merge Sort";
                tempoInicial = System.nanoTime();
                array = MergeSort(0, array.length, array);
                tempoFinal = System.nanoTime();
                break;
            }

            //Quick Sort
            case 5: {
                sort = "Quick Sort";
                tempoInicial = System.nanoTime();
                array = QuickSort(array, 0, array.length - 1);
                tempoFinal = System.nanoTime();
                break;
            }
        }
        long tempoTotal = tempoFinal - tempoInicial;
        showTime(this.array, tempoTotal);
    }

    //Marcador de tempo
    public synchronized void showTime(long[] array, long tempoTotal){
        System.out.println(sort + ":");
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1){
                System.out.printf("%d, ", array[i]);
            } else {
                System.out.printf("%d]\n", array[i]);
            }
        }
        System.out.printf("Tempo de execução: %dms%n", tempoTotal / 1000);
        System.out.println(); //Pula uma linha
    }

    //Métodos de ordenação
    public long[] SelectionSort(long[] array){
        int size = array.length, min;
        long aux;

        for (int i = 0; i <= size - 2; i++) {
            min = i;
            for (int j = i + 1; j <= size - 1; j++) {
                if (array[j] < array[min]){
                    min = j;
                }
            }
            aux = array[min];
            array[min] = array[i];
            array[i] = aux;
        }

        return array;
    }

    public long[] BubbleSort(long[] array){
        int size = array.length;
        long aux;

        for (int i = 0; i <= size - 1; i++) {
            for (int j = i + 1; j <= size - 1; j++) {
                if (array[i] > array[j]){
                    aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }

        return array;
    }

    public long[] InsertionSort(long[] array){
        int size = array.length, aux;
        long current;
        for (int i = 1; i <= size - 1; i++) {
            current = array[i];
            aux = i;
            while (aux > 0 && array[aux - 1] > current){
                array[aux] = array[aux - 1];
                --aux;
            }
            array[aux] = current;
        }

        return array;
    }

    public long[] MergeSort(int start, int end, long[] array){
        if(start < end - 1){
            int mid = (start + end) / 2;
            MergeSort(start, mid - 1, array);
            MergeSort(mid, end, array);
            array = merge(start, mid, end, array);
        }

        return array;
    }

    public long[] merge(int start, int mid, int end, long[] array){
        long[] newArray = new long[end - start];
        int i = start, j = mid, k = 0;
        while ((i < mid) && (j < end)){
            if (array[i] <= array[j]){
                newArray[k] = array[i];
                k++;
                i++;
            }
            else {
                newArray[k] = array[j];
                k++;
                j++;
            }
        }

        while (i < mid){
            newArray[k] = array[i];
            k++;
            i++;
        }
        while (j < end){
            newArray[k] = array[j];
            k++;
            j++;
        }

        for (int l = start; l < end; l++) {
            array[l] = newArray[l - start];
        }

        return array;
    }

    public long[] QuickSort(long[] array, int start, int end){
        if (start < end){
            int part = partition(array, start, end);
            QuickSort(array, start, part - 1);
            QuickSort(array, part + 1, end);
        }

        return array;
    }

    public int partition(long[] array, int start, int end){
        long x = array[start], aux;
        int a = start + 1, b = end;
        while (array[b] > x){
            b--;
        }
        while (array[a] < x){
            a++;
        }
        if(a <= b){
            //swap(a,b)
            aux = array[a];
            array[a] = array[b];
            array[b] = aux;
        } else {
            //swap(p, b)
            aux = array[start];
            array[start] = array[b];
            array[b] = aux;
        }
        return b;
    }

}
