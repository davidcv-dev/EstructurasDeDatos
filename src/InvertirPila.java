package Metodos;

import java.util.Stack;

public class InvertirPila {
    public static Stack invertirPila(Stack<Integer> pila){
        Stack<Integer> pilaAux= new Stack<>();
        while (!pila.isEmpty()){
            pilaAux.push(pila.pop());
        }
    return pilaAux;

    }

    public static void main(String args []){
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);

        System.out.println("pila original: "+ pila);
        System.out.println("pila invertida: "+ invertirPila(pila));


    }
}
