public class BurbujaString {
    public static void main (String[] args){
        String vector[]= {"Barrio","Casa","Auto","Zapato"};
        int nElemetos=vector.length;
        String aux;


        for(int i=0;i<nElemetos-1;i++){
            for(int j=0; j<nElemetos-1;j++){
                if(vector[j].compareTo(vector[j+1])>0){
                    aux=vector[j+1];
                    vector[j+1]=vector[j];
                    vector[j]=aux;
                }
            }
        }

        for(int i=0; i<nElemetos; i++){
            System.out.println(vector[i]);
        }
    }
}