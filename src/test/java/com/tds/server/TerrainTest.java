package com.tds.server;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TerrainTest {

    @Test
    public void testInitializeFromTerrainDefinition() {
        Terrain terrainDefinition = new Terrain( "TT", "Test Terrain" );
        Terrain newTerrain = new Terrain();
        newTerrain.setType( "TT" );
        newTerrain.initializeFromTerrainDefinition( terrainDefinition );
        assertEquals( terrainDefinition.getLabel(), newTerrain.getLabel() );
    }

}
