/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
@Table(name = "educacion")
public class Educacion {
    @Id
    @Basic
    //@TableGenerator(name="id_edu", table = "hibernate_sequences")
    @GeneratedValue(strategy = GenerationType.IDENTITY)//, generator = "id_edu")
    @Column(name = "id_edu")
    private Integer id_edu;
    @Column(name = "universidad")
    private String universidad;
    @Column(name = "titulo")
    private String titulo;    
    @Column(name = "fechaInicio")
    private Date fechaInicio; 
    @Column(name = "fechaFin")
    private Date fechaFin; 
    @Column(name = "logo")
    private String logo;
    @Column(name = "paginaWeb")
    private String paginaWeb;    
    
    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name="persona_id", nullable=false)
    //private Persona persona;
   
    @Column(name = "persona_id")
    private Integer personaId;
        
    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name="institucion_id", nullable=false)
    //private Institucion institucion;
    
    //@Column(name = "institucion_id")
    //private Integer institucionId;
        
    public Educacion() {
    }

    public Educacion(Integer id_edu, String universidad, String titulo, Date fechaInicio, Date fechaFin, String logo, String paginaWeb, Integer personaId) {
        this.id_edu = id_edu;
        this.universidad = universidad;
        this.titulo = titulo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.logo = logo;
        this.paginaWeb = paginaWeb;
        this.personaId = personaId;
    }
   
}
