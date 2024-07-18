package modelo;

import java.util.List;

public class DespensaDTO {
    private int idDespensa;
    private String nombre;
    private String fecha;
    private int cantidad;
    private String medida;
    private List<IngredienteDTO> ingredientes;

    public DespensaDTO(String nombre, int cantidad, String medida) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.medida = medida;
    }

    public DespensaDTO() {
    }

    public int getIdDespensa() {
        return idDespensa;
    }

    public void setIdDespensa(int idDespensa) {
        this.idDespensa = idDespensa;
    }
    
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public List<IngredienteDTO> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<IngredienteDTO> ingredientes) {
        this.ingredientes = ingredientes;
    }
}
