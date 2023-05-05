import javax.swing.*;
import java.util.Scanner;

public class BurbujaConDIalogo {
    public static void main (String[] args){
        Scanner entrada= new Scanner(System.in);
        int vector[], nElemetos;
        int aux;
        nElemetos=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de elementos"));
        vector=new int[nElemetos];
        for (int i=0; i<nElemetos;i++){
            System.out.println("ingrese un numero");
            vector[i]=entrada.nextInt();
        }

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
