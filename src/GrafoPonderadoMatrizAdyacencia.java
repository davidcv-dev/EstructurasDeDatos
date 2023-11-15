
public class GrafoPonderadoMatrizAdyacencia {
    private int[][] matrizAdyacencia;
    private int numNodos;

    public GrafoPonderadoMatrizAdyacencia(int numNodos) {
        this.numNodos = numNodos;
        this.matrizAdyacencia = new int[numNodos][numNodos];
        for (int i = 0; i < numNodos; i++) {
            for (int j = 0; j < numNodos; j++) {
                matrizAdyacencia[i][j] = Integer.MAX_VALUE;
            }
        }
    }

    public void agregarAristas(int nodoOrigne, int nodoDestino, int peso) {
        matrizAdyacencia[nodoOrigne][nodoDestino] = peso;
        matrizAdyacencia[nodoDestino][nodoOrigne] = peso;
    }

    public void imprimirMatrizAdyacencia() {
        for (int i = 0; i < numNodos; i++) {
            for (int j = 0; j < numNodos; j++) {
                if (matrizAdyacencia[i][j] == Integer.MAX_VALUE) {
                    System.out.print("0 ");
                } else {
                    System.out.print(matrizAdyacencia[i][j] + " ");
                }

            }
            System.out.println();
        }
    }

}
 class GrafoPodnerado{
    public static void main(String[] bicho){
        int numNodos=4;
        GrafoPonderadoMatrizAdyacencia grafo= new GrafoPonderadoMatrizAdyacencia(numNodos);
        grafo.agregarAristas(0, 1,2);
        grafo.agregarAristas(0, 2, 4);
        grafo.agregarAristas(1,3,1);
        grafo.agregarAristas(2,3, 3);

        System.out.println("Matriz de adyacencia con peso:");
        grafo.imprimirMatrizAdyacencia();
    }
}
