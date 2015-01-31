package de.gyrosit.repository;

import de.gyrosit.model.RestaurantRecommendation;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by dave on 10.01.15.
 */
public interface RestaurantRecommendationRepository extends CrudRepository<RestaurantRecommendation, Long> {
}
