package Ejercicio5;

public class CuentaCredito {
    //--------------------[[ATRIBUTOS]]--------------------
    private double saldoDeudor;
    private double limiteCompra;
    private double montoCompraDisponible;

    //--------------------[[CONSTRUCTOR]]--------------------
    public CuentaCredito(){
        limiteCompra = 500;
        saldoDeudor = 0;
        montoCompraDisponible = 500;
    }

    //--------------------[[METODOS]]--------------------
    //GET
    public double getSaldoDeudor() {
        return saldoDeudor;
    }

    public double getMontoCompraDisponible() {
        return montoCompraDisponible;
    }

    //OTROS
    public boolean realizarCompra(double saldo) {
        if (saldo <= montoCompraDisponible) {
            saldoDeudor += saldo * 1.05;
            limiteCompra -= saldo;
            return true;
        }
        return false;
    }

    public void pagarSaldoDeudor(double saldo) {
        if (saldoDeudor - saldo >= 0) {
            saldoDeudor -= saldo;
            limiteCompra += saldo;
        }
    }
}