class NodoCircular{
  int valor;
  NodoCircular siguiente;
  public NodoCircular(int valor){
      this.valor=valor;
      this.siguiente=null;
  }
}
class ListaEnlazadaCiruclar{
    NodoCircular cabeza;
    public ListaEnlazadaCiruclar(){
        this.cabeza=null;
    }
    public void agregarAlFinal(int valor){
        NodoCircular nodoNuevo= new NodoCircular(valor);
        if(cabeza== null){
            cabeza=nodoNuevo;
            nodoNuevo.siguiente=cabeza;
        }else {
            NodoCircular actual=cabeza;
            while (actual.siguiente!=cabeza){
                actual=actual.siguiente;
            }
            actual.siguiente=nodoNuevo;
            nodoNuevo.siguiente=cabeza;
        }
    }
    public void mostrar(){
        if (cabeza==null){
            System.out.println("La lista esta Vacia");
            return;
        }
        NodoCircular actual=cabeza;
        do{
            System.out.println(actual.valor+" ");
            actual= actual.siguiente;
        }while (actual!=cabeza);
        System.out.println();
    }

}
public class ListaEnlazadaCircularMain {
    public static void main(String[] args){
        ListaEnlazadaCiruclar lista =new ListaEnlazadaCiruclar();
        lista.agregarAlFinal(1);
        lista.agregarAlFinal(2);
        lista.agregarAlFinal(3);
        System.out.println("lista de enlaze circular");
        lista.mostrar();
    }
}
