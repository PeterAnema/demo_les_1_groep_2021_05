package nl.peteranema.demo.repository;

import nl.peteranema.demo.model.Persoon;
import org.springframework.data.repository.CrudRepository;

public interface PersoonRepository extends CrudRepository<Persoon, Long> {
}
