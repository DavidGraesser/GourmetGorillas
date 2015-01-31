import de.gyrosit.Application;
import de.gyrosit.model.RestaurantRecommendation;
import de.gyrosit.repository.RestaurantRecommendationRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by dave on 11.01.15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class DinnerSuggestionsRepositoryTest {

    @Autowired
    RestaurantRecommendationRepository restaurantRecommendationRepository;

    @Test
    public void testStore(){
        RestaurantRecommendation dinnerSuggestion = new RestaurantRecommendation();
        dinnerSuggestion.setRestaurantName("Test");

        restaurantRecommendationRepository.save(dinnerSuggestion);

        Iterable<RestaurantRecommendation> dinnerSuggestionList = restaurantRecommendationRepository.findAll();

        for (RestaurantRecommendation suggestion : dinnerSuggestionList) {
            System.out.println(suggestion.getRestaurantName());
        }


    }
}
