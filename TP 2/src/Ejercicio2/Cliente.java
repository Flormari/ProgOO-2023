package Ejercicio2;

import Ejercicio1.Suscripcion;

import java.time.LocalDate;

public class Cliente {
    //Atributos
    private String nombre;
    private String dni;
    private String direccion;
    private String mail;
    private String telefono;

    //Set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    //Get
    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getMail() {
        return mail;
    }

    public String getTelefono() {
        return telefono;
    }
}
