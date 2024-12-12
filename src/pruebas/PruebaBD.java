/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas;

import dao.Conexion;
import dao.CrudUsuario;
import domain.Usuario;
import java.util.List;

/**
 *
 * @author user
 */
public class PruebaBD {

    public static void main(String[] args) {
        Actualizar();
    }

    private static void base() {
        Conexion obp = new Conexion();
        System.out.println(obp.conectar("terceroa1"));
        CrudUsuario crud = new CrudUsuario();
        var usu = new Usuario("jossergueza", "0930136106", "Jose guevara", "ernesto zambrano", "linoperez@gmail.com", "A");
        var res = crud.create(usu);
        System.out.println(res);
    }
    
    private static void consulta(){
        CrudUsuario crud = new CrudUsuario();
        List <Usuario>lista=crud.getAll();
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).toString());
        }
    }
    
    private static void Actualizar() {
        CrudUsuario crud = new CrudUsuario();
        var usu = new Usuario("pepe", "0930347166", "Jose Manuel", "ernesto zambrano", "linojose@gmail.com", "B");
        var res = crud.update(usu);
        System.out.println(res);
    }
    

}
