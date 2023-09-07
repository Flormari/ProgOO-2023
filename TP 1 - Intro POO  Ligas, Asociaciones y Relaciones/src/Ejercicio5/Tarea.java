package Ejercicio5;
import java.time.LocalDate;
public class Tarea {
    //Atributos
    private String descripcion;
    private String prioridad;
    private boolean estado;
    private LocalDate fechaLimite;

    //Metodos
    public Tarea(String unaDescripcion, String unaPrioridad, LocalDate unaFechaLimite) {
        descripcion = unaDescripcion;
        prioridad = unaPrioridad;
        estado = false;
        fechaLimite = unaFechaLimite;
    }

    public void cambiarPrioridad(String nuevaPrioridad) {
        prioridad = nuevaPrioridad;
    }

    public void modificarDescripcion(String nuevaDescripcion) {
        descripcion = nuevaDescripcion;
    }

    public boolean estaVencida() {
        LocalDate fechaActual = LocalDate.now();
        return !estado && fechaLimite.isBefore(fechaActual);
    }

    public boolean estaCompleta() {
        return estado;
    }

    public void terminarTarea() {
        estado = true;
    }

    public String mostrarTarea() {
        String mensaje = "";
        if (estaCompleta()) {
            mensaje += "(Vencida) ";
        }
        mensaje += descripcion + " - Prioridad: " + prioridad;
        return mensaje;
    }
}
