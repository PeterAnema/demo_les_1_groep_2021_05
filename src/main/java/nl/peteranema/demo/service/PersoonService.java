package nl.peteranema.demo.service;

import nl.peteranema.demo.exception.RecordNotFoundException;
import nl.peteranema.demo.model.Persoon;
import nl.peteranema.demo.repository.PersoonRepository;

import java.util.Optional;

public class PersoonService {

    private final PersoonRepository persoonRepository;

    public PersoonService(PersoonRepository persoonRepository) {
        this.persoonRepository = persoonRepository;
    }

    public Iterable<Persoon> findAll() {
        Iterable<Persoon> personen = persoonRepository.findAll();
        return personen;
    }

    public Persoon findById(long nr) {
        Optional<Persoon> persoon = persoonRepository.findById(nr);
        if (persoon.isPresent()) {
            return persoon.get();
        }
        else {
            throw new RecordNotFoundException("Persoon with id " + nr + " not found");
        }
    }

    public void save(Persoon persoon) {
        persoonRepository.save(persoon);
    }

    public void deleteById(long nr) {
        try {
            persoonRepository.deleteById(nr);
        }
        catch (IndexOutOfBoundsException ex) {
            System.out.println(ex);
            throw new RecordNotFoundException();
        }
    }
}
