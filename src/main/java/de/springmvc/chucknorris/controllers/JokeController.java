package de.springmvc.chucknorris.controllers;

import de.springmvc.chucknorris.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String getChuckNorrisJokes(Model model) {

        // Here gets the Thymeleaf template access to "jokes".
        model.addAttribute("jokes", jokeService.getJoke());

        return "jokes/index";
    }
}
