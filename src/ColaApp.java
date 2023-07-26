public class ColaApp {
    public static void main(String[] args) {
        Cola cola = new Cola(5);

        cola.encolar(10);
        cola.encolar(20);
        cola.encolar(30);

        System.out.println("Tamaño de la cola: " + cola.tamaño());
        System.out.println("Elemento en el frente de la cola: " + cola.frente());

        cola.desencolar();

        System.out.println("Tamaño de la cola después de desencolar: " + cola.tamaño());
        System.out.println("Elemento en el frente de la cola después de desencolar: " + cola.frente());
    }
}
