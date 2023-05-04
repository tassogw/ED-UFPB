package src.exGrafo;

public class MainGrafo {
    public static void main(String[] args){
        /** LISTA DE ADJACÊNCIA **/
        System.out.println("Criando lista de adjacência...");
        ArrayAdj lista = new ArrayAdj(4);

        //Adjacência de vértices:
        /*
        * u -> v, w
        * v -> u, w
        * w -> u, v, x
        * x -> w
        */
        lista.adcAdjacente(1, 'v');
        lista.adcAdjacente(1, 'w');

        lista.adcAdjacente(2, 'u');
        lista.adcAdjacente(2, 'w');

        lista.adcAdjacente(3, 'u');
        lista.adcAdjacente(3, 'v');
        lista.adcAdjacente(3, 'x');

        lista.adcAdjacente(4, 'w');

        //...

        /** MATRIZ DE ADJACÊNCIA **/
        System.out.println("Criando matriz de adjacência...");
        MatrizAdj matriz = new MatrizAdj(4);

        //Cria os vértices
        Vertice vA, vB, vC, vD;
        vA = new Vertice('a', 1);
        vB = new Vertice('b', 2);
        vC = new Vertice('c', 3);
        vD = new Vertice('d', 4);

        //Matriz:
        /*   a b c d
        * a  0 1 0 0
        * b  1 0 1 1
        * c  0 1 0 0
        * d  0 1 0 0
        * } */

        //
    }
}
