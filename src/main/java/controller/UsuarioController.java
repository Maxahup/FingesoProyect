package controller;

import lombok.RequiredArgsConstructor;
import model.Usuario;
import org.springframework.web.bind.annotation.*;
import service.UsuarioService;

import java.util.List;

@RestController
@RequestMapping(value = "/usuario")
@RequiredArgsConstructor
public class UsuarioController {
    private final UsuarioService usuarioService;

    @PostMapping(value = "/")

    public void save(@RequestBody Usuario usuario){
        usuarioService.save(usuario);
    }

    @GetMapping(value = "/getAll")
    public List<Usuario> findAll(){
        return usuarioService.findAll();
    }
    @GetMapping(value = "/getById/{id}")
    public Usuario findById(@PathVariable String id){
        return usuarioService.findById(id).get();
    }

    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable String id){
        usuarioService.deleteById(id);
    }
}
