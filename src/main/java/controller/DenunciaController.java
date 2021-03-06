package controller;

import lombok.RequiredArgsConstructor;
import model.Denuncia;
import org.springframework.web.bind.annotation.*;
import service.DenunciaService;

import java.util.List;

@RestController
@RequestMapping(value = "/denuncia")
@RequiredArgsConstructor
public class DenunciaController {
    private final DenunciaService denunciaService;

    @PostMapping(value = "/")

    public void save(@RequestBody Denuncia denuncia){

        denunciaService.save(denuncia);
    }

    @GetMapping(value = "/getAll")
    public List<Denuncia> findAll(){

        return denunciaService.findAll();
    }
    @GetMapping(value = "/getById/{id}")
    public Denuncia findById(@PathVariable String id){

        return denunciaService.findById(id).get();
    }

    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable String id){

        denunciaService.deleteById(id);
    }
}
