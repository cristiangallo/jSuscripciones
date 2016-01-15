package entidades;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by cgallo on 10/01/16.
 */
public class Renovacion {
    private int id;
    private Suscripcion suscripcion;
    private Date desde;
    private Date hasta;
    private BigDecimal importe;
    private Date fechaFacturacion;
    private Date fechaVencimiento;
    private Date fechaCobro;
    private String comprobante;
    private MedioPago medioPago;

    private Renovacion(){}

}
