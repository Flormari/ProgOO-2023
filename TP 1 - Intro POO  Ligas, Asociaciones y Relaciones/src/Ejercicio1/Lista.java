package Ejercicio1;
import Nodo;
public class Lista {
    //Atributos
    private int cantidad;
    private Nodo nodoP;

    //Metodos -------------------------------------
    public Lista() {
        this.nodoP = null;
        this.cantidad = 0;
    }

    public int longitud() {
        return cantidad;
    }

    public boolean esVacia() {
        return (this.nodoP == null);
    }

    public void agregar(Object elemento) {
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setValor(elemento);
        if (this.esVacia()) {
            this.nodoP = nuevoNodo;
        } else {
            Nodo nodoAux = nodoP;
            while (nodoAux.getSiguiente() != null) {
                nodoAux = nodoAux.getSiguiente();
            }
            nodoAux.setSiguiente(nuevoNodo);
        }
        this.cantidad += 1;
    }

    public Object recuperar(int pos) {
        if (pos < 1 || pos > this.cantidad) {
            return null; // Valor no válido
        }

        Nodo datoRecuperado = this.nodoP;
        int iter = 1;
        while (iter < pos) {
            datoRecuperado = datoRecuperado.getSiguiente();
            iter++;
        }
        return datoRecuperado.getValor();
    }

    public boolean insertar(int pos, Object dato) {
        if (pos < 1 || pos > this.cantidad + 1) {
            return false;
        }

        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setValor(dato);

        if (pos == 1) {
            nuevoNodo.setSiguiente(nodoP);
            this.nodoP = nuevoNodo;
        } else {
            int iterador = 1;
            Nodo nodoAux = this.nodoP;
            Nodo nodoAnt = null;
            while (iterador <= pos) {
                nodoAnt = nodoAux;
                nodoAux = nodoAux.getSiguiente();
                iterador += 1;
            }
            nodoAnt.setSiguiente(nuevoNodo);
            nuevoNodo.setSiguiente(nodoAux);
        }
        this.cantidad += 1;
        return true;
    }

    public boolean eliminarPos(int pos) {
        if (pos < 1 || pos > this.cantidad) {
            return false;
        }

        if (pos == 1) {
            this.nodoP = nodoP.getSiguiente();
        } else {
            int iterador = 1;
            Nodo nodoAux = this.nodoP;
            Nodo nodoAnt = null;
            while (iterador <= pos) {
                nodoAnt = nodoAux;
                nodoAux = nodoAux.getSiguiente();
                iterador += 1;
            }
            nodoAnt.setSiguiente(nodoAux.getSiguiente());
        }
        this.cantidad -= 1;
        return true;
    }

    public void mostrarDatos() {
        Nodo nodoActual = this.nodoP;
        while (nodoActual != null) {
            System.out.println(nodoActual.getValor());
            nodoActual = nodoActual.getSiguiente();
        }
    }
}