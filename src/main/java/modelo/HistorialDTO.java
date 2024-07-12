package modelo;

public class HistorialDTO {
    private String fecha;
    private MenuDTO menu;
    private RecetaDTO receta;
    private String confirmacion;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public MenuDTO getMenu() {
        return menu;
    }

    public void setMenu(MenuDTO menu) {
        this.menu = menu;
    }

    public RecetaDTO getReceta() {
        return receta;
    }

    public void setReceta(RecetaDTO receta) {
        this.receta = receta;
    }

    public String getConfirmacion() {
        return confirmacion;
    }

    public void setConfirmacion(String confirmacion) {
        this.confirmacion = confirmacion;
    }
}
