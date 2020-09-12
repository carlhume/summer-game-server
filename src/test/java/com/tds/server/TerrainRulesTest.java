package com.tds.server;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TerrainRulesTest {

    private TerrainRules terrainRules;
    private Terrain testTerrain;

    @BeforeEach
    public void setUp() {
        this.terrainRules = new TerrainRules();
        testTerrain = new Terrain( "test", "Test Terrain" );
    }

    @Test
    public void testEmptyRulesHaveNoTerrain() {
        TerrainRules rules = new TerrainRules();
        assertEquals( 0, rules.countUniqueTerrainTypes() );
    }

    @Test
    public void testTerrainRulesCanDefineMoreThanOneTerrain() {
        terrainRules.addTerrainDefinition( new Terrain( "TP", "Test Plains" ) );
        terrainRules.addTerrainDefinition( new Terrain( "TF", "Test Forest" ) );
        assertEquals( 2, terrainRules.countUniqueTerrainTypes() );
    }

    @Test
    public void testThereIsOnlyOneDefinitionForEachTerrainType() {
        Terrain testTerrain = new Terrain( "test", "Test Terrain" );
        Terrain alsoTestTerrain = new Terrain( "test", "Also Test Terrain" );
        terrainRules.addTerrainDefinition( testTerrain );
        terrainRules.addTerrainDefinition( alsoTestTerrain );
        assertEquals( 1, terrainRules.countUniqueTerrainTypes() );
    }

    @Test
    public void testCanFindTerrainDefinitionByType() {
        terrainRules.addTerrainDefinition( testTerrain );
        assertEquals( testTerrain, terrainRules.findTerrainDefinitionForType( testTerrain.getType() ) );
    }

    @Test
    public void testUndefinedTerrainReturnedIfCannotFindType() {
        assertEquals( "NF", terrainRules.findTerrainDefinitionForType( "This is not a type" ).getType() );
    }

    @Test
    public void testTerrainAlreadyDefined() {
        terrainRules.addTerrainDefinition( testTerrain );
        assertTrue( terrainRules.alreadyDefinesTerrain( testTerrain ) );
    }

    @Test
    public void testTerrainRulesListOfTerrainIsExposedViaGetterForAutomaticallySendingToClient() {
        assertNotNull( terrainRules.getTerrain() );
    }

    @Test
    public void testTerrainNotDefined() {
        assertFalse( terrainRules.alreadyDefinesTerrain( testTerrain ) );
    }
}
