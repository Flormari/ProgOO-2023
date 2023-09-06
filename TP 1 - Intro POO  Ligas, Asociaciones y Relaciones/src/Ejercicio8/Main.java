package Ejercicio8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Creamos el array de contrasenias
        System.out.println("Ingrese cantidad de contrasenias a generar");
        int total = input.nextInt();
        Generar contrasenias = new Generar(total);

        //Generar contrasenias
        for (int i = 0; i < total; i++){
            System.out.println("Longitud de contrasenia (-1 para omitir)");
            int tamanio = input.nextInt();
            if (tamanio == -1){
                contrasenias.generarContrasenia();
            }
            else contrasenias.generarContrasenia(tamanio);
        }

        //Mostrar contrasenias
        contrasenias.mostrarTodos();

        //Regenerar contrasenia
        System.out.println("Posicion de contrasenia a regenerar (-1 para omitir)");
        int posicion = input.nextInt();

        while (posicion != -1){
            contrasenias.regenerar(posicion);
            contrasenias.mostrarTodos();

            System.out.println("Posicion de contrasenia a regenerar (-1 para omitir)");
            posicion = input.nextInt();
        }

    }
}
