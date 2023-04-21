package practicaguiadamenu;

public class Pila {

    public Nodo pila;

    public Pila() {
        pila = null;
    }

    public void push(int v) {
        Nodo nuevo = new Nodo(v);
        if (pila == null) {
            pila = nuevo;
        } else {
            Nodo aux = pila;
            pila = nuevo;
            nuevo.setNodoSiguiente(aux);
        }
    }

    public void recorrerPila() {
        Nodo aux = pila;
        if (pila == null) {
            System.out.println("La pila está vacía.");
        } else {
            while (aux != null) {
                System.out.println("Valor: " + aux.getValor());
                aux = aux.getNodoSiguiente();
            }
        }
    }

    public void pop() {
        Nodo aux = pila;
        if (pila == null) {
            System.out.println("La pila está vacía.");
        } else {
            if (aux.getNodoSiguiente() == null) {
                pila = null;
            } else {
                pila = aux.getNodoSiguiente();
            }
        }
    }

}
