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
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "experiencia_laboral")
public class ExpLaboral {
    @Id
    @Basic
    //@TableGenerator(name="id_expLab", table = "hibernate_sequences")
    @GeneratedValue(strategy = GenerationType.IDENTITY)//, generator = "id_expLab")
    @Column(name = "id_expLAb")
    private Integer id_expLab;
    @Column(name = "nombre_empresa")
    private String nombre_empresa;
    @Column(name = "esTrabajoActual")
    private Boolean esTrabajoActual;    
    @Column(name = "fechaInicio")
    private Date fechaInicio;
    @Column(name = "fechaFin")
    private Date fechaFin; 
    @Column(name = "tipoEmpleo")
    private String tipoEmpleo;  
    @Column(name = "descripcion")
    @Size(max = 1000)
    private String descripcion; 
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
    //@JoinColumn(name="tipo_empleo_id", nullable=false)
    //private TipoEmpleo tipoEmpleo;
    
    //@Column(name = "tipo_empleo_id")
    //private Integer tipoEmpleoId;
        
    public ExpLaboral() {
    }

    public ExpLaboral(Integer id_expLab, String nombre_empresa, Boolean esTrabajoActual, 
            Date fechaInicio, Date fechaFin, String tipoEmpleo, String descripcion, 
            String logo, String paginaWeb, Integer personaId) {
        this.id_expLab = id_expLab;
        this.nombre_empresa = nombre_empresa;
        this.esTrabajoActual = esTrabajoActual;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.tipoEmpleo = tipoEmpleo;
        this.descripcion = descripcion;
        this.logo = logo;
        this.paginaWeb = paginaWeb;
        this.personaId = personaId;
    }

}
