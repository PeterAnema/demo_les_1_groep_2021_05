package nl.peteranema.demo.repository;

import nl.peteranema.demo.model.Speler;
import org.springframework.data.repository.CrudRepository;

public interface SpelerRepository extends CrudRepository<Speler, Long> {
}
