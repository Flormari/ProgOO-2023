package Ejercicio5;

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
    private boolean prestamoCancelado;

    //--------------------[[CONSTRUCTOR]]--------------------
    public CuentaNormal() {
        giroEnDescubierto = 0;
        montoInvertido = 0;
        limiteGiroEnDescubierto = 100;
        montoTotal = saldo + limiteGiroEnDescubierto;
        prestamoCancelado = false;

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
        if (LocalDate.now().isAfter(fechaPlazoFijoFinal) && !prestamoCancelado) {
            montoInvertido += montoInvertido * 1.40;
            saldo += montoInvertido;
            this.fechaPlazoFijoInicio = LocalDate.now();
            this.fechaPlazoFijoFinal = this.fechaPlazoFijoInicio.plusDays(dias);
            montoInvertido = saldo;
            return true;
        }
        return false;
    }

    public void descontarSaldo(double saldo, boolean precancelar) {
        if (this.saldo - saldo >= 0) {
            this.saldo -= saldo;
        } else if ((this.saldo + limiteGiroEnDescubierto) - saldo < 0 && (this.saldo + montoInvertido) - saldo < 0) {
            System.out.println("No tiene saldo sufiente.");
            return;
        } else {
            if (precancelar) {
                if ((saldo + montoInvertido) - saldo >= 0) {
                    this.saldo += montoInvertido;
                    this.saldo -= saldo;
                    montoInvertido = 0;
                } else {
                    this.saldo += montoInvertido;
                    System.out.println("Se usara el giro en descubierto");
                    giroEnDescubierto = (this.saldo - saldo) * -1;
                    this.saldo = 0;
                }
            } else {
                System.out.println("Se usara el giro en descubierto");
                giroEnDescubierto = (this.saldo - saldo) * -1;
                this.saldo = 0;
            }
        }
    }

    public double deudaGiroEnDescubierto() {
        return giroEnDescubierto;
    }

    public void cancelarInversion() {
        prestamoCancelado = true;
    }
}