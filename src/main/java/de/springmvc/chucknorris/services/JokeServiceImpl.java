package de.springmvc.chucknorris.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    ChuckNorrisQuotes chuckNorrisQuotes;

    // Here no dependency injection because we are using a third-party library.
    public JokeServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke(){
        return chuckNorrisQuotes.getRandomQuote();
    }
}
