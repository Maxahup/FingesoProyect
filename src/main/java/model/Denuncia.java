package model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Document(value = "denuncia")
@Data
public class Denuncia {
    @Id
    private String id;
    private String rutDenunciante;
    private String rutDenunciado;
    private String correoDenunciante;
    private String correoDenunciado;
    private String estado;
    private LocalDate fecha;
    private String fiscal;
    private String actuario;
    private String medidasProteccion;
    private String resolucion;
}
