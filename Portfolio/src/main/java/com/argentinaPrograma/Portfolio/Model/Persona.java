
package com.argentinaPrograma.Portfolio.Model;

import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "persona")
public class Persona {
    @Id
    @Basic
    //@TableGenerator(name="id_per", table = "hibernate_sequences")
    @GeneratedValue(strategy = GenerationType.IDENTITY)//, generator = "id_per")
   // @OneToMany(mappedBy="persona")
    @Column(name = "id_per")
    private Integer id_per;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "fechaNac")
    private Date fechaNac; 
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "correo")
    private String correo;
    @Column(name = "sobre_mi")
    @Size(max = 4000)
    private String sobre_mi; 
    @Column(name = "url_foto")
    private String url_foto;
    @Column(name = "url_fondo")
    private String url_fondo;
    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name="domicilio_id", nullable=false)
    //private Domicilio domicilio;
 
//    @Column(name = "domicilio_id")
  //  private Domicilio domicilioId;

//    @OneToMany(mappedBy="personaId",
//               orphanRemoval = true,
//               fetch = FetchType.LAZY,
//               cascade = CascadeType.ALL)
//    private List<Domicilio> domicilioList;
    
//    @OneToMany(mappedBy="personaId",
//               orphanRemoval = true,
//               fetch = FetchType.LAZY,
//               cascade = CascadeType.ALL)
//    private List<Educacion> educacionList;

//    @OneToMany(mappedBy="personaId",
//               orphanRemoval = true,
//               fetch = FetchType.LAZY,
//               cascade = CascadeType.ALL)
//    private List<ExpLaboral> expLaboralList;
        
    //@OneToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name = "usuario_id", nullable=false) //referencedColumnName = "id")
    //private Usuario usuario; 

    //@OneToOne(mappedBy = "personaId")
    //private Usuario usuario;

//    @OneToMany(mappedBy="personaId",
//               orphanRemoval = true,
//               fetch = FetchType.LAZY,
//              cascade = CascadeType.ALL)
//    private List<Usuario> usuarioList;
    
//    @OneToMany(mappedBy="personaId",
//               orphanRemoval = true,
//               fetch = FetchType.LAZY,
//               cascade = CascadeType.ALL)
//    private List<Proyecto> proyectoList;

//    @OneToMany(mappedBy="personaId",
//               orphanRemoval = true,
//               fetch = FetchType.LAZY,
//               cascade = CascadeType.ALL)
//    private List<Tecnologia> tecnologiaList;
        
    public Persona() {
    }

    public Persona(Integer id_per, String nombre, String apellido, Date fechaNac, 
            String telefono, String correo, String sobre_mi, String url_foto){ 
            //List<Domicilio> domicilioList, List<Educacion> educaciones, List<ExpLaboral> expLaborales, 
           // List<Usuario> usuario, List<Proyecto> proyectos, List<Tecnologia> tecnologias) {
        this.id_per = id_per;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.telefono = telefono;
        this.correo = correo;
        this.sobre_mi = sobre_mi;
        this.url_foto = url_foto;
//        this.domicilioList = domicilioList;
//        this.educacionList = educaciones;
//        this.expLaboralList = expLaborales;
//        this.usuarioList = usuario;
//        this.proyectoList = proyectos;
//        this.tecnologiaList = tecnologias;
    }
 
}
