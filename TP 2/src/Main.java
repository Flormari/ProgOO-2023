import Ejercicio1.ClubDeFutbol;
import Ejercicio1.Suscripcion;
import Ejercicio2.AgenciaDeTurismo;
import Ejercicio2.Clasificacion;
import Ejercicio2.Provedor;
import Ejercicio3.*;

import java.time.LocalDate;

public class Main {
    public static void main (String[] arg){

        //--------------------[[EJERCICIO 1]]--------------------
        System.out.println("EJERCICIO 1");
        ClubDeFutbol club = new ClubDeFutbol(100);
        LocalDate fecha1 = LocalDate.of(1995, 5, 20);
        LocalDate fecha2 = LocalDate.of(2023, 5, 22);
        LocalDate fecha3 = LocalDate.of(2023, 9, 10);
        club.inscripcion("Juan", "41847263", fecha1, "Nro 3", "juan@gmail.com", Suscripcion.BASICA, fecha2);
        club.inscripcion("Pedro", "51843263", fecha1, "Nro 866", "pedro@gmail.com", Suscripcion.INTERMEDIA, fecha3);
        club.inscripcion("Pablo", "21867763", fecha1, "Nro 32", "pablo@gmail.com", Suscripcion.BASICA, fecha3);
        System.out.println("Nuevos Socios Inscriptos: ");
        //Punto 1
        club.sociosDelMes();
        //Punto 2
        System.out.println("Actividades clasificadas por suscripcion");
        club.actividadSuscripcion(Suscripcion.BASICA);
        club.actividadSuscripcion(Suscripcion.INTERMEDIA);
        club.actividadSuscripcion(Suscripcion.DESTACADA);
        //punto 3
        System.out.println("Socios clasificados por suscripcion adquirida");
        club.sociosPorSuscripcion(Suscripcion.BASICA);
        System.out.println("------------------------------------------------------");


        //--------------------[[EJERCICIO 2]]--------------------
        AgenciaDeTurismo agencia = new AgenciaDeTurismo();
        //crear provedores
        Provedor prov1 = new Provedor("companias aereas", Clasificacion.TRANSPORTE, 20);
        Provedor prov2 = new Provedor("hosterias", Clasificacion.HOSPEDAJE, 40);
        Provedor prov3 = new Provedor("guia", Clasificacion.EXCURSION, 60);
        Provedor prov4 = new Provedor("guia dos", Clasificacion.EXCURSION, 20);

        //agregar provedores
        agencia.setProvedor(prov1);
        agencia.setProvedor(prov2);
        agencia.setProvedor(prov3);
        agencia.setProvedor(prov4);

        //agregar paquetes
        agencia.setPaquete("Corrientes", prov1, prov2, prov4);
        agencia.setPaquete("Corrientes", prov1, prov2, prov4);
        agencia.setPaquete("Buenos Aires", prov1, prov2, prov4);
        agencia.setPaquete("Corrientes", prov1, prov2, prov4);
        agencia.setPaquete("Salta", prov1, prov2, prov4);

        //agregar clientes
        agencia.setClientes("Juan", "64825491", "Nro 20", "juan@gmail.com", "15748753");
        agencia.setClientes("Pablo", "24825491", "Nro 10", "pablo@gmail.com", "15728893");
        agencia.setClientes("Luis", "64695491", "Nro 60", "luis@gmail.com", "15734259");

        //compras
        agencia.realizarCompra(4, 0);
        agencia.realizarCompra(2, 1);
        agencia.realizarCompra(3, 2);

        //mostrar
        System.out.println("CLIENTES");
        agencia.mostrarClientes();
        System.out.println("PAQUETES");
        agencia.mostrarPaquetes();
        System.out.println("PROVEDORES");
        agencia.mostrarProvedores();
        System.out.println("COMPRAS REALIZADAS");
        agencia.organizarCompras();
        agencia.mostrarCompras();


        //--------------------[[EJERCICIO 3]]--------------------
        Academia secretaria = new Academia();
        //Profesor
        Profesor prof1 = new Profesor("Pedro", "63847263");
        Profesor prof2 = new Profesor("Laura", "13347893");

        //Diciplina
        secretaria.agregarDisciplina("Tango");
        secretaria.agregarDisciplina("Salsa");
        secretaria.agregarDisciplina("Clasico");

        //Comision
        Comision c1 = new Comision(5, "lunes", "15:00", Nivel.AVANZADO, prof1);
        Comision c2 = new Comision(4, "Martes", "15:00", Nivel.INICIAL, prof2);
        Comision c3 = new Comision(8, "jueves", "15:00", Nivel.INTERMEDIO, prof1);

        //agregar comision
        secretaria.agregarComisio(c1, "Tango");
        secretaria.agregarComisio(c2, "Tango");
        secretaria.agregarComisio(c3, "Salsa");

        //alumno
        Alumno alumno1 = new Alumno("pepe", "65439754", "pepe@gmail.com", "14782584");
        Alumno alumno2 = new Alumno("juan", "15469754", "juan@gmail.com", "15779584");
        Alumno alumno3 = new Alumno("romina", "25439774", "romina@gmail.com", "35792684");

        //agregar alumno
        int cre1 = secretaria.agregarAlumno(alumno1, 5);
        int cre2 = secretaria.agregarAlumno(alumno2, 4);
        int cre3 = secretaria.agregarAlumno(alumno3, 8);

        //listado
        secretaria.registrarAsistencia(cre1);
        secretaria.registrarAsistencia(cre2);
        secretaria.registrarAsistencia(cre2);
        secretaria.registrarAsistencia(cre1);
        secretaria.registrarAsistencia(cre1);
        secretaria.registrarAsistencia(cre3);

        System.out.println("---Lista de Aistencia---");
        System.out.println("DNI de profesor: 63847263");
        secretaria.listadoDeAsistencia("63847263");
        System.out.println("-------------");
        System.out.println("DNI de profesor: 13347893");
        secretaria.listadoDeAsistencia("13347893");
        System.out.println("-------------");
        System.out.println(" ");
        System.out.println("La disciplina de mayor ingreso es: " + secretaria.disciplinaMayorIngreso());

    }
}
