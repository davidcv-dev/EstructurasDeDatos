public class NodoArbol {
    int valor;
    NodoArbol izquierda;
    NodoArbol derecha;
    public NodoArbol(int valor){
        this.valor=valor;
        this.izquierda=null;
        this.derecha=null;
    }

}
class ArbolBinario{
    NodoArbol raiz;
    public ArbolBinario(){
        raiz=null;
    }
    public void insertar(int valor){
        raiz=insertarRec(raiz, valor);
    }
    private NodoArbol insertarRec(NodoArbol raiz, int valor){
        if(raiz == null){
            raiz= new NodoArbol(valor);
            return raiz;
        }
        if(valor<raiz.valor){
            raiz.izquierda=insertarRec(raiz.izquierda,valor);
        }else if(valor>raiz.valor){
            raiz.derecha=insertarRec(raiz.derecha, valor);
        }
        return raiz;
    }
    public void recorridoInOrden(){
        recorridoInOrdenRec(raiz);
    }

    private void recorridoInOrdenRec(NodoArbol nodo) {
        if(nodo!=null){
            recorridoInOrdenRec(nodo.izquierda);
            System.out.print(nodo.valor+" ");
            recorridoInOrdenRec(nodo.derecha);
        }
    }
    public void recorridoPosOrden(){
        recorridoPosOrdenRec(raiz);
    }

    private void recorridoPosOrdenRec(NodoArbol nodo) {
        if(nodo!=null){
            recorridoPosOrdenRec(nodo.izquierda);
            recorridoPosOrdenRec(nodo.derecha);
            System.out.print(nodo.valor+" ");
        }

    }
    public void recorridoPreOrden(){
        recorridoPreOrdenRec(raiz);
    }

    private void recorridoPreOrdenRec(NodoArbol nodo) {
        if(nodo!=null){

            System.out.print(nodo.valor+" ");
            recorridoPreOrdenRec(nodo.izquierda);
            recorridoPreOrdenRec(nodo.derecha);

        }
    }

    public static void main(String[] args){

       ArbolBinario arbolito=new ArbolBinario();
       arbolito.insertar(50);
        arbolito.insertar(30);
        arbolito.insertar(20);
        arbolito.insertar(40);
        arbolito.insertar(70);
        arbolito.insertar(60);
        arbolito.insertar(80);
        System.out.println("Recorrido InOrden del arbol");
        arbolito.recorridoInOrden();
        System.out.println(" ");
        System.out.println("Recorrido InPostOrden del arbol");
        arbolito.recorridoPosOrden();
        System.out.println(" ");
        System.out.println("Recorrido InPreOrden del arbol");
        arbolito.recorridoPreOrden();
    }
}



