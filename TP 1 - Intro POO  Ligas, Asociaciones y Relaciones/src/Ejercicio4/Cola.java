package Ejercicio4;
import Nodo;
public class Cola {
    //Atributos
    private Nodo nodoP;
    private Nodo nodoF;

    public Cola() {
        this.nodoP = null;
        this.nodoF = null;
    }

    //Metodos
    public Boolean esVacia() {
        return this.nodoP == null;
    }

    public void encolar(Object elemento) {
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setValor(elemento);
        if (this.esVacia()) {
            this.nodoP = nuevoNodo;
            this.nodoF = nuevoNodo;
        } else {
            this.nodoF.setSiguiente(nuevoNodo);
            this.nodoF = nuevoNodo;
        }
    }

    public void desencolar() {
        if (!esVacia()) {
            this.nodoP = this.nodoP.getSiguiente();
            if (this.nodoP == null) {
                // Si el inicio es null, la cola está vacía, así que también actualizamos nodoFinal.
                this.nodoF = null;
            }
        } else {
            System.out.println("La cola está vacía. No se puede desencolar.");
        }
    }

    public void mostrarElementos() {
        Nodo nodoActual = this.nodoP;
        while (nodoActual != null) {
            System.out.println(nodoActual.getValor());
            nodoActual = nodoActual.getSiguiente();
        }
    }

    public Object recuperar() {
        if (!esVacia()) {
            return this.nodoP.getValor();
        } else {
            return null; // La cola está vacía, no hay elementos para recuperar.
        }
    }
}
