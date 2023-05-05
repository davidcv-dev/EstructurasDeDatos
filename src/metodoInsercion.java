public class metodoInsercion {
    public static void main(String[] arags){
        int[] array={4,5,3,6,2,3};
        System.out.println("Array desordenado");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("");
        insertionMenorMayor(array);// metodo ordenado
        System.out.println("Array ordenado");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void insertionMenorMayor(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}