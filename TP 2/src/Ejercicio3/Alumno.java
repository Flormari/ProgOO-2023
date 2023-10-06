package Ejercicio3;

import Ejercicio2.Paquete;

import java.util.Random;

public class Alumno {
    //--------------------[[ATRIBUTOS]]--------------------
    private String nombre;
    private String dni;
    private String mail;
    private String telefono;
    private int credencial;
    private int cantAsistencia;

    //--------------------[[CONSTRUCTOR]]--------------------
    public Alumno(){
        Random random = new Random();
        credencial = random.nextInt(200);

        cantAsistencia = 0;
    }

    public Alumno(String nombre, String dni, String mail, String telefono){
        Random random = new Random();
        credencial = random.nextInt(200);

        cantAsistencia = 0;

        this.nombre = nombre;
        this.dni = dni;
        this.mail = mail;
        this.telefono = telefono;
    }

    //--------------------[[METODOS]]--------------------
    //Set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public String getMail() {
        return mail;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getCredencial() {
        return credencial;
    }

    public void aumentarAsistencia(){
        cantAsistencia++;
    }

    public int getCantAsistencia() {
        return cantAsistencia;
    }
}
