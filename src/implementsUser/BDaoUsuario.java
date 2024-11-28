/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package implementsUser;

import domain.Usuario;
import java.util.List;

/**
 *
 * @author user
 */
public interface BDaoUsuario {

    public String create(Usuario obj);

    public List<Usuario> getAll();

    public Usuario getOne(String idUsuario);

    public String update(Usuario obj);

    public String delete(String idUsuario);
}
