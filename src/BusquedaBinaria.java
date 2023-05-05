public class BusquedaBinaria {
    public static void main(String args[]){
        int[] lista = {1,2,3,4,5,6,7,8,9};
        int valorBuscado = 6;
        int indice = busquedaBinaria(lista, valorBuscado);
        if (indice != -1) {
            System.out.println("El valor " + valorBuscado + " está en el índice " + indice);
        } else {
            System.out.println("El valor " + valorBuscado + " no está en la lista");
        }
    }


    public static int busquedaBinaria(int[] lista, int valorBuscado) {
        int inicio = 0;
        int fin = lista.length - 1;
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            if (lista[medio] == valorBuscado) {
                return medio; // Se encontró el valor buscado, se devuelve el índice
            } else if (valorBuscado < lista[medio]) {
                fin = medio - 1; // Se busca en la mitad inferior de la lista
            } else {
                inicio = medio + 1; // Se busca en la mitad superior de la lista
            }
        }
        return -1; // El valor buscado no está presente en la lista
    }

}
