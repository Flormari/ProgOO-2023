package Ejercicio5;

public class Usuario {
    //--------------------[[ATRIBUTOS]]--------------------
    private String nombre;
    private CuentaNormal cuenta;
    private CuentaCredito cuentaCredito;

    //--------------------[[CONSTRUCTOR]]--------------------
    public Usuario(String nombre, CuentaNormal cuenta, CuentaCredito cuentaCredito) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.cuentaCredito = cuentaCredito;
    }

    public Usuario(String nombre, CuentaNormal cuenta) {
        this.nombre = nombre;
        this.cuenta = cuenta;
    }

    //--------------------[[METODOS]]--------------------
    //GET
    public double getSaldo() {
        return cuenta.getSaldo();
    }

    public double getDeudaGiroDescubierto() {
        return cuenta.deudaGiroEnDescubierto();
    }

    public double getMontoInvertido() {
        return cuenta.getMontoInvertido();
    }

    public double getSaldoDeudor() {
        return cuentaCredito.getSaldoDeudor();
    }

    public double getMontoCompraCredito() {
        return cuentaCredito.getMontoCompraDisponible();
    }

    //OTROS
    public double getLimiteGiroEnDescubierto() {
        return cuenta.deudaGiroEnDescubierto();
    }

    public void agregarSaldo(double saldo) {
        cuenta.agregarSaldo(saldo);
    }

    public boolean invertirSaldo(double saldo, int dias) {
        return cuenta.activarPlazoFijo(saldo, dias);
    }
    public void gastar(double saldo, boolean precancelar) {
        cuenta.descontarSaldo(saldo, precancelar);
    }

    public void compraCredito(double saldo) {
        boolean okay = cuentaCredito.realizarCompra(saldo);
        if (!okay) {
            System.out.println("No tiene credito suficiente para realizar la compra.");
        }
    }

    public void cancelarPlazoFijo() {
        cuenta.cancelarInversion();
    }

    public void pagarCredito(double saldo) {
        cuentaCredito.pagarSaldoDeudor(saldo);
    }



}