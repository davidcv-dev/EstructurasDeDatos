public class MetodoShell {
    public static void main(String[] arags){
        int[] array={4,5,3,6,2,3};
        System.out.println("Array desordenado");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("");
        shell(array);// metodo ordenado
        System.out.println("Array ordenado por el metodo shell");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
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
}

