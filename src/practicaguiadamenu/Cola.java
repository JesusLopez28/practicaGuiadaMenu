package practicaguiadamenu;

public class Cola {

    public Nodo cola;

    public Cola() {
        cola = null;
    }

    public void encolar(int v) {
        Nodo nuevo = new Nodo(v);
        if (cola == null) {
            cola = nuevo;
        } else {
            Nodo aux = cola;
            while (aux.getNodoSiguiente() != null) {
                aux = aux.getNodoSiguiente();
            }
            aux.setNodoSiguiente(nuevo);
        }
    }

    public void recorrerCola() {
        Nodo aux = cola;
        if (cola == null) {
            System.out.println("La cola está vacía.");
        } else {
            while (aux != null) {
                System.out.println("Valor: " + aux.getValor());
                aux = aux.getNodoSiguiente();
            }
        }
    }

    public void desencolar() {
        Nodo aux = cola;
        if (cola == null) {
            System.out.println("La cola está vacía.");
        } else {
            if (aux.getNodoSiguiente() == null) {
                cola = null;
            } else {
                cola = aux.getNodoSiguiente();
            }
            System.out.println("Primer elemento eliminado.");
        }
    }
}
