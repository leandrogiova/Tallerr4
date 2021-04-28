package MiProyecto.App1;

import java.util.*;
//import java.util.ArrayList;
//import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //son componentes que tienen que ver con la presentacion, 
//el usurio escribiendo una URL, VA A CAER EN ALGUNA DE ESTAS CLASES


@RequestMapping("/usuarios")
//RequesMapping es lo que le tengo que pasar para que pegue con esa URL
//cuando yo escriba en el navegador web: "http://localhost:8080/usuarios" va a entrar a esta clase(UsuarioController)
public class UsuarioController{


@GetMapping
//si el pedido del usuario es un get(el get devuelve algo), voy a entrar por aca
public List<Usuario> todosLosUsuarios(){
    
    Usuario u1 = new Usuario();

    List<Usuario> usuarios = new ArrayList<>();


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