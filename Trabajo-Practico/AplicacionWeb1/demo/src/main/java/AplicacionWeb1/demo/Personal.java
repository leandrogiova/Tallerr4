package AplicacionWeb1.demo;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity @Table @Data
public class Personal extends Persona{
    
    @Id @GeneratedValue(strategy = GenerationType.AUTO) 
    private String id;

    private Date ingresado;    

    private ArrayList<String> educacion;

    private ArrayList<String> certificacion;

    private ArrayList<String> lenguaejes;


}
