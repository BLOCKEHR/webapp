package com.inventor.app.model;



import java.sql.Date;

import com.inventor.app.config.Credenciales;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Usuario")
public class Usuario {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
    private Long userId;

   

    @Column(name = "user_nombre") // Especifica el nombre de la columna en la base de datos
    private String userNombre;

    @Column(name = "user_apellido")
    private String userApellido;

    @Column(name = "user_correo",unique = true)
    private String userCorreo;

    @Column(name = "user_edad")
    private Integer userEdad;

    @Column(name = "user_sexo")//genero xd
    private String userSexo;

    @Column(name = "user_tipo")
    private String userTipo;

    // MODIFICACION DE USUARIO / MEJOR ABSTRACCION DE DATOS
    @Column(name = "Dni",length = 8) 
    private int Dni;

    @Column(name = "CarneExtranjeria",length = 12) 
    private String CarneExtranjeria;
    
    @Column(name = "FechaNacimiento") 
    private Date FechaNacimiento;

    @Column(name = "Telefono",length = 9)
    private int Telefono;

    @Column(name = "Direccion") 
    private String Direccion;

    @OneToOne
    private Credenciales credenciales;


}
