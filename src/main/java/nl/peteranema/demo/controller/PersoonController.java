package nl.peteranema.demo.controller;

import nl.peteranema.demo.exception.RecordNotFoundException;
import nl.peteranema.demo.model.Persoon;
import nl.peteranema.demo.repository.PersoonRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class PersoonController {

    @Autowired
    private PersoonRepository persoonRepository;

    @GetMapping(value = "/personen")
    public ResponseEntity getPersonen() {
        Iterable<Persoon> personen = persoonRepository.findAll();
        return ResponseEntity.ok(personen);
    }

    @GetMapping(value = "/personen/{nr}")
    public ResponseEntity getPersoon(@PathVariable long nr) {
        try {
            Optional<Persoon> persoon = persoonRepository.findById(nr);
            return ResponseEntity.ok(persoon);
        }
        catch (IndexOutOfBoundsException ex) {
            System.out.println(ex);
            throw new RecordNotFoundException();
        }
    }

    @PostMapping(value = "/personen")
    public ResponseEntity addPersoon(@RequestBody Persoon persoon) {
        persoonRepository.save(persoon);
        return ResponseEntity.ok("Toegevoegd");
    }

    @DeleteMapping(value = "/personen/{nr}")
    public ResponseEntity deletePersoon(@PathVariable long nr) {
        persoonRepository.deleteById(nr);
        return ResponseEntity.ok("Verwijderd");
    }

    @PutMapping(value = "/personen/{nr}")
    public ResponseEntity updatePersoon(@PathVariable long nr, @RequestBody Persoon persoon) {
        return ResponseEntity.ok("Aangepast");
    }

}
