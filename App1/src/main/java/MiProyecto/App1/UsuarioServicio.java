package MiProyecto.App1;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//CAPA DE SERVICIO
@Service
public class UsuarioServicio {
    
    @Autowired
    private UsuarioRepository usuarioRepository;


    public List<Usuario> obtenerTodosLosUsuarios(){
        return  usuarioRepository.findAll();
    }

}
