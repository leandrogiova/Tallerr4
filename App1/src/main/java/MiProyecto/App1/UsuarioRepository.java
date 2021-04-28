package MiProyecto.App1;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//En general es donde esta CRUD
//C = CREATE   R = READ   U = UPDATE   D = DELETE
// funciones para la base de datos
// crear un usuario, para leer un usuario ...
 

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
 
}


    /* 
    public List<Usuario> findAll(){
        List<Usuario> usuarios = new ArrayList<>();

        Usuario u1 = new Usuario();
        u1.setLogin("LDiamand");
        u1.setNombre("Luciano");
        u1.setApellido("Diamand");
    
        Usuario u2 = new Usuario();
        u2.setLogin("Leandrogiova");
        u2.setNombre("Leandro");
        u2.setApellido("Giovacchiini");

        usuarios.add(u1);
        usuarios.add(u2);

        return usuarios;
    }
    */