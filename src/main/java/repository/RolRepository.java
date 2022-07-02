package repository;

import model.Rol;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends MongoRepository<Rol, String>{

}