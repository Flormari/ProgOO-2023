package Ejercicio2;

public class Paquete {
    //--------------------[[ATRIBUTOS]]--------------------
    private String destino;
    private Provedor transporte;
    private Provedor hospedaje;
    private Provedor[] excursiones;
    private int indice;

    //--------------------[[CONSTRUCTOR]]--------------------
    public Paquete(int cantExcursiones){
        excursiones = new Provedor[cantExcursiones];
        indice = 0;
    }

    //--------------------[[METODOS]]--------------------
    //GET
    public String getDestino() {
        return destino;
    }

    //SET
    public void setDestino(String destino) {
        this.destino = destino;
    }

    //OTROS
    public void agregarProvedor(Provedor prov){

        if (prov.getClasificacion() == Clasificacion.TRANSPORTE){
            transporte = prov;
        } else if (prov.getClasificacion() == Clasificacion.HOSPEDAJE) {
            hospedaje = prov;
        }else {
            if (indice < excursiones.length){
                excursiones[indice] = prov;
                indice++;
            }
        }
    }

    public void mostrarProvedores(){
        System.out.println("Empresa: " + transporte.getNombre() + " - Clasificacion: Transporte - Precio: " + transporte.getPrecio());
        System.out.println("Empresa: " + hospedaje.getNombre() + " - Clasificacion: Hospedaje - Precio: " + hospedaje.getPrecio());
        for (int i=0; i < indice; i++){
            System.out.println("Empresa: " + excursiones[i].getNombre() + " - Clasificacion: Excursion - Precio: " + excursiones[i].getPrecio());
        }
    }

    public int precioTotal(){
        int precio = transporte.getPrecio() + hospedaje.getPrecio();
        for (int i=0; i < indice; i++){
            precio = precio + excursiones[i].getPrecio();
        }
        return precio;
    }

}
