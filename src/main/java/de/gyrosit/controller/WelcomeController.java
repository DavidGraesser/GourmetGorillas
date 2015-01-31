package de.gyrosit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by dave on 23.12.14.
 */
@Controller
public class WelcomeController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView showIndexPage(){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("message","Welcome to GourmetGorillas");
        return modelAndView;
    }
}
