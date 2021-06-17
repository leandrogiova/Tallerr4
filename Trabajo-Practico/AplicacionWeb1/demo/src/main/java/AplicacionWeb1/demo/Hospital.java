package AplicacionWeb1.demo;


import java.util.ArrayList;
import java.util.Set;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;


@Entity @Table @Data
public class Hospital {
    
    @Id @GeneratedValue(strategy = GenerationType.AUTO) 
    private String id;

    private String nombre;

    @Embedded
    private Direccion direccion;

    private String telefono1;
    private String telefono2;

    private String mail1;
    private String mail2;

    @ManyToMany
    private Set<Paciente> listaPacientes;


    @OneToMany
    private Set<Departamento> listaDepartamento;

    

}
