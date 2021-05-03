package MiProyecto.App1;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


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

    @ManyToMany
    private Set<Instituto> institutos = new HashSet<Instituto>();


    public void add(Instituto instituto){
        institutos.add(instituto);
    }
    

}
