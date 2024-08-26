/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package implementsUser;

import domain.Usuario;
import java.util.List;


public interface DaoUsers {
    public String create(String ruta, String msg, boolean modo);
    public List<Usuario>getAll(String ruta);
    public Usuario getOne(String ruta, String usuario);
    public String update(String ruta, Usuario obj);
    public String delete(String ruta, String usuario);
}
