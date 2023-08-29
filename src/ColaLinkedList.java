import java.util.LinkedList;
import java.util.Queue;

public class ColaLinkedList {
    public static void main(String[] args){
      Queue<String> cola= new LinkedList<>();
      // agregar elementos a la cola
        cola.offer("Elemento1");
        cola.offer("Elemento2");
        cola.offer("Elemento3");
        System.out.println("El contenido de la cola es: "+cola);
        String elementofrontal = cola.poll();
        System.out.println("elemento frontal removido: "+elementofrontal);
        System.out.println("El contenido de la cola es: "+cola);
        String elementoFrontalActrual=cola.peek();
        System.out.println("contenido actual: "+elementoFrontalActrual);



    }
}
