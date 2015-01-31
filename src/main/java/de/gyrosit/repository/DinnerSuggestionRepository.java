package de.gyrosit.repository;

import de.gyrosit.model.DinnerSuggestion;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by dave on 10.01.15.
 */
public interface DinnerSuggestionRepository extends CrudRepository<DinnerSuggestion, Long> {
}
