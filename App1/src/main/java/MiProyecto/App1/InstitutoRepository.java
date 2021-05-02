package MiProyecto.App1;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstitutoRepository extends JpaRepository<Instituto, Long>{
    
}  
