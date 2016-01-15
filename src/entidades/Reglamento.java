package entidades;

import java.math.BigDecimal;

/**
 * Created by cgallo on 10/01/16.
 */
public class Reglamento {
    int periodoMinimo = 3;
    int cantDiasRenuevaSuscri = 7;
    int cantDiasActivaSuscri = 7;
    private BigDecimal precioLun;
    private BigDecimal precioMar;
    private BigDecimal precioMie;
    private BigDecimal precioJue;
    private BigDecimal precioVie;
    private BigDecimal precioSab;
    private BigDecimal precioDom;

    private static Reglamento instancia;

    public static Reglamento getInstance() {
        if(instancia == null){
            instancia = new Reglamento();
        }
        return instancia;
    }

    private Reglamento() {}
}
