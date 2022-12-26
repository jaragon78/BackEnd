
package com.argentinaPrograma.Portfolio.Model;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.UniqueConstraint;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "usuario",uniqueConstraints = {
    @UniqueConstraint(columnNames = "username"),
    @UniqueConstraint(columnNames = "email")
})
public class Usuario {
    
    @Id
    @Basic
    //@TableGenerator(name="id_usr", table = "hibernate_sequences")
    @GeneratedValue(strategy = GenerationType.IDENTITY) //TABLE, generator = "id_usr")
    @Column(name = "id_usr")
    private Integer id_usr;

    //@NotBlank
    //@Size(max = 20)
    @Column(name = "username")
    private String username;
      
    @Column(name = "email")
    private String email;
    
    @Column(name = "password")
    private String password;

    //@Column(name = "token")
    //private String token;
    
    @Column(name = "persona_id")
    private Integer personaId;

    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "apellido")
    private String apellido;
    
    @ManyToMany(fetch = FetchType.LAZY) //fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(
            name = "usuario_rol",
            joinColumns = @JoinColumn(name = "usuario_id",referencedColumnName = "id_usr"),
            inverseJoinColumns = @JoinColumn(name = "rol_id",referencedColumnName = "id_rol"))
            private Set<Role> roles = new HashSet<>();
    
 //   private Collection<Role> roles;
    
    public Usuario() {
    }

    public Usuario(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }
        
    public Usuario(String username,String email, String password, Integer personaId, String nombre, String apellido){ //, Collection<Rol> roles) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.personaId = personaId;
        this.nombre = nombre;
        this.apellido = apellido;
        //this.roles = (Set<Role>) roles;
    }
     public Usuario(String nombre, String apellido, String username,String email, String password){ //, Collection<Rol> roles) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.username = username;
        this.email = email;
        this.password = password;
        //this.personaId = personaId;
        //this.roles = (Set<Role>) roles;
    }
     
    public Usuario(Integer id_usr, String username, String email, String password, 
            Integer persona, String nombre, String apellido) {        
        this.id_usr = id_usr;
        this.username = username;
        this.email = email;
        this.password = password;
        this.personaId = persona;
        this.nombre = nombre;
        this.apellido = apellido;
    }
     
}