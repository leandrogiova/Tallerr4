package AplicacionWeb1.demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity @Table
public class Paciente extends Persona {


    @Id @GeneratedValue(strategy = GenerationType.AUTO) 
    private String id;

    private Date inscripcion;

    private ArrayList<String> prescripcion;

    private ArrayList<String> alergias;

    private ArrayList<String> requerimientosEspeciales;


    @ManyToMany
    private Set<Hospital> listaHospitales;



}
