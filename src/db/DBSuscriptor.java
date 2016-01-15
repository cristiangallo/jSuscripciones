package db;

import entidades.Domicilio;
import entidades.Suscriptor;
import entidades.TipoDocumento;
import entidades.Usuario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by cgallo on 10/01/16.
 */
public class DBSuscriptor {

    public static Suscriptor getByTipoNroDocumento(int tipdoc, String nrodoc) {
        Suscriptor suscriptor = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = ConexionDB.getInstancia().getConexion().prepareStatement(
                    "select * from Suscriptores where tipoDocumento = ? and numeroDocumento = ?"
            );
            stmt.setInt(1, tipdoc);
            stmt.setString(2, nrodoc);
            rs = stmt.executeQuery();
            if (rs != null && rs.next()) {
                TipoDocumento tipoResponsable = DBTipoDocumento.getById(rs.getInt("tipoResponsable_id"));
                TipoDocumento tipoDocumento = DBTipoDocumento.getById(rs.getInt("tipoDocumento_id"));
                Domicilio domicilio = null;
                suscriptor = new Suscriptor(rs.getInt("id"), rs.getString("nombre"), rs.getString("apellido"),
                        rs.getString("razonSocial"), rs.getString("telefono"), rs.getString("celular"), rs.getString("email"),
                        domicilio, tipoResponsable, tipoDocumento, rs.getString("numeroDocumento"));
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
        return suscriptor;
    }
/*
    public static void save(Suscriptor suscriptor) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = ConexionDB.getInstancia().getConexion().prepareStatement(
                    "insert into suscriptores (dni, nombre, apellido) values (?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS
            );
            stmt.setInt(1, jugador.getDni());
            stmt.setString(2, jugador.getNombre());
            stmt.setString(3, jugador.getApellido());
            stmt.execute();
            rs = stmt.getGeneratedKeys();
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
    }
*/
}