package de.gyrosit.controller;

import de.gyrosit.model.RestaurantRecommendation;
import de.gyrosit.repository.RestaurantRecommendationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by dave on 11.01.15.
 */
@Controller
public class RestaurantRecommendationController {

    @Autowired
    RestaurantRecommendationRepository restaurantRecommendationRepository;

    @RequestMapping(value = "/recommendations", method = RequestMethod.GET)
    public String showOverview(Model model) {
        model.addAttribute("recommendations", restaurantRecommendationRepository.findAll());
        return "recommendations";
    }

    @RequestMapping(value = "/recommendation", method = RequestMethod.GET)
    public String recommendationForm(Model model) {
        model.addAttribute("recommendation", new RestaurantRecommendation());
        return "recommendation";
    }

    @RequestMapping(value = "/recommendation", method = RequestMethod.POST)
    public String recommendationSubmit(@Valid @ModelAttribute("recommendation")RestaurantRecommendation recommendation, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "recommendation";
        }
        restaurantRecommendationRepository.save(recommendation);
        return "redirect:/recommendations";
    }

}
