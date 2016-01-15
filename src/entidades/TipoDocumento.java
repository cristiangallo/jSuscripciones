package entidades;

/**
 * Created by cgallo on 10/01/16.
 */
public class TipoDocumento {
    private int id;
    private String tipoDocumento;
    private String tipo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    private TipoDocumento(){}

    public  TipoDocumento(int id, String tipoDocumento, String tipo){
        this.id = id;
        this.tipoDocumento = tipoDocumento;
        this.tipo = tipo;
    }
}
