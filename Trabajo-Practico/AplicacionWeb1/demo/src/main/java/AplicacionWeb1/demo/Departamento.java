package AplicacionWeb1.demo;
import java.util.Set;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data @Entity
public class Departamento {
    
    @Id @GeneratedValue(strategy = GenerationType.AUTO) 
    private String id;

    private String nombre;

    private String descripcion;

    @OneToMany
    private Set<Personal> listaDePersonal;
}
