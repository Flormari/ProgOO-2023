package Ejercicio2;

public class Ejecucion {
    //Atributo
    private Ecuacion ecuacion;

    //Metodo
    public void resolver_ecuacion2Do(int A, int B, int C){
        if (A != 0){
            ecuacion = new Ecuacion(A, B, C);
            if (ecuacion.resolver_ecuacion_2do()){
                ecuacion.mostrarRaiz();
            }
            else{
                System.out.println("Error");
            }
        }
        else{
            System.out.println("A no puede ser igual a cero");
        }

    }
}
