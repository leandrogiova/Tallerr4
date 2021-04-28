package MiProyecto.App1;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
//@Data genera los getters y setters para cada propiedad
@Entity
public class Usuario{

    @Id
    private long id;

    private String login;

    private String nombre;

    private String apellido;


}