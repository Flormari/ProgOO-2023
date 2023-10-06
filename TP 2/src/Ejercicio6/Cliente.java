package Ejercicio6;

public class Cliente {
    //--------------------[[ATRIBUTOS]]--------------------
    private String patente;
    private String nombre;

    //--------------------[[CONSTRUCTOR]]--------------------
    public Cliente(String nombre, String patente){
        this.nombre = nombre;
        this.patente = patente;
    }

    //--------------------[[METODOS]]--------------------
    public String getPatente() {
        return patente;
    }

    public String getNombre() {
        return nombre;
    }
}
