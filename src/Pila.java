package Metodos;

public class Pila {
    String array[];
    int maxSize;
    int top;
    public Pila(int n){
      maxSize=n;
      array= new String[maxSize];
      top=0;
    }
    public boolean empty(){
        if(top==0){
            return true;
        }else{
            return false;
        }
    }
    public void push(String str){
        if(top<maxSize){
            array[top]=str;
            top++;
        }

    }
    public String peek(){
        if(top>0){
            return  array[top-1];
        }else{
           return null;
        }

    }
    public String pop(){
        String temp=null;
        if(top>0){
            temp = array[top-1];
            array[top-1]=null;
            top--;
        }
        return temp;
    }
    public static void main(String args[]){
        Pila pila= new Pila(3);
        pila.push("hola");
        System.out.println(pila.peek());
        System.out.println(pila.empty());
        System.out.println(pila.pop());
        System.out.println(pila.empty());

    }
}
