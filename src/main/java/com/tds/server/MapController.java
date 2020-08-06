package com.tds.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MapController {

    private static final Logger LOGGER = LoggerFactory.getLogger( MapController.class );

    //TODO:  Consider factory pattern for loading maps
    @GetMapping( "/map" )
    public GameMap loadMap() {
        LOGGER.info( "MapController.loadMap() called" );
        return new GameMap();
    }

}
