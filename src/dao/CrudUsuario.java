/*
 *   Author: Ing. Jose Luis Tapia
 *   Fecha: 18/11/2014  Hora:12:39pm
 */
package dao;

import java.sql.Connection;
import domain.Usuario;
import implementsUser.BDaoUsuario;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class CrudUsuario implements BDaoUsuario {

    private String base = "terceroa";
    private Conexion conexion = null;

    public CrudUsuario() {
        this.conexion = new Conexion();
    }

    @Override
    public String create(Usuario obj) {
        String res = "Datos Guardados";
        var sql = "Insert into usuario(usuario, pasword, nombres, apellidos, correo, estado) "
                + "values (?,?,?,?,?,?)";
        try (
                Connection conect = this.conexion.conectar(base); PreparedStatement st = conect.prepareStatement(sql)) {
            st.setString(1, obj.getUsuario());
            st.setString(2, obj.getContra());
            st.setString(3, obj.getNombre());
            st.setString(4, obj.getApellidos());
            st.setString(5, obj.getEmail());
            st.setString(6, "A");
            st.executeUpdate();
        } catch (SQLException ex) {
            res = "" + ex;
            Logger.getLogger(CrudUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }

    @Override
    public List<Usuario> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Usuario getOne(String idUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String update(Usuario obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String delete(String idUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
