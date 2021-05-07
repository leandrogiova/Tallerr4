package MiProyecto.App1;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Chef {
    
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    
    private String apellido;

    private String nacionalidad;

    @OneToOne
    private Receta receta;
    //private Set<Receta> recetas = new HashSet<Receta>();

}
