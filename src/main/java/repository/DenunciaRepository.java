package repository;

import model.Denuncia;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DenunciaRepository extends MongoRepository<Denuncia, String>{

}