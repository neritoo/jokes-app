package com.gavilan.jokesapp.services;

import com.gavilan.jokesapp.model.Joke;
import org.springframework.stereotype.Service;

/**
 * @author Ezequiel Gavilán
 */

@Service
public class JokeServiceImpl implements JokeService {

    @Override
    public String getJoke() {
        Joke joke = new Joke();
        return joke.getRandomJoke();
    }
}
