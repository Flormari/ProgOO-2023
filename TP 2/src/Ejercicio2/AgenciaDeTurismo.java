package Ejercicio2;

import java.util.ArrayList;

public class AgenciaDeTurismo {
    //--------------------[[ATRIBUTOS]]--------------------
    private ArrayList<Provedor> provedores;
    private ArrayList<Paquete> paquetes;
    private ArrayList<Cliente> clientes;
    private ArrayList<Compra> compras;

    //--------------------[[CONSTRUCTOR]]--------------------
    public AgenciaDeTurismo(){
        provedores = new ArrayList<Provedor>();
        paquetes = new ArrayList<Paquete>();
        clientes = new ArrayList<Cliente>();
        compras = new ArrayList<Compra>();
    }

    //--------------------[[METODOS]]--------------------
    //Provedor
    public void setProvedor(Provedor provedor){
        provedores.add(provedor);
    }

    public Provedor getProvedor(int posicion){
        return provedores.get(posicion);
    }

    public void mostrarProvedores(){
        for (int i=0; i < provedores.size(); i++){
            if (provedores.get(i).getClasificacion() == Clasificacion.HOSPEDAJE){
                System.out.println("[" + i + "] Nombre: " + provedores.get(i).getNombre() + " - Precio: " + provedores.get(i).getPrecio() + " - Clasificacion: Hospedaje");
            } else if (provedores.get(i).getClasificacion() == Clasificacion.TRANSPORTE) {
                System.out.println("[" + i + "] Nombre: " + provedores.get(i).getNombre() + " - Precio: " + provedores.get(i).getPrecio() + " - Clasificacion: Transporte");
            } else System.out.println("[" + i + "] Nombre: " + provedores.get(i).getNombre() + " - Precio: " + provedores.get(i).getPrecio() + " - Clasificacion: Excursion");
        }
    }

    //Paquetes
    public void setPaquete(String destino, Provedor transporte, Provedor hospedaje, Provedor excursion){
        Paquete paqu = new Paquete(20);
        paqu.setDestino(destino);
        paqu.agregarProvedor(transporte);
        paqu.agregarProvedor(hospedaje);
        paqu.agregarProvedor(excursion);

        paquetes.add(paqu);
    }

    public void paqueteAgregarExcursiones(Provedor excursion, int posicion){
        paquetes.get(posicion).agregarProvedor(excursion);
    }

    public Paquete getPaquete(int posicion){
        return paquetes.get(posicion);
    }

    public void mostrarPaquetes(){
        for (int i=0; i < paquetes.size(); i++){
            System.out.println("[" + i + "]");
            System.out.println("Destino: " + paquetes.get(i).getDestino());
            paquetes.get(i).mostrarProvedores();
            System.out.println("Precio: " + paquetes.get(i).precioTotal());
            System.out.println("--------------------------");
        }
    }

    //Clientes
    public void setClientes(String nombre, String dni, String direccion, String mail, String telefono){
        Cliente clien = new Cliente();
        clien.setNombre(nombre);
        clien.setDni(dni);
        clien.setDireccion(direccion);
        clien.setMail(mail);
        clien.setTelefono(telefono);

        clientes.add(clien);
    }

    public void mostrarClientes(){
        for (int i=0; i < clientes.size(); i++){
            System.out.println("[" + i + "] Nombre: " + clientes.get(i).getNombre() + " - DNI: " + clientes.get(i).getDni());
        }
    }

    //Compra
    public void realizarCompra(int posPaquete, int posCliente){
        Compra com = new Compra(clientes.get(posCliente), paquetes.get(posCliente));
        compras.add(com);
    }

    public void mostrarCompras(){
        for (int i=0; i < compras.size(); i++){
            System.out.println("Compra Nro [" + i + "]");
            compras.get(i).mostrar();
            System.out.println(" ");
            System.out.println("---------------------------------");
        }
    }
    public void organizarCompras(){
        int n = compras.size();
        Paquete p1, p2;
        Compra temp;

        for (int i = 0; i < n - 1; i++) {
            int indiceMinimo = i;

            for (int j = i + 1; j < n; j++) {
                // Comparar las cadenas en las posiciones "indiceMinimo" y "j"
                p1 = compras.get(j).getPaquete();
                p2 = compras.get(indiceMinimo).getPaquete();
                if (p1.getDestino().compareTo(p2.getDestino()) < 0) {
                    indiceMinimo = j;
                }
            }

            // Intercambiar las cadenas en las posiciones "i" e "indiceMinimo"
            temp = compras.get(i);
            compras.set(i, compras.get(indiceMinimo));
            compras.set(indiceMinimo, temp);
        }
    }
}
