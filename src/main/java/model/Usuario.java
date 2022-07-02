package model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "usuario")
@Data
public class Usuario {
    @Id
    private String id;
    private String nombre;
    private String rut;
    private String rol;
    private String correo;
}
