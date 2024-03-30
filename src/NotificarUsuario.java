public class NotificarUsuario implements UsuarioTarea {
    @Override
    public void actualizar(Tarea tarea) {
        System.out.println("Notificación: ¡La tarea '" + tarea.getTitulo() + "' está próxima a su fecha de vencimiento! "+ tarea.getFechaVencimiento());
        }

}
