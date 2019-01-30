package fr.orantoine.TennisBackend.repository;


import fr.orantoine.TennisBackend.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String > {

    User findByPseudoAndPassword(String pseudo, String password);
}
