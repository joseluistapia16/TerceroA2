/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author user
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    private Integer id_usuario;
    private String usuario;
    private String contra;
    private String nombre;
    private String apellidos;
    private String email;
    
    @Builder
    public Usuario(String usuario,String contra,String nombre,String apellidos, String email) {
        this.usuario = usuario;
        this.contra = contra;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email=email;
    }
    
}
