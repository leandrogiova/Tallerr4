package MiProyecto.App1;


import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Ingredientes {

    @Id
    private Long id;

    private String nombre;

}
