package Ejercicio7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el coeficiente A");
        int A = input.nextInt();

        System.out.println("Ingrese el coeficiente B");
        int B = input.nextInt();

        System.out.println("Ingrese el coeficiente C");
        int C = input.nextInt();

        Ejecucion ecuacion = new Ejecucion();
        ecuacion.resolver_ecuacion2Do(A, B, C);
    }
}
