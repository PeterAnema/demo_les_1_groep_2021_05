package nl.peteranema.demo.controller;

import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersoonController {

    private static List<String> personen = new ArrayList<>();

    @GetMapping(value = "/personen")
    public ResponseEntity getPersonen() {
        return ResponseEntity.ok(personen);
    }

    @GetMapping(value = "/personen/{nr}")
    public ResponseEntity getPersoon(@PathVariable int nr) {
        return ResponseEntity.ok(personen.get(nr));
    }

    @PostMapping(value = "/personen")
    public ResponseEntity addPersoon(@RequestBody String persoon) {
        personen.add(persoon);
        return ResponseEntity.ok("Toegevoegd");
    }

}
