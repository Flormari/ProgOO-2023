package Ejercicio8;
import java.util.Random;

public class Contrasenia {
    //Atributos
    private StringBuilder password;
    private int longitud;

    //Metodo
    public Contrasenia(){
        longitud = 8;
        //password = new StringBuilder();
    }
    public void setLongitud(int unaLongitud){
        if (unaLongitud >= 5){
            longitud = unaLongitud;
        }
    }

    public int getLongitud(){
        return longitud;
    }

    public String getPassword(){
        return password.toString();
    }

    public String generarPassword(){
        password = new StringBuilder();

        //Crear todos los caracteres permitidos
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        //Crear Random
        Random random = new Random();

        //Generar caracteres aleatorios y construir la contraseña
        for (int i = 0; i < longitud; i++) {
            int indice = random.nextInt(caracteres.length());
            char unChar = caracteres.charAt(indice);
            password.append(unChar);
        }
        return password.toString();
    }

    public boolean esFuerte(){
        int cont_Minusculas = 0; // >= 1
        int cont_Mayusculas = 0; // >= 2
        int cont_Numero = 0; // >= 2

        //Caracter
        for (int i = 0; i < password.length(); i++) {
            char caracter = password.charAt(i);

            //Saber si el caracter es minuscula
            if (Character.isLowerCase(caracter)) {
                cont_Minusculas++;
            }

            //Saber si el caracter es mayuscula
            if (Character.isUpperCase(caracter)){
                cont_Mayusculas++;
            }

            //Saber si el caracter es un numero
            if (Character.isDigit(caracter)){
                cont_Numero++;
            }
        }

        if ((cont_Numero >= 2) && (cont_Minusculas >= 1) && (cont_Mayusculas >= 2)){
            return true;
        }
        else return false;
    }
}
