package com.tds.server;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RulesLoaderTest {

    @Test
    public void testLoadingTerrainTypes() throws Exception {
        RulesLoader rulesLoader = new RulesLoader();
        TerrainRules rules = rulesLoader.loadTerrainRules();
        assertEquals( 5, rules.countUniqueTerrainTypes() );
    }

}
