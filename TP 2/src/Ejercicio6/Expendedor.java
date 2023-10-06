package Ejercicio6;

import java.util.Random;

public class Expendedor {
    //--------------------[[ATRIBUTOS]]--------------------
    private int codigo;
    private Combustible tipoCombustible;

    //--------------------[[CONSTRUCTOR]]--------------------
    public Expendedor(){
        Random random = new Random();
        codigo = random.nextInt(100);
    }

    //--------------------[[METODOS]]--------------------
    public int getCodigo() {
        return codigo;
    }

    //GET y SET de combustible
    public Combustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String combustible) {
        Combustible tipoCombustible = new Combustible(combustible);
        this.tipoCombustible = tipoCombustible;
    }
}
