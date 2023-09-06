package Ejercicio2;

public class Ecuacion {
    //Atributos
    private int coef1;
    private int coef2;
    private int coef3;
    private double raiz1;
    private double raiz2;

    //Metodo
    public Ecuacion(int coeficiente_A,int coeficiente_B, int coeficiente_C){
        coef1 = coeficiente_A;
        coef2 = coeficiente_B;
        coef3 = coeficiente_C;
    }

    public boolean resolver_ecuacion_2do(){
        boolean respuesta = true;

        double x = (Math.pow(coef2, 2))-(4*coef1*coef3);

        if (x < 0){
            respuesta = false;
        }
        else {
            raiz1 = (-coef2 + (Math.sqrt(x)))/(2*coef1);
            raiz2 = (-coef2 - (Math.sqrt(x)))/(2*coef1);
        }
        return respuesta;
    }

    public void mostrarRaiz(){
        if (raiz1 == raiz2){
            System.out.println("raiz: " + raiz1);
        }
        else{
            System.out.println("Raiz 1: "+ raiz1);
            System.out.println("Raiz 2: "+ raiz2);
        }
    }
}
