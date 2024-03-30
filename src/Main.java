import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear instancia del GestorTareas
        GestorTareas gestorTareas = GestorTareas.obtenerInstancia();

        // Agregar observadores
        gestorTareas.agregarUsuario(new NotificarUsuario());

        System.out.println("Notificaciones");

        // Agregar tareas
        Tarea tarea1 = new Tarea("Tarea 1", "Descripción de la Tarea 1", LocalDate.now());
        gestorTareas.agregarTarea(tarea1);
        Tarea tarea2 = new Tarea("Tarea2","descripcion tarea 2",LocalDate.now());

        gestorTareas.agregarTarea(tarea2);

        // Marcar tarea como completada
        gestorTareas.marcarTareaComoCompletada(tarea1);

        System.out.println("------------------------------------------------");

        // Obtener tareas pendientes
        List<Tarea> tareasPendientes = gestorTareas.obtenerTareasPendientes();
        System.out.println("Tareas pendientes:");
        for (Tarea tarea : tareasPendientes) {
            System.out.println("- " + tarea.getTitulo());

        }
        System.out.println("------------------------------------------------");
        // Obtener tareas completadas
        List<Tarea> tareasCompletadas = gestorTareas.obtenerTareasCompletadas();
        System.out.println("Tareas completadas:");
        for (Tarea tarea : tareasCompletadas) {
            System.out.println("- " + tarea.getTitulo());
        }
    }
}
