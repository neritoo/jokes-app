package com.gavilan.jokesapp.controllers;

import com.gavilan.jokesapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Ezequiel Gavilán
 */

@Controller
public class JokesController {

    private final JokeService jokeService;

    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model) {
        String joke = this.jokeService.getJoke();
        model.addAttribute("joke", joke);
        return "chucknorris";
    }
}
