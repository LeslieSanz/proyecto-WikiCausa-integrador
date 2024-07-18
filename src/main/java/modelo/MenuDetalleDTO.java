package modelo;

public class MenuDetalleDTO {
    private int idMenuDetalle;
    private int menuIdMenu;
    private RecetaDTO receta;
    private int orden;
    
    // Getters y setters
    public int getIdMenuDetalle() {
        return idMenuDetalle;
    }

    public void setIdMenuDetalle(int idMenuDetalle) {
        this.idMenuDetalle = idMenuDetalle;
    }

    public int getMenuIdMenu() {
        return menuIdMenu;
    }

    public void setMenuIdMenu(int menuIdMenu) {
        this.menuIdMenu = menuIdMenu;
    }

    public RecetaDTO getReceta() {
        return receta;
    }

    public void setReceta(RecetaDTO receta) {
        this.receta = receta;
    }

    
    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }
}
