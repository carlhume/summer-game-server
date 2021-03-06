package com.tds.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Random;

@RestController
public class GameMapController {

    private static final Logger LOGGER = LoggerFactory.getLogger( GameMapController.class );

    @GetMapping( "/load-map" )
    public GameMap loadMap( @RequestParam( value = "id", defaultValue = "112" ) long id ) throws IOException {
        LOGGER.info( "MapController.loadMap() called with id: " + id );
        TerrainRules terrainRules = loadTerrainRules();
        MapLoader mapLoader = new MapLoader();
        return mapLoader.loadMapForIdUsingRules( id, terrainRules );
    }

    @GetMapping( "/random-map" )
    public GameMap createRandomMap() {
        LOGGER.info( "MapController.createRandomMap() called" );
        TerrainRules terrainRules = loadTerrainRules();
        return new GameMap( new Random().nextLong(), terrainRules );
    }

    private TerrainRules loadTerrainRules() {
        LOGGER.info( "MapController.loadTerrainRules() called" );
        RulesLoader rulesLoader = new RulesLoader();
        TerrainRules terrainRules = new TerrainRules();
        try {
            terrainRules = rulesLoader.loadTerrainRules();
        } catch (IOException e) {
            LOGGER.error( "MapController could not load terrain rules", e );
        }
        return terrainRules;
    }

}
