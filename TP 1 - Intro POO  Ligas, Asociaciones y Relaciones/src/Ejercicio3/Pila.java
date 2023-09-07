package Ejercicio3;
import Nodo;
public class Pila {
    //Atributo
    private Nodo nodoTope;

    //Metodos
    public Pila() {
        this.nodoTope = null;
    }

    public Object getTope() {
        if (!esVacia()) {
            return this.nodoTope.getValor();
        } else {
            return null;
        }
    }

    public void apilar(Object elemento) {
        Nodo nodoAux = new Nodo();
        nodoAux.setValor(elemento);
        nodoAux.setSiguiente(this.nodoTope);
        this.nodoTope = nodoAux;
    }

    public void desapilar() {
        if (!esVacia()) {
            this.nodoTope = this.nodoTope.getSiguiente();
        } else {
            System.out.println("La pila está vacía. No se puede desapilar.");
        }
    }

    public boolean esVacia() {
        return this.nodoTope == null;
    }
}
