package Ejercicio1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Libro miAngelito = new Libro();
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese nombre del libro: ");
        miAngelito.setTitulo(input.nextLine());
        System.out.println("Hecho!!!");

        String titulo = miAngelito.getTitulo();
        System.out.println(titulo);
    }
}
