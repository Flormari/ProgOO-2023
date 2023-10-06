package Ejercicio6;

import java.time.LocalDate;

public class Venta {
    //--------------------[[ATRIBUTOS]]--------------------
    private LocalDate fecha;
    private float importeTotal;
    private Cliente cliente;
    private Empleado empleado;
    private Expendedor expendedor;

    //--------------------[[CONSTRUCTOR]]--------------------
    public Venta(float importeTotal, Cliente cliente, Empleado empleado, Expendedor expendedor, String combustible){
        this.importeTotal = importeTotal;
        fecha = LocalDate.now();
        this.cliente = cliente;
        this.empleado = empleado;
        this.expendedor = expendedor;
        this.expendedor.setTipoCombustible(combustible);
    }

    //--------------------[[METODOS]]--------------------
    public LocalDate getFecha() {
        return fecha;
    }

    public float getImporteTotal() {
        return importeTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public Expendedor getExpendedor() {
        return expendedor;
    }
}
