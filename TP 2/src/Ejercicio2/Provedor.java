package Ejercicio2;

public class Provedor {
    //--------------------[[ATRIBUTOS]]--------------------
    private String nombre;
    private Clasificacion clasificacion;
    private int precio;
    //--------------------[[CONSTRUCTOR]]--------------------
    public Provedor(String nombre, Clasificacion clasificacion, int precio){
        this.nombre = nombre;
        this.clasificacion = clasificacion;
        this.precio = precio;
    }

    //--------------------[[ATRIBUTOS]]--------------------
    //SET
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setClasificacion(Clasificacion clasificacion) {
        this.clasificacion = clasificacion;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    //GET
    public String getNombre() {
        return nombre;
    }

    public Clasificacion getClasificacion() {
        return clasificacion;
    }

    public int getPrecio() {
        return precio;
    }
}
