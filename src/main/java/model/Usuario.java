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
    private String correo;
    private String password;
    private String rol;

    public Usuario(String rut, String correo){
        this.rut = rut;
        this.correo = correo;
    }

    boolean validarUsuario(String rut, String password){
        return true;
    }
    public String Rol(String rut, String password){
        this.rut = rut;
        this.password = password;
        if (validarUsuario(rut, password) == true){
            return rol;
        }
        return rut;
    }
}
