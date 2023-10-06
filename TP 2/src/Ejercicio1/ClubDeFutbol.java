package Ejercicio1;

import java.time.LocalDate;

public class ClubDeFutbol {
    //--------------------[[ATRIBUTOS]]--------------------
    private Socio[] socios;
    private int indice;

    //--------------------[[CONSTRUCTOR]]--------------------
    public ClubDeFutbol(int cantidad){
        socios = new Socio[cantidad];
        indice = 0;
    }

    //--------------------[[METODOS]]--------------------
    public void inscripcion(String nombre, String dni, LocalDate nacimiento, String direccion, String mail, Suscripcion subcripcion, LocalDate f_inscripcion){
        if (indice < socios.length){
            socios[indice] = new Socio();
            socios[indice].setNombre(nombre);
            socios[indice].setDni(dni);
            socios[indice].setDireccion(direccion);
            socios[indice].setMail(mail);
            socios[indice].setFecha_inscripcion(f_inscripcion);
            socios[indice].setFecha_nacimiento(nacimiento);
            socios[indice].setSuscripcion(subcripcion);
            indice++;
        }
    }
    public void sociosDelMes(){
        LocalDate fechaActual = LocalDate.now();
        LocalDate mesAComparar;
        for (int i=0; i < indice; i++){
            mesAComparar = socios[i].getFecha_inscripcion();
            if (fechaActual.getMonth() == mesAComparar.getMonth()){
                System.out.println("Nombre: " + socios[i].getNombre() + " || DNI: " + socios[i].getDni() + " || E-mail: " + socios[i].getMail());
            }
        }
    }

    public void actividadSuscripcion(Suscripcion suscripcion){
        if (suscripcion == Suscripcion.BASICA){
            System.out.println("Actividades correspondientes a la suscripcion basica");
        } else if (suscripcion == Suscripcion.INTERMEDIA) {
            System.out.println("Actividades correspondientes a la suscripcion Intermedia");
        }else System.out.println("Actividades correspondientes a la suscripcion Destacada");
    }

    public void sociosPorSuscripcion(Suscripcion suscripcion){
        for (int i=0; i < indice; i++){
            if (suscripcion == socios[i].getSuscripcion()){
                System.out.println("Nombre: " + socios[i].getNombre() + " || DNI: " + socios[i].getDni() + " || E-mail: " + socios[i].getMail());
            }
        }
    }
}
