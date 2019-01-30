package fr.orantoine.TennisBackend.repository;

import fr.orantoine.TennisBackend.model.Demande;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DemandeRepository extends MongoRepository<Demande,String> {

}
