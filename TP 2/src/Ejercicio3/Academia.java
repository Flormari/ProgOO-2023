package Ejercicio3;

import Ejercicio2.Provedor;

import java.util.ArrayList;

public class Academia {
    //--------------------[[ATRIBUTOS]]--------------------
    private ArrayList<Alumno> alumnos;
    private ArrayList<Comision> comisiones;
    private ArrayList<Disciplina> disciplinas;

    //--------------------[[CONSTRUCTOR]]--------------------
    public Academia(){
        alumnos = new ArrayList<Alumno>();
        comisiones = new ArrayList<Comision>();
        disciplinas = new ArrayList<Disciplina>();
    }

    //--------------------[[METODOS]]--------------------
    public int agregarAlumno(Alumno alumno, int comision){
        alumnos.add(alumno);

        //agregar a la comision
        int i = 0;
        boolean ban = true;
        while(i < comisiones.size() && ban){
            if (comisiones.get(i).getNumero() == comision){
                ban = false;
                comisiones.get(i).agregarAlumno(alumno);
            }
            i++;
        }

        //Entregamos la credencial
        return alumno.getCredencial();
    }

    public void agregarComisio(Comision comision, String disciplina){
        comisiones.add(comision);

        //agregar a disciplina
        int i = 0;
        boolean ba = true;
        Disciplina d;
        while(i < disciplinas.size() && ba){
            d = disciplinas.get(i);
            if (d.getNombre().equals(disciplina)){
                ba = false;
                d.agregarComision(comision);
            }
            i++;
        }
    }

    public void registrarAsistencia(int credencial){
        for (int i=0; i < alumnos.size(); i++){
            if (credencial == alumnos.get(i).getCredencial()){
                alumnos.get(i).aumentarAsistencia();
            }
        }
    }

    public void listadoDeAsistencia(String profesorDni){
        int total = 0;
        Comision com;
        for (int i=0; i < comisiones.size(); i++){
            com = comisiones.get(i);
            if (profesorDni.equals(com.getProfesor().getDni())){
                com.mostrarAlumnos();
                total = total + com.totalAsistencias();
            }
        }
        System.out.println("El profesor cobra: " + (total*10));
    }

    public void agregarDisciplina(String disciplina){
        Disciplina dic = new Disciplina(disciplina);
        disciplinas.add(dic);
    }

    public String disciplinaMayorIngreso(){
        int numero;
        int mayor = disciplinas.get(0).cantidadAsistencias();
        String nombre = disciplinas.get(0).getNombre();
        for (int i = 1; i < disciplinas.size(); i++){
            numero = disciplinas.get(i).cantidadAsistencias();
            if (mayor < numero){
                numero = mayor;
                nombre = disciplinas.get(i).getNombre();
            }
        }
        return nombre;
    }
}