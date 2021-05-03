package MiProyecto.App1;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Medico {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    
    private String apellido;
    
    private Integer documento;
    
    private Integer numMatricula;

    @Embedded
    private Direccion direccion;

    @OneToOne
    private Instituto instituto;

    

}
