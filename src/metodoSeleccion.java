public class metodoSeleccion {
    public static void main(String[] arags){
        int[] array={4,5,3,6,2,3};
        System.out.println("Array desordenado");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("");
        shell(array);// metodo ordenado
        System.out.println("Array ordenado");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }

    public static void seleccionMenorMayor(int array[]){
        for(int i=0;i<array.length-1;i++){
            int min=i;
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[min]){
                    min=j;
                }
            }
            int aux=array[i];
            array[i]=array[min];
            array[min]=aux;
        }

    }
    public static void ordenacionShell(int a[]) {
        int intervalo, i, j, k;
        int n= a.length;
        int temp;
        intervalo = n / 2;
        while (intervalo > 0)
        {
            for (i = intervalo; i < n; i++)
            {
                j = i - intervalo;
                while (j >= 0)
                {
                    k = j + intervalo;
                    if (a[j] <= a[k])
                        j = -1; // par de elementos ordenado
                    else
                    {
                        temp = a[j];
                        a[j] = a[k];
                        a[k] = temp;
                        j -= intervalo;
                    }
                }
            }
            intervalo = intervalo / 2;
        }
    }
    public static void ordenacionShellotra(int[] a) {
        int n = a.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = a[i];
                int j;
                for (j = i; j >= gap && a[j - gap] > temp; j -= gap) {
                    a[j] = a[j - gap];
                }
                a[j] = temp;
            }
        }
    }

    public static void shell(int A[]){
        int salto, aux, i;
        boolean cambios;
        for(salto=A.length/2; salto!=0; salto/=2){
            cambios=true;
            while(cambios){ // Mientras se intercambie algún elemento
                cambios=false;
                for(i=salto; i< A.length; i++) // se da una pasada
                    if(A[i-salto]>A[i]){ // y si están desordenados
                        aux=A[i]; // se reordenan
                        A[i]=A[i-salto];
                        A[i-salto]=aux;
                        cambios=true; // y se marca como cambio.
                    }
            }
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
