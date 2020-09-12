package com.tds.server;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MapLoaderTest {

    @Test
    public void testMapCanBeLoaded() throws IOException {
        MapLoader mapLoader = new MapLoader();
        GameMap map = mapLoader.load( 111 );
        assertEquals( 111, map.getId() );
    }

    @Test
    public void testLoadingWithRulesPopulatesMapRules() throws IOException {
        MapLoader mapLoader = new MapLoader();
        TerrainRules terrainRules = new TerrainRules();
        terrainRules.addTerrainDefinition( new Terrain( "P", "Plains" ) );
        GameMap map = mapLoader.loadMapForIdUsingRules( 111, terrainRules );
        assertEquals( "Plains", map.getMapData()[0][0].getTerrain().getLabel() );
    }

    @Test
    public void testCreateFilenameFromId() {
        MapLoader mapLoader = new MapLoader();
        assertEquals( "classpath:maps/111.json", mapLoader.createFilenameForId( 111 ) );
    }

    // TODO:  >> cnh >> Consider adding test for when MapLoader throws Exception to make Behavior explicit
    // >> cnh >> Does it make sense to add a Map not found Exception?
}
