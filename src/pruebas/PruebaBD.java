/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas;

import dao.Conexion;
import dao.CrudUsuario;
import domain.Usuario;

/**
 *
 * @author user
 */
public class PruebaBD {

    public static void main(String[] args) {
        base();
    }

    private static void base() {
        Conexion obp = new Conexion();
        System.out.println(obp.conectar("terceroa"));
        CrudUsuario crud = new CrudUsuario();
        var usu = new Usuario("terceroA", "1234", "Jose Carlos", "Lino Perez", "linoperez@gmail.com");
        var res = crud.create(usu);
        System.out.println(res);
    }

}
