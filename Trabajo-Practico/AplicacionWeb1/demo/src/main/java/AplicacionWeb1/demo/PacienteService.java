package AplicacionWeb1.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacienteService {
    
    @Autowired
    private PacienteRepository pacienteRepo;
    
}
