
package com.argentinaPrograma.Portfolio.Model;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "proyecto")
public class Proyecto {
    @Id
    @Basic
    //@TableGenerator(name="id_proy", table = "hibernate_sequences")
    @GeneratedValue(strategy = GenerationType.IDENTITY)//, generator = "id_proy")
    @Column(name = "id_proy")
    private Integer id_proy;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "comentario")
    @Size(max = 4000)
    private String comentario;

    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name="persona_id", nullable=false)
    //private Persona persona;
    
    @Column(name = "persona_id")
    private Integer personaId;
        
    public Proyecto() {
    }

    public Proyecto(Integer id_proy, String nombre, String descripcion, String comentario, Integer persona_id) {
        this.id_proy = id_proy;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.comentario = comentario;
        this.personaId = persona_id;
    }
}
