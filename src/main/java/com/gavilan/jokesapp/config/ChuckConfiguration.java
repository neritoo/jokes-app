package com.gavilan.jokesapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * @author Ezequiel Gavilán
 */

//@Configuration
public class ChuckConfiguration {

    //@Bean
    public ChuckNorrisQuotes chuckNorrisQuotes() {
        return new ChuckNorrisQuotes();
    }

}
