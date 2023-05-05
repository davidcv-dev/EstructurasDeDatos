public class BusquedaLineal {
    public static void main(String[] args){
     int[] array={4,3,65,5,1,10};
     int valorBuscado = 5;
        int indice = busquedaLineal(array, valorBuscado);
        if(indice != -1){
            System.out.println("El valor " + valorBuscado + " está en el índice " + indice);
    }else
    {
        System.out.println("El valor " + valorBuscado + " no está en la lista");
    }


}
    public static int busquedaLineal(int[] lista, int valorBuscado) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == valorBuscado) {
                return i; // Se encontró el valor buscado, se devuelve el índice
            }
        }
        return -1; // El valor buscado no está presente en la lista
    }

    }