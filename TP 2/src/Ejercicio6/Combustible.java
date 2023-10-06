package Ejercicio6;

public class Combustible {
    //--------------------[[ATRIBUTOS]]--------------------
    private float precioVenta;
    private String nombre;

    //--------------------[[CONSTRUCTOR]]--------------------
    public Combustible(String nombre){
        this.nombre = nombre;
    }

    //--------------------[[METODOS]]--------------------
    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }
    public float getPrecioVenta() {
        return precioVenta;
    }

    public String getNombre() {
        return nombre;
    }
}
