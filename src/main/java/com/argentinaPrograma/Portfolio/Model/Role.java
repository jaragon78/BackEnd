
package com.argentinaPrograma.Portfolio.Model;
import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Role {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id_rol;

  @Enumerated(EnumType.STRING)
  @Column(length = 20)
  private ERole name;

  public Role() {

  }

  public Role(ERole name) {
    this.name = name;
  }

  public Integer getId() {
    return id_rol;
  }

  public void setId(Integer id) {
    this.id_rol = id;
  }

  public ERole getName() {
    return name;
  }

  public void setName(ERole name) {
    this.name = name;
  }
}
