package Metodos;

import java.util.Stack;

public class PilaStack {
    public static void main(String args[]){
        Stack pila= new Stack();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.push(40);
        pila.push(50);
        System.out.println("el tamaño de nuestra pila es: "+pila.size());
        System.out.println("el ultimo elemento es: "+ pila.peek());
        System.out.println("sacando elementos de la pila: "+ pila.pop());
        System.out.println("sacando elementos de la pila: "+ pila.pop());
        System.out.println("el ultimo elemento es: "+ pila.peek());
        System.out.println("el tamaño de nuestra pila es: "+pila.size());
    }
}
