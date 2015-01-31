#About
Simple webapp for collecting some restaurant suggestions around berlin and track our weekly restaurant visits.

#Setup and Run
+ spring-boot:run
+ http://localhost:8080/gourmetgorillas/

# ToDos
## Model
### Model for Actual Dinner
* RestaurantName
* District
* RestaurantType
* PriceLevel
* CalendarWeek
* Pictures

### Model for Dinner Suggestions
* RestaurantName
* District
* RestaurantType
* PriceLevel (optional)

## Actions and Views
* Create InputForm Dinner - you can preselect a DinnerSuggestions - afterwards the DinnerSuggestions will be deleted
* Edit InputForm Dinner
* Delete Dinner
* Overview all Dinner (with order)

* Create InputForm DinnerSuggestions
* Edit InputForm DinnerSuggestions
* Delete DinnerSuggestions
* Overview all DinnerSuggestions (with order)

# Future
* Statistics
* Show DinnerSuggestions nearby

# Sources
SimpleExample -> Learned Tomcat must be provided
http://kdubblabs.com/2014/02/spring-boot-simple-configuration/

With Forms
http://kielczewski.eu/2014/04/spring-boot-mvc-application/