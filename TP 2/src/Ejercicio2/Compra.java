package Ejercicio2;

public class Compra {
    //--------------------[[ATRIBUTOS]]--------------------
    private Cliente cliente;
    private Paquete paquete;
    //--------------------[[CONSTRUCTOR]]--------------------
    public Compra(Cliente cliente, Paquete paquete){
        this.cliente = cliente;
        this.paquete = paquete;
    }
    //--------------------[[METODOS]]--------------------
    public Cliente getCliente() {
        return cliente;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public void mostrar(){
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Contenido del Paquete ");
        System.out.println("Destino: " + paquete.getDestino());
        paquete.mostrarProvedores();
        System.out.println("Precio: " + paquete.precioTotal());
    }
}
