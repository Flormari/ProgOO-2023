package Ejercicio2;
import Nodo;
public class ListaEnlazada {
    private Nodo nodoP;
    private int longitud;

    public ListaEnlazada(){
        nodoP = null;
        longitud = 0;
    }
    public boolean esVacia(){
        return longitud == 0;
    }
    public int Largo(){
        return longitud;
    }

    public void agregar(Object dato){
        Nodo nuevoNodo=new Nodo(dato);
        if (nodoP ==null){
            nodoP =nuevoNodo;
        }else{
            Nodo actual= nodoP;
            while (actual.getSiguiente()!=null){
                actual=actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(actual);
        }
        longitud++;
    }

    public void insetar (Object dato, int posicion){
        if (posicion<0  || posicion > longitud){
            throw new IndexOutOfBoundsException();
        }
        if (posicion==0){
            Nodo nuevoNodo = new Nodo (dato);
            nuevoNodo.setSiguiente(nodoP);
            if (nodoP !=null){
                nodoP.setAnterior(nuevoNodo);
            }
            nodoP =nuevoNodo;
            longitud++;
            return;
        }
        Nodo actual= nodoP;
        for (int i=0;i<posicion-1;i++){
            actual=actual.getSiguiente();
        }
        Nodo nuevoNodo = new Nodo(dato);
        nuevoNodo.setSiguiente(actual.getSiguiente());
        nuevoNodo.setAnterior(actual);
        if (actual.getSiguiente()!=null){
            actual.getSiguiente().setAnterior(nuevoNodo);
        }
        actual.setSiguiente(nuevoNodo);
        longitud++;
    }

    public void eliminar (Object dato){
        Nodo actual = nodoP;
        while (actual != null) {
            if (actual.getValor() == dato) {
                if (actual.getAnterior() != null) {
                    actual.getAnterior().setProximo(actual.getSiguiente());
                } else {
                    nodoP = actual.getSiguiente();
                }
                if (actual.getSiguiente() != null) {
                    actual.getSiguiente().setAnterior(actual.getAnterior());
                }
                longitud--;
                break;
            }
            actual = actual.getSiguiente();
        }
    }

    public Object recuperar(int indice){
        if (indice<0 || indice >=longitud){
            throw new IndexOutOfBoundsException();
        }
        Nodo actual= nodoP;
        for (int i=0;i<indice;i++){
            actual=actual.getSiguiente();
        }
        return actual.getValor();
    }
}
