package model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Document(value = "historial")
@Data
public class Historial{
    @Id
    private String id;
    private Usuario idUsuario;
    private String estadoDenuncia;
    private LocalDate fechaActualEstadoDenuncia;
    private List<Historial> Historiales;

}

