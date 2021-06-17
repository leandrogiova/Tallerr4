package AplicacionWeb1.demo;

import java.util.Date;

import javax.persistence.Embedded;


public class Persona {
    
    protected String titulo;
    protected String nombreCompleto;
    protected String apellido;
    protected Long documento;

    @Embedded
    protected Direccion direccion;

    protected Date fechaDeNacimiento;

    protected String genero;

    protected String email;
    protected String telefono1;
    protected String telefono2;

}
