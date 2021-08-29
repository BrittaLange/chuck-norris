package de.springmvc.chucknorris.controllers;

import de.springmvc.chucknorris.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final JokeService jokeService;


    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String getChuckNorrisJokes(Model model) { // Here comes the Spring model from M(odel)VC.

        // Here gets the Thymeleaf template access to "jokes". The model gets a property/attribute. It is implemented as a kind of hash map. jokes is the key, getJoke() returns the value.
        model.addAttribute("jokes", jokeService.getJoke());

        return "jokes/index";
    }
}
