import de.gyrosit.Application;
import de.gyrosit.model.DinnerSuggestion;
import de.gyrosit.repository.DinnerSuggestionRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

/**
 * Created by dave on 11.01.15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class DinnerSuggestionsRepositoryTest {

    @Autowired
    DinnerSuggestionRepository dinnerSuggestionRepository;

    @Test
    public void testStore(){
        DinnerSuggestion dinnerSuggestion = new DinnerSuggestion();
        dinnerSuggestion.setRestaurantName("Test");

        dinnerSuggestionRepository.save(dinnerSuggestion);

        Iterable<DinnerSuggestion> dinnerSuggestionList = dinnerSuggestionRepository.findAll();

        for (DinnerSuggestion suggestion : dinnerSuggestionList) {
            System.out.println(suggestion.getRestaurantName());
        }


    }
}
