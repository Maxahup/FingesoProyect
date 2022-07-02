package controller;

import lombok.RequiredArgsConstructor;
import model.Historial;
import org.springframework.web.bind.annotation.*;
import service.HistorialService;

import java.util.List;

@RestController
@RequestMapping(value = "/rol")
@RequiredArgsConstructor
public class HistorialController {
    private final HistorialService historialService;

    @PostMapping(value = "/")

    public void save(@RequestBody Historial historial){

        historialService.save(historial);
    }

    @GetMapping(value = "/getAll")
    public List<Historial> findAll(){

        return historialService.findAll();
    }
    @GetMapping(value = "/getById/{id}")
    public Historial findById(@PathVariable String id){

        return historialService.findById(id).get();
    }

    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable String id){

        historialService.deleteById(id);
    }
}
