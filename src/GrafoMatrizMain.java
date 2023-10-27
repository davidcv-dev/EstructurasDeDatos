
class GrafoMatrizAdyacencia{
   private int[][] matrizadyacencia;
   private int numNodo;

   public GrafoMatrizAdyacencia(int numNodo){
       this.numNodo=numNodo;
       this.matrizadyacencia=new int[numNodo][numNodo];
   }
   public void agregarAristas(int nodoOrigen, int nodoDestino){
       matrizadyacencia[nodoOrigen][nodoDestino]=1;
       matrizadyacencia[nodoDestino][nodoOrigen]=1;
   }
   public void imprimirMatrizAdyacencia(){
       for(int i=0; i<numNodo; i++){
           for(int j=0; j<numNodo; j++){
               System.out.print(matrizadyacencia[i][j]+" ");
           }
           System.out.println();
       }
   }
}

public class GrafoMatrizMain {
    public static void main(String[] vicho){
        int numNodo=5;
        GrafoMatrizAdyacencia grafo=new GrafoMatrizAdyacencia(numNodo);
        grafo.agregarAristas(0,1);
        grafo.agregarAristas(0,2);
        grafo.agregarAristas(0, 3);
        grafo.agregarAristas(2,4);
        grafo.agregarAristas(1,3);
        grafo.agregarAristas(4,3);
        System.out.println("Matriz de Adyacencia:");
        grafo.imprimirMatrizAdyacencia();

    }

}
