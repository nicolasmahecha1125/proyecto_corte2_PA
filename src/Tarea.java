import java.time.LocalDate;
import java.util.Date;

class Tarea {
    private String titulo;
    private String descripcion;
    private LocalDate fechaVencimiento;
    private boolean completada;

    public Tarea(String titulo, String descripcion,LocalDate fechaVencimiento) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaVencimiento = fechaVencimiento;
        this.completada = false;
    }

    public String getTitulo() {

        return titulo;
    }

    public String getDescripcion() {

        return descripcion;
    }

    public LocalDate getFechaVencimiento (){
        return  fechaVencimiento;
    }

    public boolean isCompletada() {

        return completada;
    }

    public void setCompletada(boolean completada) {

        this.completada = completada;
    }
}
