package db;

import entidades.Suscriptor;
import entidades.TipoDocumento;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by cgallo on 10/01/16.
 */
public class DBTipoDocumento {

    public static TipoDocumento getById(int id) {
        TipoDocumento tipoDocumento = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = ConexionDB.getInstancia().getConexion().prepareStatement(
                    "select id, tipoDocumento, tipo from TiposDocumento where id = ?"
            );
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            if (rs != null && rs.next()) {
                tipoDocumento = new TipoDocumento(rs.getInt("id"), rs.getString("tipoDocumento"), rs.getString("tipo"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.cancel();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            ConexionDB.getInstancia().releaseConexion();
        }
        return tipoDocumento;
    }
}
