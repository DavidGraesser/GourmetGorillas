package de.gyrosit.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

/**
 * Created by dave on 23.12.14.
 */
@MappedSuperclass
public class AbstractDinner {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @NotEmpty
    private String restaurantName;

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }
}
