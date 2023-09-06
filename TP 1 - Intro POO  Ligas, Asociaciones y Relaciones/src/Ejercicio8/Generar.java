package Ejercicio8;

public class Generar {
    //Atributos
    private int posicionSiguiente;
    private Contrasenia[] contrasenias;

    //Metodos
    public Generar(int cantidadClaves){
        contrasenias = new Contrasenia[cantidadClaves];
        posicionSiguiente = 0;
    }

    public boolean generarContrasenia(){
        if (posicionSiguiente < contrasenias.length){
            contrasenias[posicionSiguiente] = new Contrasenia();
            contrasenias[posicionSiguiente].generarPassword();
            posicionSiguiente++;
            return true;
        }
        else return false;
    }

    public boolean generarContrasenia(int tamanio){
        if (posicionSiguiente < contrasenias.length){
            contrasenias[posicionSiguiente] = new Contrasenia();
            contrasenias[posicionSiguiente].setLongitud(tamanio); //el tamanio >= 5
            contrasenias[posicionSiguiente].generarPassword();
            posicionSiguiente++;
            return true;
        }
        else return false;
    }

    public void mostrarTodos(){
        for (int i = 0; i < posicionSiguiente; i++){
            if (contrasenias[i].esFuerte()){
                System.out.println("[" + (i+1) + "] = " + contrasenias[i].getPassword() + " - Fuerte");
            }
            else System.out.println("[" + (i+1) + "] = " + contrasenias[i].getPassword() + " - Debil");
        }
    }

    public void regenerar(int posicion){
        contrasenias[posicion-1].generarPassword();
        while (!(contrasenias[posicion-1].esFuerte())){
            contrasenias[posicion-1].generarPassword();
        }
    }
}

