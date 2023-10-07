package Ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main (String[] arg){
        //cuenta normal
        CuentaNormal cuenta = new CuentaNormal();
        CuentaCredito cuentaCredito = new CuentaCredito();
        Usuario c1 = new Usuario("Luz", cuenta, cuentaCredito);
        Scanner sc = new Scanner(System.in);
        double monto;
        System.out.println("Ingrese el saldo a agregar a su billetera normal: ");
        monto = sc.nextDouble();
        c1.agregarSaldo(monto);

        //Mostar estado
        System.out.println("saldo actual: " + c1.getSaldo());
        System.out.println("limite sobregiro: " + c1.getLimiteGiroEnDescubierto());

        System.out.println("Ingrese el monto a gastar: ");
        monto = sc.nextDouble();

        c1.gastar(monto);
        System.out.println("saldo actual: " + c1.getSaldo());
        System.out.println("Giro en descubierto utilizado: " + c1.getDeudaGiroDescubierto());

        System.out.println("Ingrese el saldo a agregar a su billetera normal: ");
        monto = sc.nextDouble();
        c1.agregarSaldo(monto);

        System.out.println("saldo actual: " + c1.getSaldo());
        System.out.println("Giro en descubierto utilizado: " + c1.getDeudaGiroDescubierto());
        System.out.println("Ingrese el monto que desea invertir a su billetera normal: ");
        monto = sc.nextDouble();

        System.out.println("Ingrese cantidad de dias: ");
        int dias = sc.nextInt();

        if (c1.invertirSaldo(monto, dias)) {
            System.out.println("El dinero invirtido: " + c1.getMontoInvertido());
        } else {
            System.out.println("No puede invertir nuevamenete.");
        }
        // intento depositar nuevamente.
        if (!c1.invertirSaldo(monto, dias)) {
            System.out.println("No puede invertir nuevamenete.");
        }

        //Cuenta credito
        System.out.println("Monto para compras a credito: "  + c1.getMontoCompraCredito());
        System.out.println("Saldo: "  + c1.getSaldoDeudor());
        System.out.println("Ingrese el monto a usar en billetera a credito: ");
        monto = sc.nextDouble();
        c1.compraCredito(monto);
        System.out.println("Saldo: "  + c1.getSaldoDeudor());
        System.out.println("Monto para compras a credito: "  + c1.getMontoCompraCredito());
        System.out.println("Ingrese el monto que desea pagar: ");
        monto = sc.nextDouble();
        c1.pagarCredito(monto);
        System.out.println("Saldo: "  + c1.getSaldoDeudor());
    }
}
