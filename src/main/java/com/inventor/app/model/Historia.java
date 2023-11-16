package com.inventor.app.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Historia {
 @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idHist;

    @OneToOne
    private Paciente histPaciente;

    @OneToOne
    private Doctor histDoctor;

  /* 
    private String histDiagnostico;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime fechaHoraHistoriaAtencion;
    
    private String pertenenciaEtnicaHist;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime fechaHoraHistoriaActual;

    private String LnacimientoHit;

    private String gradoDeInstruccion;

    private String grupoSanguineo;

    private boolean factorRh;

    private String dniFamiliar;

    private String histNotas;
    
    */

    //  HISTORIA CLINICA V.2

    @Column(name = "MedicamentoRecetado") 
    private String MedicamentoRecetado;
    
    @Column(name = "FechaAtencion")       //DONE 1
    private LocalDateTime FechaAtencion;
    
    //@Column(name = "Apellido") 
    //private String Apellido;
    
    //@Column(name = "Nombre") 
    //private String Nombre;
    
    @Column(name = "Genero")      //DONE 8
    private String Genero;
    
    @Column(name = "Edad")        //DONE 9
    private int Edad;

    @Column(name = "PertenenciaEtnica") //DONE 5
    private String PertenenciaEtnica;
    
    @Column(name = "LugarNacimiento")   //DONE 4
    private String LugarNacimiento;
    
    @Column(name = "GradoInstruccion")  //DONE 8
    private String GradoInstruccion;
    
    @Column(name = "GrupoSanguineo")    //DONE 6
    private String GrupoSanguineo;

    @Column(name = "FactorRh")          //DONE 7
    private boolean FactorRh;
    
    @Column(name = "DniMadre")          //DONE 2
    private int DniMadre;

    @Column(name = "DniPadre")          //DONE 3
    private int DniPadre;

  //  ANTECEDENTE PERSONAL

    @Column(name = "Patologicos")       //DONE 10
    private String Patologicos;

    @Column(name = "Quirurgicos") 
    private String Quirurgicos;
        
    @Column(name = "Laborales") 
    private String Laborales;
    
    @Column(name = "TerapiasAlternativas") 
    private String TerapiasAlternativas;
    
    @Column(name = "EstiloVida") 
    private String EstiloVida;
    
    @Column(name = "Familiar") 
    private String Familiar;
    
    @Column(name = "Infantil") 
    private String Infantil;

    @Column(name = "EsquemaVacunacion") 
    private boolean EsquemaVacunacion;

  //  ANAMNESIS

    @Column(name = "MotivoConsulta") 
    private String MotivoConsulta;
    
    @Column(name = "FormaInicio") 
    private String FormaInicio;
        
    @Column(name = "TiempoEnfermedad") 
    private String TiempoEnfermedad;

  //  TRIAJE

    @Column(name = "PresionArteriaS") 
    private String PresionArteriaS;

    @Column(name = "PresionArteriaD") 
    private String PresionArteriaD;
    
    @Column(name = "Respiracion") 
    private String Respiracion;
        
    @Column(name = "Pulso") 
    private String Pulso;
    
    @Column(name = "Temperatura") 
    private String Temperatura;
        
    @Column(name = "Peso") 
    private String Peso;
    
    @Column(name = "Talla") 
    private String Talla;

    //  DIAGNOSTICO ACTUAL
    
    @Column(name = "Diagnostico") 
    private String Diagnostico;

    //  ADULTO MAYOR

    @Column(name = "MedicamentosFrecuentes") 
    private String MedicamentosFrecuentes;
    
    @Column(name = "ValoracionFuncional") 
    private String ValoracionFuncional;
    
    @Column(name = "ValoracionMental") 
    private String ValoracionMental;
    
    @Column(name = "ValoracionSocioFamiliar") 
    private String ValoracionSocioFamiliar;
    
    @Column(name = "CategoriaAdultoMayor") 
    private String CategoriaAdultoMayor;
    
    @Column(name = "Tratamiento") 
    private String Tratamiento;

    //  JOVEN
    
    @Column(name = "CuidadosPreventivos") 
    private String CuidadosPreventivos;

    //  ADOLESCENCIA

    @Column(name = "SaludSexual") 
    private String SaludSexual;
    
    @Column(name = "SaludBucal") 
    private String SaludBucal;
        
    @Column(name = "RiesgoCardiovascular") 
    private String RiesgoCardiovascular;
 
    
}
