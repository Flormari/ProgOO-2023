package Ejercicio4;

import java.time.LocalDate;

public class CuentaNormal {
    //--------------------[[ATRIBUTOS]]--------------------
    private double saldo;
    private double giroEnDescubierto;
    private double montoInvertido;
    private final double limiteGiroEnDescubierto;
    private double montoTotal;
    private LocalDate fechaPlazoFijoInicio;
    private LocalDate fechaPlazoFijoFinal;

    //--------------------[[CONSTRUCTOR]]--------------------
    public CuentaNormal() {
        giroEnDescubierto = 0;
        montoInvertido = 0;
        limiteGiroEnDescubierto = 100;
        montoTotal = saldo + limiteGiroEnDescubierto;

    }

    //--------------------[[METODOS]]--------------------
    //GET
    public double getSaldo() {
        return saldo;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public double getMontoInvertido(){
        return montoInvertido;
    }

    //OTROS
    public void agregarSaldo(double saldo) {
        giroEnDescubierto -= saldo;
        if (giroEnDescubierto < 0) {
            this.saldo = giroEnDescubierto * -1;
            giroEnDescubierto = 0;
        }
    }

    public boolean activarPlazoFijo(double saldo, int dias) {
        if (fechaPlazoFijoFinal == null) {
            this.fechaPlazoFijoInicio = LocalDate.now();
            this.fechaPlazoFijoFinal = this.fechaPlazoFijoInicio.plusDays(dias);
            this.montoInvertido = saldo;
            return true;
        }
        if (LocalDate.now().isAfter(fechaPlazoFijoFinal)) {
            montoInvertido += montoInvertido * 1.40;
            saldo += montoInvertido;
            this.fechaPlazoFijoInicio = LocalDate.now();
            this.fechaPlazoFijoFinal = this.fechaPlazoFijoInicio.plusDays(dias);
            montoInvertido = saldo;
            return true;
        }
        return false;
    }

    public void descontarSaldo(double saldo) {
        if (this.saldo - saldo >= 0) {
            this.saldo -= saldo;
        } else if ((this.saldo + limiteGiroEnDescubierto) - saldo < 0) {
            System.out.println("Saldo insuficiente.");
            return;
        } else {
            System.out.println("Se usa el giro en descubierto");
            double montoTotal = this.saldo + limiteGiroEnDescubierto;
            giroEnDescubierto = (this.saldo - saldo) * -1;
            this.saldo = 0;
        }
    }

    public double deudaGiroEnDescubierto() {
        return giroEnDescubierto;
    }
}