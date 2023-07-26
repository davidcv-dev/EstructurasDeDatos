public class Cola {
    private int[] array;
    private int frente; // Índice del frente de la cola
    private int tamaño; // Tamaño actual de la cola

    public Cola(int capacidad) {
        array = new int[capacidad];
        frente = 0;
        tamaño = 0;
    }

    // Método para verificar si la cola está vacía
    public boolean estaVacia() {
        return tamaño == 0;
    }

    // Método para verificar si la cola está llena
    public boolean estaLlena() {
        return tamaño == array.length;
    }

    // Método para obtener el tamaño de la cola
    public int tamaño() {
        return tamaño;
    }

    // Método para agregar un elemento al final de la cola
    public void encolar(int dato) {
        if (estaLlena()) {
            throw new IllegalStateException("La cola está llena");
        }
        array[frente + tamaño] = dato;
        tamaño++;
    }

    // Método para eliminar y obtener el elemento del frente de la cola
    public int desencolar() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        int dato = array[frente];
        frente++;
        tamaño--;
        return dato;
    }

    // Método para obtener el elemento en el frente de la cola sin eliminarlo
    public int frente() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return array[frente];
    }
}
