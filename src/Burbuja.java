import java.util.Scanner;

public class Burbuja {
    public static void main (String[] args){
        int vector[]= {2,1,5,3,7,8};
        int nElemetos=vector.length;
        int aux;


        for(int i=0;i<nElemetos-1;i++){
            for(int j=0; j<nElemetos-1;j++){
                if(vector[j]>vector[j+1]){
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