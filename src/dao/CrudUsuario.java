/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import domain.Usuario;
import implementsUser.BDaoUsuario;
import java.sql.PreparedStatement;
import java.util.List;

/**
 *
 * @author user
 */
public class CrudUsuario implements BDaoUsuario{
    private String base ="terceroa";
    private Conexion conexion = null;
    
    public CrudUsuario (){
        this.conexion=new Conexion();
    }
    

    @Override
    public String create(Usuario obj) {
      String res = "Datos Guardados";
      var sql="Insert into usuario(usuario, password, nombres, apellidos, correo, estado) "
                + "values (?,?,?,?,?,?)";  
      try (
              Connection conect = this.conexion.conectar(base);
              PreparedStatement st = conect.prepareStatement(sql)
              ){
          st.setString(1,obj.getUsuario());
          st.setString(2,obj.getContra());
          st.setString(3,obj.getNombre());
          st.setString(4,obj.getApellidos());
          st.setString(5,obj.getEmail());
          st.setString(6,"A");
      }catch (Exception ex){
         res = "error al insertar datos";
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
