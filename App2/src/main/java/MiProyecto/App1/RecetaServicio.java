package MiProyecto.App1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;

@Service
@Data
public class RecetaServicio {
  
    @Autowired
    private RecetasRepository recetaRepository;
    
    public List<Receta> obtenerTodosLosUsuarios(){
        return recetaRepository.findAll();
    }

}


