package model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "rol")
@Data
public class Rol {
    @Id
    private String id;
    private String tipoRol;
}
