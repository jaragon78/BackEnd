
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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "tecnologia")
public class Tecnologia {
    @Id
    @Basic
    //@TableGenerator(name="id_tec", table = "hibernate_sequences")
    @GeneratedValue(strategy = GenerationType.IDENTITY)//, generator = "id_tec")
    @Column(name = "id_tec")
    private Integer id_tec;
    @Column(name = "skill")
    private String skill; 
    @Column(name = "porc")
    private Integer porc;
    
    @Column(name = "persona_id")
    private Integer personaId;
    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name="persona_id", nullable=false)
    //private Persona persona;
    
    //@Column(name = "tipo_tecnologia_id")
    //private Integer tecnologiaId;
    
    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name="tipo_tecnologia_id", nullable=false)
    //private TipoTecnologia tipoTecnologia;

    
    public Tecnologia() {
    }

    public Tecnologia(Integer id_tec, String skill, Integer porc, Integer personaId) {
        this.id_tec = id_tec;
        this.skill = skill;
        this.porc = porc;
        this.personaId = personaId;
    }
   
}
