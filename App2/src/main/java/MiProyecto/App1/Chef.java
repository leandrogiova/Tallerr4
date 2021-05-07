package MiProyecto.App1;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Chef {
    
    @Id
    
    private Long id;

    private String nombre;
    
    private String apellido;

    private String nacionalidad;

    //ManyToMany
    //private Receta receta;

}
