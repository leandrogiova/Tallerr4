package MiProyecto.App1;

import java.util.*;

import org.springframework.stereotype.Service;

@Service
public class UsuarioServicio {
    
    public List<Usuario> obtenerTodosLosUsuarios(){

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

}
