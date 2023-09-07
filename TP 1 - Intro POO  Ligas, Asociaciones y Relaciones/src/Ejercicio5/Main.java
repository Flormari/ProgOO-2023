package Ejercicio5;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        //Inicializar
        LocalDate fechaSiguiente = LocalDate.now().plusDays(1);
        LocalDate fechaAnterior = LocalDate.now().minusDays(1);
        Tarea tarea1 = new Tarea("Ir al supermercado mañana", "Intermedio", fechaSiguiente);
        Tarea tarea2 = new Tarea("Consultar repuesto del auto", "Alta", fechaAnterior);
        Tarea tarea3 = new Tarea("Ir al cine a ver la nueva película de Marvel", "Baja", fechaAnterior);

        // Mostrar información de las tareas
        System.out.println("-----[ Mostrar Tareas ]-----");
        System.out.println("Tarea 1: " + tarea1.mostrarTarea() + " - ¿Esta vencido?: " + tarea1.estaVencida());
        System.out.println("Tarea 2: " + tarea2.mostrarTarea() + " - ¿Esta vencido?: " + tarea2.estaVencida());
        System.out.println("Tarea 3: " + tarea3.mostrarTarea() + " - ¿Esta vencido?: " + tarea3.estaVencida());
    }
}
