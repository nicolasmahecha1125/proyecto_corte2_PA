import java.util.ArrayList;
import java.util.List;


class GestorTareas {
    private static GestorTareas instancia;
    private List<Tarea> tareas;
    private List<UsuarioTarea> usuarios;

    private GestorTareas() {
        tareas = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    public static GestorTareas obtenerInstancia() {
        if (instancia == null) {
            instancia = new GestorTareas();
        }
        return instancia;
    }

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
        notificarUsuario(tarea);
    }

    public void marcarTareaComoCompletada(Tarea tarea) {
        tarea.setCompletada(true);
        System.out.println(tarea.getTitulo()+ " completada el " + tarea.getFechaVencimiento());
    }

    public List<Tarea> obtenerTareasPendientes() {
        List<Tarea> tareasPendientes = new ArrayList<>();
        for (Tarea tarea : tareas) {
            if (!tarea.isCompletada()) {
                tareasPendientes.add(tarea);
            }
        }
        return tareasPendientes;
    }
    public List<Tarea> obtenerTareasCompletadas() {
        List<Tarea> tareasCompletadas = new ArrayList<>();
        for (Tarea tarea : tareas) {
            if (tarea.isCompletada()) {
                tareasCompletadas.add(tarea);
            }
        }
        return tareasCompletadas;
    }

    public void agregarUsuario(UsuarioTarea usuario) {
        usuarios.add(usuario);
    }

    public void quitarUsuario(UsuarioTarea usuario) {

        usuarios.remove(usuario);
    }

    private void notificarUsuario(Tarea tarea) {
        for (UsuarioTarea usuario : usuarios) {
            usuario.actualizar(tarea);
        }
    }
    private void notificarUsuariosCompletados(Tarea tarea) {
        for (UsuarioTarea usuario : usuarios) {
            usuario.actualizar(tarea);
        }
    }
}

