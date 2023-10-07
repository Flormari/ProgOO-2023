package Ejercicio5;

import java.util.Scanner;

public class Main {
    public static void main (String[] arg){
        //Cuenta normal
        CuentaNormal cuenta = new CuentaNormal();
        CuentaCredito cuentaCredito = new CuentaCredito();
        Usuario c1 = new Usuario("Franco", cuenta, cuentaCredito);
        Scanner sc = new Scanner(System.in);
        double monto;
        System.out.println("Ingrese el saldo a agregar a su billetera normal: ");
        monto = sc.nextDouble();
        c1.agregarSaldo(monto);

        System.out.println("saldo actual: " + c1.getSaldo());
        System.out.println("limite sobregiro: " + c1.getLimiteGiroEnDescubierto());

        System.out.println("Ingrese el monto que desea invertir: ");
        monto = sc.nextDouble();
        System.out.println("Ingrese cantidad de dias: ");
        int dias = sc.nextInt();
        if (c1.invertirSaldo(monto, dias)) {
            System.out.println("dinero invertido: " + c1.getMontoInvertido());
        } else {
            System.out.println("No puede invertir nuevamenete.");
        }

        System.out.println("Ingrese el monto a gastar: ");
        monto = sc.nextDouble();
        c1.gastar(monto, true);
        System.out.println("Monto actual: " + c1.getSaldo());
        System.out.println("Giro en descubierto: " + c1.getDeudaGiroDescubierto());
        System.out.println("Ingrese el saldo a agregar a su billetera normal: ");
        monto = sc.nextDouble();
        c1.agregarSaldo(monto);
        System.out.println("Monto actual: " + c1.getSaldo());
        System.out.println("Giro en descubierto utilizado: " + c1.getDeudaGiroDescubierto());
        System.out.println("Ingrese el saldo a agregar a su billetera normal: ");
        monto = sc.nextDouble();
        System.out.println("Cantidad de dias: ");
        dias = sc.nextInt();
        if (c1.invertirSaldo(monto, dias)) {
            System.out.println("Dinero invertido: " + c1.getMontoInvertido());
        } else {
            System.out.println("No puede invertir nuevamenete.");
        }
        if (!c1.invertirSaldo(monto, dias)) {
            System.out.println("No puede invertir nuevamenete.");
        }
    }
}
