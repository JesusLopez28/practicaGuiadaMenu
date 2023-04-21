package practicaguiadamenu;

public class ListaEnlazada {

    public Nodo lista;

    public ListaEnlazada() {
        lista = null;
    }

    public void agregar(int v) {
        Nodo nuevo = new Nodo(v);
        if (lista == null) {
            lista = nuevo;
        } else {
            Nodo aux = lista;
            while (aux.getNodoSiguiente() != null) {
                aux = aux.getNodoSiguiente();
            }
            aux.setNodoSiguiente(nuevo);
        }
    }

    public void recorrerCola() {
        Nodo aux = lista;
        if (lista == null) {
            System.out.println("La lista está vacía.");
        } else {
            while (aux != null) {
                System.out.println("Valor: " + aux.getValor());
                aux = aux.getNodoSiguiente();
            }
        }
    }

}
