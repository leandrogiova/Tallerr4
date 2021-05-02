package MiProyecto.App1;

import javax.persistence.Embeddable;
 
import lombok.Data;

@Data
@Embeddable//es decir este objeto "Direccion" lo puedo poner adentro de otra entidad
public class Direccion {
    
    private String calle;

    private Integer altura;

    private Integer piso;

    private String departamento;



}
