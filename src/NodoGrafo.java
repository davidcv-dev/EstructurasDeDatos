import java.util.ArrayList;
import java.util.List;
public class NodoGrafo {
    int valor;
    List<NodoGrafo> vecinos;
    public NodoGrafo(int valor){
        this.valor=valor;
        this.vecinos = new ArrayList<>();
    }
    public void agregarVecino(NodoGrafo vecino){
        vecinos.add(vecino);
        vecino.vecinos.add(this);
    }
}
class Grafo{
    List<NodoGrafo> nodos;
    public Grafo(){
        this.nodos=new ArrayList<>();
    }
    public void agregarNodo(NodoGrafo nodo){
        nodos.add(nodo);
    }

}

