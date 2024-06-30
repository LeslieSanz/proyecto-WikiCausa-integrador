package modelo;

public class IngredienteDTO {
    private int id;
    private String nombre;
    private TipoIngrediente tipo;
    private MedidaDTO medida;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoIngrediente getTipo() {
        return tipo;
    }

    public void setTipo(TipoIngrediente tipo) {
        this.tipo = tipo;
    }

    public MedidaDTO getMedida() {
        return medida;
    }

    public void setMedida(MedidaDTO medida) {
        this.medida = medida;
    }
 
    
}
