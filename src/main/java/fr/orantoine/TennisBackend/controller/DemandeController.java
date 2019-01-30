package fr.orantoine.TennisBackend.controller;


import fr.orantoine.TennisBackend.model.Demande;
import fr.orantoine.TennisBackend.model.User;
import fr.orantoine.TennisBackend.repository.DemandeRepository;
import fr.orantoine.TennisBackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/demandes")
public class DemandeController {

    @Autowired
    private DemandeRepository demandeRepository;

    @Autowired
    private UserRepository userRepository;

    @GetMapping(path = "/")
    public ResponseEntity<List<Demande>> listDemandes(@RequestHeader String id){
        return ResponseEntity.ok(demandeRepository.findAll());
    }

    @PostMapping(path = "/")
    public ResponseEntity<Demande> addDemande(@RequestHeader String id, @RequestBody Demande demande){
        Optional<User> user = userRepository.findById(id);
        if(!user.isPresent()){
            return ResponseEntity.notFound().build();
        }
        User user1 = user.get();
        demande.setUser(user1);
        demandeRepository.save(demande);
        return ResponseEntity.ok(demande);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<String> deleteDemande(@RequestHeader String id_user, @PathVariable String id){
        demandeRepository.deleteById(id);
        return ResponseEntity.ok("La demande de partenaire à bien été supprimé");
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Demande> updateDemande(@RequestBody Demande demande, @PathVariable String id){
        demande.setId(id);
        return ResponseEntity.ok(demandeRepository.save(demande));

    }
}
