package db;

import entidades.Suscriptor;

/**
 * Created by cgallo on 10/01/16.
 */

public class CatalogoSuscriptores {

    private static CatalogoSuscriptores instancia;

    public static CatalogoSuscriptores getInstance() {
        if(instancia == null){
            instancia = new CatalogoSuscriptores();
        }
        return instancia;
    }
    // hago privado el constructor para que nadie pueda instanciar
    private CatalogoSuscriptores() {}

    public Suscriptor getByTipoNroDocumento(int tipdoc, String nrodoc) {
        Suscriptor suscriptor = DBSuscriptor.getByTipoNroDocumento(tipdoc, nrodoc);
        return suscriptor;
    }

    public void save(Suscriptor suscriptor) {
       // DBSuscriptor.save(suscriptor);
    }
}
