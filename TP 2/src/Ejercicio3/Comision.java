package Ejercicio3;

import java.util.ArrayList;

public class Comision {
    //--------------------[[ATRIBUTOS]]--------------------
    private int numero;
    private String dia, horario;
    private Nivel nivel;
    private Profesor profesor;
    private ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

    //--------------------[[CONSTRUCTOR]]--------------------
    public Comision(int numero, String dia, String horario, Nivel nivel, Profesor profesor){
        this.numero = numero;
        this.dia = dia;
        this.horario = horario;
        this.nivel = nivel;
        this.profesor = profesor;
    }

    //--------------------[[METODOS]]--------------------
    public void agregarAlumno(Alumno alumno){
        alumnos.add(alumno);
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void mostrarAlumnos() {
        for (int i=0; i < alumnos.size(); i++){
            System.out.println("Alumno: " + alumnos.get(i).getNombre() + " - Aistencias: " + alumnos.get(i).getCantAsistencia());
        }
    }

    public int totalAsistencias(){
        int total = 0;
        for (int i=0; i < alumnos.size(); i++){
            total = total + alumnos.get(i).getCantAsistencia();
        }
        return total;
    }

    public int getNumero() {
        return numero;
    }
}
