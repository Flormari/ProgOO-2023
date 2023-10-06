package Ejercicio3;

import java.util.Random;

public class Profesor {
    private String nombre;
    private String dni;

    public Profesor(String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
    }

    //Set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    //Get
    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

}
