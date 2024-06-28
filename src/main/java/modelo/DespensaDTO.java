/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author yosse
 */
public class DespensaDTO {

    private String idDespensa;
    private String nombre;
    private String fecha;
    private int cantidad;
    private String medida;

    public DespensaDTO(String nombre, int cantidad, String medida) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.medida = medida;
    }

    public DespensaDTO() {
    }
    
    

    public String getIdDespensa() {
        return idDespensa;
    }

    public void setIdDespensa(String idDespensa) {
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
    
    
    
    
}
