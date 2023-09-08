package Ejercicio9;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fecha {
    //Atributos
    private LocalDate fecha;
    private int formato; //Solo puede ser 1 o 2

    //Metodos
    public Fecha(String unaFecha, int unFormato) throws ParseException {
        formato = unFormato;
        if (unFormato == 1) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            fecha = LocalDate.parse(unaFecha, formatter);
        } else if (unFormato == 2) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
            fecha = LocalDate.parse(unaFecha, formatter);
        } else {
            throw new IllegalArgumentException("El formato no es valido. Solo puede ser 1 o 2");
        }
    }

    public LocalDate getFecha(){
        return fecha;
    }

    public void mostrarFecha(){
        String unFormato;
        if(formato==1){
            unFormato = "dd/MM/yyyy";
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(unFormato);
            System.out.println(fecha.format(formatter));
        }
        else{
            unFormato = "MM/dd/yyyy";
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(unFormato);
            System.out.println(fecha.format(formatter));
        }
    }

    public boolean estaEntreDosFechas(LocalDate fechaAnterior,LocalDate fechaSiguiente){
        return (fecha.isBefore(fechaSiguiente)) && fecha.isAfter(fechaAnterior);
    }

    public boolean esMenor(LocalDate unaFecha){
        return fecha.isBefore(unaFecha);
    }

    public boolean esMayor(LocalDate unaFecha){
        return fecha.isAfter(unaFecha);
    }
}
