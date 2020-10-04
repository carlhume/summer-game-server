package com.tds.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Random;

@RestController
public class GameController {

    private static final Logger LOGGER = LoggerFactory.getLogger( GameController.class );

    @GetMapping( "/load-game" )
    public Game loadGame( @RequestParam( value = "id", defaultValue = "1000" ) long id ) {
        LOGGER.info( "GameController.loadGame() called with id: " + id );
        GameLoader gameLoader = new GameLoader();
        return gameLoader.loadGame( id );
    }

}
