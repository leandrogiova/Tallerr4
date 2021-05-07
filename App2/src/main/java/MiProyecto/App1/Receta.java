package MiProyecto.App1;



import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;


@Entity
@Data
public class Receta {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String fecha;

//    @OneToOne
//    @Column(name = "chef_inventor") 
//    private Chef chef;

    @ManyToMany
    @Column(name = "ingredientes de recetas")
    private Set<Ingredientes> ingredientesDeRecetas = new HashSet<Ingredientes>();

}
