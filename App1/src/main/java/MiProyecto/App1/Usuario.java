package MiProyecto.App1;

import java.beans.Transient;

import javax.persistence.Column;
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


}

//para insertar en la base de datos
//INSERT INTO USUARIO (id, username, nombre, apellido) values (2, 'Leandrogiova', 'Leo', 'Giova')