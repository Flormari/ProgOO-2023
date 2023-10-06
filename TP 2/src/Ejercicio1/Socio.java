package Ejercicio1;

import java.time.LocalDate;

public class Socio {
    //--------------------[[ATRIBUTOS]]--------------------
    private String nombre;
    private String dni;
    private LocalDate fecha_nacimiento;
    private String direccion;
    private String mail;
    private Suscripcion suscripcion;
    private LocalDate fecha_inscripcion;

    //--------------------[[METODOS]]--------------------
    //SET
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setSuscripcion(Suscripcion suscripcion) {
        this.suscripcion = suscripcion;
    }

    public void setFecha_inscripcion(LocalDate fecha_inscripcion) {
        this.fecha_inscripcion = fecha_inscripcion;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    //GET
    public String getNombre(){
        return nombre;
    }

    public String getDireccion(){
        return direccion;
    }

    public String getMail(){
        return mail;
    }

    public Suscripcion getSuscripcion() {
        return suscripcion;
    }

    public LocalDate getFecha_inscripcion() {
        return fecha_inscripcion;
    }

    public String getDni() {
        return dni;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }
}
