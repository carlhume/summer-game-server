package com.tds.server;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TerrainRulesTest {

    @Test
    public void testEmptyRulesHaveNoTerrain() {
        TerrainRules rules = new TerrainRules();
        assertEquals( 0, rules.countUniqueTerrainTypes() );
    }

    @Test
    public void testDefaultRulesHaveTwoTerrainTypes() {
        TerrainRules rules = TerrainRules.DEFAULT_RULES;
        assertEquals( 2, rules.countUniqueTerrainTypes() );
    }
}
