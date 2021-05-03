package MiProyecto.App1;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import javax.transaction.Transactional;

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
	//son los objetos que va a gestionar automaticamente Spring
	// poniendole @Bean a un objeto, hago que Spring gestione ese metodo
	public CommandLineRunner loadAgendaData(UsuarioRepository repository){
		return (args) -> {
			Usuario u1 = new Usuario();
			u1.setLogin("SGEnergy");
			u1.setNombre("Silvio");
			u1.setApellido("Giovacchini");
			Direccion dir1 = new Direccion();
			dir1.setCalle("San Nicolas");
			dir1.setAltura(698);
			u1.setDirecccionCasa(dir1);


			Usuario u2 = new Usuario();
			u2.setLogin("OscarG");
			u2.setNombre("Oscar");
			u2.setApellido("Giovacch");
			Direccion dir2 = new Direccion();
			dir2.setCalle("Independencia");
			dir2.setAltura(303);
			dir2.setPiso(0);
			dir2.setDepartamento("CientoUno");
			u2.setDirecccionCasa(dir2);

			Usuario u3 = new Usuario();
			u3.setLogin("MVanne");
			u3.setNombre("Marisa");
			u3.setApellido("Vannelli");


			repository.save(u1);
			repository.save(u2);
			repository.save(u3);
		};
	}
	
	/*
	@Bean
	public CommandLineRunner loadInstitutoData(InstitutoRepository repository){
		return (args) -> {
			Instituto ins1 = new Instituto();
			ins1.setNombre("Instituto Medico de la Mujer");

			Instituto ins2 = new Instituto();
			ins2.setNombre("Instituto de Cardiología");

			Instituto ins3 = new Instituto();
			ins3.setNombre("Instituto Clemente Albarez");


			repository.save(ins1);
			repository.save(ins2);
			repository.save(ins3);

		};
	}
	*/

		@Bean
		@Transactional
		public CommandLineRunner loadMedicoData(MedicoRepository repository, InstitutoRepository repoInst){
		return (args) -> {
			

			Instituto ins1 = new Instituto();
			ins1.setNombre("Instituto Medico de la Mujer");

			Instituto ins2 = new Instituto();
			ins2.setNombre("Instituto de Cardiología");

			Instituto ins3 = new Instituto();
			ins3.setNombre("Instituto Clemente Albarez");


			repoInst.save(ins1);
			repoInst.save(ins2);
			repoInst.save(ins3);
			
			Set<Instituto> institutos = new HashSet<Instituto>();
			institutos.add(ins1);
			institutos.add(ins2);
			institutos.add(ins3);





			Medico  med1 = new Medico();
			med1.setNombre("Alberto");
			med1.setApellido("Maiorano");
			med1.setDocumento(12123321);
			med1.setNumMatricula(5789);
			Direccion dir1 = new Direccion();
			dir1.setCalle("San Martin");
			dir1.setAltura(123);
	
			med1.setInstitutos(institutos);

			/*
			//consulta a la base de datos
			//el objeto "i1" lo seteo con el id 3 
			//es decir que el medico tiene un insituto con el id_instituto 3 
			//Optional<Instituto> i1 = repoInst.findById(3L);
			if(i1.isPresent()){
				med1.setInstituto(i1.get()); 
			}
			//HAY QUE TENER CUIDADO CON TODAS LAS CONSULTAS QUE GENERAMOS EN LA BASE DE DATOS
			*/



			Medico  med2 = new Medico();
			med2.setNombre("Eduardo");
			med2.setApellido("Cuaranta");
			med2.setDocumento(4567896);
			med2.setNumMatricula(215);
			Direccion dir2 = new Direccion();
			dir2.setCalle("Ayacucho");
			dir2.setAltura(321);

			/*
			//esto es similar a la linea 94 
			//esto lo que hace es obtener un objeto que se llama PROXY donde este objeto tiene el id en 1 del instituto
			//no va la base de datos
			Instituto instituto2 = repoInst.getOne(1L);
			med2.setInstituto(instituto2);
			//seteo al medico con este objeto con el id en 1.
			*/
			
			repository.save(med1);
			repository.save(med2);



		};



	}


}


/*
------------
CAPA WEB
------------
CAPA DE SERVICE
------------
CAPA DE DATOS
------------


La capa Web es la que intectua el usuario 

La capa de Servicios es un puente que une los pedidos del servicios y los dato.
Guarda en la base de datos, Trae los datos a la base de datos y demas.

La capa de datos gestiona todos los datos, ya sea con bases de datos de cualquier tipo.

--------------------

@RestController   @Controller
Las clases que lleven @RestController o @Controller son las que van a indicar que son las clases que pertenecen a las paginas web
Es decir, que el usuario le va a pasar una URL, y va a caer en una de estas clases
son componentes que tienen que ver con la presentacion.

Esta clase es la que va a recibir todos los pedidos del usuario, como pertenece a la capa web

Diferencia entre @RestController y @Controller

@Controller es cuando mi capa web genera html 

Como nosotros hacemos aplicacions tipo SPA, vamos a tener corriendo un cliente con JavaScrip grouser, ese cliente va a 
pedir datos a esa aplicaion web y esa aplicacion web va a devolver datos de tipo Json
Empoint == @RestController 


Los SERVICIOS son puentes entre el usuario y los datos
@Service
son servicios 





LOS DATOS SE REPRESENTAN CON 
@Repositori
Los datos se van a guardar en una base de datos

Las clases que se encargan de acceder a los datos tiene el @Repositori 




Si hay componentes genericos se usa
@Component
Si hay algun componente que no se le puede asignar a alguna capa (CAPA WEB, CAPA DE SERVICIOS, CAPA DE DAO(DATOS)), 
pero quiero que bin gestione el ciclo de vida de esa clase, que las inyecte, lo voy a marcar con el @Component






URL
URL significa Uniform Resource Locator (Localizador de Recursos Uniforme). 
Una URL no es más que una direccion que es dada a un recurso único en la Web. 
En teoria, cada URL valida apunta a un único recurso. Dichos recursos pueden ser páginas HTML, documentos CSS, 
imagenes, etc. En la practica, hay algunas excepciones, siendo la más común una URL apuntando a un recurso 
que ya no existe o que ha sido movido. 
Como el recurso representado por la URL y la URL en si son manejadas por el servidor Web, 
depende del dueño del servidor web manejar ese recurso y su URL asociada adecuadamente.


LOS ENDPOINTS
Los endpoints son las URLs de un API o un backend que responden a una petición. 
Los mismos entrypoints tienen que calzar con un endpoint para existir. 
Algo debe responder para que se renderice un sitio con sentido para el visitante.


*/