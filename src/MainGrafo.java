public class MainGrafo {
    public static void main(String[] args){
        //Crear Nodos
        NodoGrafo nodo1=new NodoGrafo(1);
        NodoGrafo nodo2=new NodoGrafo(2);
        NodoGrafo nodo3=new NodoGrafo(3);
        NodoGrafo nodo4=new NodoGrafo(4);
        NodoGrafo nodo5=new NodoGrafo(5);

        //Creando un Grafo
        Grafo grafo=new Grafo();
        //agregar nodos al grafo
        grafo.agregarNodo(nodo1);
        grafo.agregarNodo(nodo2);
        grafo.agregarNodo(nodo3);
        grafo.agregarNodo(nodo4);
        grafo.agregarNodo(nodo5);

        //agregar aristas o arcos
        nodo1.agregarVecino(nodo2);
        nodo1.agregarVecino(nodo3);
        nodo1.agregarVecino(nodo4);
        nodo2.agregarVecino(nodo4);
        nodo3.agregarVecino(nodo5);
        nodo4.agregarVecino(nodo5);


        System.out.println("Vecinos del nodo5");

        for(NodoGrafo vecino : nodo5.vecinos){
            System.out.println(vecino.valor);
        }


    }
}
