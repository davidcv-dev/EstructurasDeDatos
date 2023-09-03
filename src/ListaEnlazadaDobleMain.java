
class NodoDoble{
    int dato;
    NodoDoble siguente;
    NodoDoble anterior;
    public NodoDoble(int dato){
        this.dato=dato;
        this.siguente=null;
        this.anterior=null;
    }
}
class ListaDobleEnlazada{
    NodoDoble cabeza;
    NodoDoble cola;
    public ListaDobleEnlazada(){
        this.cabeza=null;
        this.cola=null;
    }
    public void agregarAlFinal(int dato){
        NodoDoble nuevoNodo= new NodoDoble(dato);
        if(cola==null){
            cabeza=nuevoNodo;
            cola=nuevoNodo;
        }else {
            nuevoNodo.anterior= cola;
            cola.siguente=nuevoNodo;
            cola=nuevoNodo;
        }
    }
    public void mostrar(){
        NodoDoble actual = cabeza;
        while (actual!= null){
            System.out.println(actual.dato +" ");
            actual=actual.siguente;
        }
        System.out.println();
    }
    public void eliminar(){}

}

public class ListaEnlazadaDobleMain {
public static void main(String[] args){
    ListaDobleEnlazada lista =new ListaDobleEnlazada();
    lista.agregarAlFinal(1);
    lista.agregarAlFinal(2);
    lista.agregarAlFinal(3);
    System.out.println("datos de la lista");
    lista.mostrar();

}


}
