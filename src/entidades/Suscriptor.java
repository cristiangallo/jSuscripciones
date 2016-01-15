package entidades;

/**
 * Created by cgallo on 10/01/16.
 */
public class Suscriptor {
    private int id;
    private String nombre;
    private String apellido;
    private String razonSocial;
    private String telefono;
    private String celular;
    private String email;
    private TipoDocumento tipoResponsable;
    private TipoDocumento tipoDocumento;
    private String numeroDocumento;
    private Domicilio domicilio;

    private Suscriptor(){}

    public Suscriptor(int id, String nombre, String apellido, String razonSocial, String telefono, String celular,
                      String email, Domicilio domicilio, TipoDocumento tipoResponsable, TipoDocumento tipoDocumento,
                      String numeroDocumento){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.razonSocial = razonSocial;
        this.telefono = telefono;
        this.celular = celular;
        this. email = email;
        this.tipoResponsable = tipoResponsable;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.domicilio = domicilio;
    }

}
