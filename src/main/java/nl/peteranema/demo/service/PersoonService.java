package nl.peteranema.demo.service;

import nl.peteranema.demo.model.Persoon;

public interface PersoonService {

    Iterable<Persoon> findAll();
    public Persoon findById(long nr);
    void save(Persoon persoon);
    void deleteById(long nr);

}
