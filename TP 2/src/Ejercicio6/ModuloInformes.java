package Ejercicio6;

import java.util.ArrayList;
import java.util.Random;

public class ModuloInformes {
    //--------------------[[ATRIBUTOS]]--------------------
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Empleado> empleados;
    private ArrayList<Expendedor> expendedores;
    private ArrayList<Venta> listaVentas;

    //--------------------[[CONSTRUCTOR]]--------------------
    public ModuloInformes(){
        listaClientes = new ArrayList<Cliente>();
        empleados = new ArrayList<Empleado>();
        expendedores = new ArrayList<Expendedor>();
        listaVentas = new ArrayList<Venta>();
    }

    //--------------------[[METODOS]]--------------------
    /*
    informe ventas x combustible
    informe ventas x surtidor
    informe litros x sutidor
    informe ventas x empleado
     */
    public void agregarCliente(String nombre, String patente){
        Cliente cliente = new Cliente(nombre, patente);
        listaClientes.add(cliente);
    }
    public void agregarEmpleado(String nombre, String apellido, String direccion, String DNI, String telefono){
        Empleado empl = new Empleado(nombre, apellido, direccion, DNI, telefono);
        empleados.add(empl);
    }

    public int agregarExpendedor(){
        Expendedor exp = new Expendedor();
        expendedores.add(exp);

        //Devulve el numero del expendedor
        return exp.getCodigo();
    }

    public boolean realizarVenta(String patente, int expendedor, String combustible, float total, String dni){
        int i = 0;
        boolean ban = true;
        Cliente cliente = null;
        Expendedor expen = null;
        Empleado emp = null;

        //Buscamos clientes registrados
        while(i < listaClientes.size() && ban){
            if (listaClientes.get(i).getPatente().equals(patente)){
                cliente = listaClientes.get(i);
                ban = false;
            }
        }
        if (i == listaClientes.size()){
            return false;
        }

        //Buscamos expendedor registrados
        i = 0;
        ban = true;
        while(i < expendedores.size() && ban){
            if (expendedores.get(i).getCodigo() == expendedor){
                expen = expendedores.get(i);
                ban = false;
            }
        }
        if (i == expendedores.size()){
            return false;
        }

        //Buscamos clientes empleado
        i = 0;
        ban = true;
        while(i < empleados.size() && ban){
            if (empleados.get(i).getDNI().equals(dni)){
                emp = empleados.get(i);
                ban = false;
            }
        }
        if (i == empleados.size()){
            return false;
        }

        Venta venta = new Venta(total, cliente, emp, expen, combustible);
        return true;
    }
}
