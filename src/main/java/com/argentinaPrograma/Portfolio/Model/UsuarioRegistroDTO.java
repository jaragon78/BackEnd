
package com.argentinaPrograma.Portfolio.Model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UsuarioRegistroDTO {

   // private Integer id_dto;
    private String email;
    private String password;
    private String token;
  //  private Integer personaId;
  //  private String nombre;
  //  private String apellido;
    
    public UsuarioRegistroDTO() {
    }

    public UsuarioRegistroDTO(String email) {
        this.email = email;
    }

    public UsuarioRegistroDTO(String email, String password,String token 
            //Integer personaId, String nombre, String apellido, 
            ) {
        this.email = email;
        this.password = password;
        this.token = token;
      //  this.personaId = personaId;
      //  this.nombre = nombre;
      //  this.apellido = apellido;
    }

    public UsuarioRegistroDTO(Integer id_dto, String email, String password, 
            String token){
        //    Integer personaId, String nombre, String apellido) {
     //   this.id_dto = id_dto;
        this.email = email;
        this.password = password;
        this.token = token;
     //   this.personaId = personaId;
     //   this.nombre = nombre;
     //   this.apellido = apellido;
    }

}
