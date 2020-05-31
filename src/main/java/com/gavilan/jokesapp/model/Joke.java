package com.gavilan.jokesapp.model;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * @author Ezequiel Gavilán
 */
public class Joke {

    private final ChuckNorrisQuotes quotes;

    public Joke() {
        this.quotes = new ChuckNorrisQuotes();
    }

    public String getRandomJoke() {
        return this.quotes.getRandomQuote();
    }
}
