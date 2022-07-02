package service;

import lombok.RequiredArgsConstructor;
import model.Historial;
import org.springframework.stereotype.Service;
import repository.HistorialRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HistorialService {
    private final HistorialRepository historialRepository;

    public void save(Historial historial){

        historialRepository.save(historial);
    }

    public List<Historial> findAll(){

        return historialRepository.findAll();
    }

    public Optional<Historial> findById(String id){

        return historialRepository.findById(id);
    }
    public void deleteById(String id){

        historialRepository.deleteById(id);
    }
}