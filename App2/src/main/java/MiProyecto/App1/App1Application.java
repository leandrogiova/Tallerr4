package MiProyecto.App1;

import java.util.HashSet;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class App1Application {

	public static void main(String[] args) {
		SpringApplication.run(App1Application.class, args);
	}



	@Bean
	public CommandLineRunner loadAgendaData(ChefRepository repositoryChef, RecetasRepository repositoryReceta, IngredienteRepository repositoryIngrediente ){
		return (args) -> {

		Chef chef1 = new Chef();		
		chef1.setNombre("Leandro");
		chef1.setApellido("Giovacchini");
		chef1.setId(1L);

		
		Chef chef2 = new Chef();		
		chef2.setNombre("Silvio");
		chef2.setApellido("Giovacch");
		chef2.setId(2L);

		repositoryChef.save(chef1);
		repositoryChef.save(chef2);
		

		Receta receta1 = new Receta();
		receta1.setId(1L);
		receta1.setNombre("Torta de Coco");
//		receta1.setIngredientesDeRecetas();


		Receta receta2 = new Receta();
		receta2.setId(2L);
		receta2.setNombre("Mouse de chocolate");
//		receta2.setIngredientesDeRecetas(ingredientesDeMouse);

		repositoryReceta.save(receta1);
		repositoryReceta.save(receta2);

		Ingredientes coco = new Ingredientes();
		coco.setId(1L);
		coco.setNombre("coco");
		Ingredientes dulceDeLeche = new Ingredientes();
		dulceDeLeche.setId(2L);
		dulceDeLeche.setNombre("dulce de leche");
		Ingredientes vainilla = new Ingredientes();
		vainilla.setId(3L);
		vainilla.setNombre("vainilla");
		Ingredientes frutilla = new Ingredientes();
		frutilla.setId(4L);
		frutilla.setNombre("frutilla");

		repositoryIngrediente.save(coco);
		repositoryIngrediente.save(dulceDeLeche);
		repositoryIngrediente.save(vainilla);
		repositoryIngrediente.save(frutilla);


//		HashSet<Ingredientes> ingredientesDeTortaDeCoco = new HashSet<Ingredientes>();
//		ingredientesDeTortaDeCoco.add(ingredientesTorta);


	};	
	}



}
