package nl.peteranema.demo.controller;

import nl.peteranema.demo.model.Speler;
import nl.peteranema.demo.repository.SpelerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpelerController {

    @Autowired
    SpelerRepository spelerRepository;

    @GetMapping(value = "/spelers")
    ResponseEntity getAllSpelers() {
        return ResponseEntity.ok(spelerRepository.findAll());
    }
}
