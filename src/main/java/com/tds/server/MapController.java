package com.tds.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Random;

@RestController
public class MapController {

    private static final Logger LOGGER = LoggerFactory.getLogger( MapController.class );

    @GetMapping( "/random-map" )
    public GameMap createRandomMap() {
        LOGGER.info( "MapController.createRandomMap() called" );

        RulesLoader rulesLoader = new RulesLoader();
        TerrainRules terrainRules = TerrainRules.DEFAULT_RULES;
        try {
            terrainRules = rulesLoader.loadTerrainRules();
        } catch (IOException e) {
            LOGGER.error( "MapController could not load terrain rules", e );
        }

        return new GameMap( new Random().nextLong(), terrainRules );
    }

}
