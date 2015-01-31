package de.gyrosit.controller;

import de.gyrosit.model.DinnerSuggestion;
import de.gyrosit.repository.DinnerSuggestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

/**
 * Created by dave on 11.01.15.
 */
@Controller
public class DinnerSuggestionController {

    @Autowired
    DinnerSuggestionRepository dinnerSuggestionRepository;

    @RequestMapping(value = "/dinnersuggestions", method = RequestMethod.GET)
    public String showOverview(Model model) {
        model.addAttribute("dinnerSuggestions", dinnerSuggestionRepository.findAll());
        return "dinnerSuggestions";
    }

    @RequestMapping(value = "/dinnersuggestion", method = RequestMethod.GET)
    public String dinnerSuggestionsForm(Model model) {
        model.addAttribute("dinnerSuggestion", new DinnerSuggestion());
        return "dinnerSuggestion";
    }

    @RequestMapping(value = "/dinnersuggestion", method = RequestMethod.POST)
    public String dinnerSuggestionSubmit(@Valid DinnerSuggestion dinnerSuggestion, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "dinnerSuggestion";
        }
        dinnerSuggestionRepository.save(dinnerSuggestion);
        return "redirect:/dinnersuggestions";
    }

}
