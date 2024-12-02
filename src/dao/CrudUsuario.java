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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
/**
 *
 * @author user
 */
public class CrudUsuario implements BDaoUsuario {

    private String base = "terceroa1";
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
                Connection conect = this.conexion.conectar(base); 
                PreparedStatement st = conect.prepareStatement(sql)) {
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
       List<Usuario>lista=new ArrayList<>();
       String query = "select * from usuario where estado='A'";
       try(Connection conect = this.conexion.conectar(base);
               PreparedStatement st = conect.prepareStatement(query);
               ResultSet rs = st.executeQuery()){
            while(rs.next()){
                var obj = new Usuario(rs.getString("usuario"),
                rs.getString("pasword"), rs.getString("nombres"),
                        rs.getString("apellidos"), rs.getString("correo"),
                rs.getString("estado"));
                lista.add(obj);
            }
       } catch (SQLException ex){
           
       }
        return lista;
    }

    @Override
    public Usuario getOne(String idUsuario) {
        return null;
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
