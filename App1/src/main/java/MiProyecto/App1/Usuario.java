package MiProyecto.App1;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
//@Data genera los getters y setters para cada propiedad
@Entity
public class Usuario{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "username", unique = true)
    private String login; 

    @Column(name =  "Nombre")
    private String nombre;

    @Column(name = "Apellido")
    private String apellido;

    @javax.persistence.Transient
    //no lo muestra a nivel de usuario
    private String calculo;

    @Embedded
    private Direccion direcccionCasa;

/*
    @AttributeOverrides({
        @AttributeOverride(name = "calle", column = @Column(name = "CALLE_LABORAL")),
        @AttributeOverride(name = "piso", column = @Column(name = "PISO_LABORAL")),
        @AttributeOverride(name = "altura", column = @Column(name = "PISO_LABORAL")),
        @AttributeOverride(name = "departamento", column = @Column(name = "DEPARTAMENTO_LABORAL")),    })
    @Embedded
    private Direccion direccionLaboral;
*/


    



}

//para insertar en la base de datos
//INSERT INTO USUARIO (id, username, nombre, apellido) values (2, 'Leandrogiova', 'Leo', 'Giova')