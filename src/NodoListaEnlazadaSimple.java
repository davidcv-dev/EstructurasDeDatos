public class NodoListaEnlazadaSimple {
    Object valor;
    NodoListaEnlazadaSimple siguiente;
    public NodoListaEnlazadaSimple(Object valor){
        this.valor=valor;
        this.siguiente=null;
    }
    public void enlazarNodoSiguiente(NodoListaEnlazadaSimple n){
      siguiente=n;
    }
    public NodoListaEnlazadaSimple obtenerNodoSiguente(){
        return siguiente;
    }
    public Object obtenerValor(){
        return valor;
    }

}
