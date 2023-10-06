package Ejercicio3;

import java.util.ArrayList;

public class Disciplina {
    //--------------------[[ATRIBUTOS]]--------------------
    private String nombre = new String();
    private ArrayList<Comision> comisiones = new ArrayList<Comision>();

    //--------------------[[CONSTRUCTOR]]--------------------
    public Disciplina(String nombre){
        this.nombre = nombre;
    }

    //--------------------[[METODOS]]--------------------
    public String getNombre() {
        return nombre;
    }

    public void agregarComision(Comision comision){
        comisiones.add(comision);
    }

    public int cantidadAsistencias(){
        int total = 0;
        for (int i = 0; i < comisiones.size(); i++){
            total = total + comisiones.get(i).totalAsistencias();
        }
        return total;
    }
}
