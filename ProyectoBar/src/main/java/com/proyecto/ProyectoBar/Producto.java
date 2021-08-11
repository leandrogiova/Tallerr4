package com.proyecto.ProyectoBar;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonInclude;

import org.springframework.beans.factory.annotation.Autowired;


@Entity
public class Producto {

    @Id
    private int id;


    private String nombre;



    public Producto(){

    }
    public Producto(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }
    
    
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }


    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

}
