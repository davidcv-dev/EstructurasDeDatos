public class ListaEnlazadaSimple {
    public static void main (String[] args){
        NodoListaEnlazadaSimple primero = new NodoListaEnlazadaSimple("ejemplo");
        NodoListaEnlazadaSimple segundo = new NodoListaEnlazadaSimple(34);
        NodoListaEnlazadaSimple tercero = new NodoListaEnlazadaSimple("hola");
        NodoListaEnlazadaSimple cuarto = new NodoListaEnlazadaSimple("perez");
        NodoListaEnlazadaSimple quinto = new NodoListaEnlazadaSimple(12);
        NodoListaEnlazadaSimple sexto = new NodoListaEnlazadaSimple("hola");
        NodoListaEnlazadaSimple septimo = new NodoListaEnlazadaSimple("juan");
        NodoListaEnlazadaSimple octavo = new NodoListaEnlazadaSimple(1);


       primero.enlazarNodoSiguiente(segundo);
       primero.obtenerNodoSiguente().enlazarNodoSiguiente(tercero);
        primero.obtenerNodoSiguente().obtenerNodoSiguente().enlazarNodoSiguiente(cuarto);
        primero.obtenerNodoSiguente().obtenerNodoSiguente().obtenerNodoSiguente().enlazarNodoSiguiente(quinto);
        primero.obtenerNodoSiguente().obtenerNodoSiguente().obtenerNodoSiguente().obtenerNodoSiguente().enlazarNodoSiguiente(sexto);
        primero.obtenerNodoSiguente().obtenerNodoSiguente().obtenerNodoSiguente().obtenerNodoSiguente().obtenerNodoSiguente().enlazarNodoSiguiente(septimo);
        System.out.println(primero.obtenerNodoSiguente().obtenerNodoSiguente().obtenerNodoSiguente().obtenerNodoSiguente().obtenerNodoSiguente().obtenerNodoSiguente().obtenerValor());

    }
}
