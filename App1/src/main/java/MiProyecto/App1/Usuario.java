package MiProyecto.App1;

import lombok.Data;

@Data
//@Data genera los getters y setters para cada propiedad
public class Usuario{
    private String login;

    private String nombre;

    private String apellido;


}