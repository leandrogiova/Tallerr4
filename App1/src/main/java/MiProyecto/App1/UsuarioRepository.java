package MiProyecto.App1;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//En general es donde esta CRUD
//C = CREATE   R = READ   U = UPDATE   D = DELETE
// funciones para la base de datos
// crear un usuario, para leer un usuario ...
 
//CAPA DE DATOS
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
 
}