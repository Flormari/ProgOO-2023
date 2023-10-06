package Ejercicio6;

public class Empleado {
    //--------------------[[ATRIBUTOS]]--------------------
    private String nombre;
    private String apellido;
    private String direccion;
    private String DNI;
    private String telefono;

    //--------------------[[CONSTRUCTOR]]--------------------
    public Empleado(String nombre, String apellido, String direccion, String DNI, String telefono){
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.DNI = DNI;
        this.telefono = telefono;
    }

    //--------------------[[METODOS]]--------------------

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getDNI() {
        return DNI;
    }

    public String getTelefono() {
        return telefono;
    }
}
