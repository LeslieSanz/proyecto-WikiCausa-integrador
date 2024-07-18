package modelo;

public class MenuDetalleDTO {
    private int idMenuDetalle;
    private int menuIdMenu;
    private String recetaIdReceta;
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

    public String getRecetaIdReceta() {
        return recetaIdReceta;
    }

    public void setRecetaIdReceta(String recetaIdReceta) {
        this.recetaIdReceta = recetaIdReceta;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }
}
