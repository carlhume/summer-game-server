package com.tds.server;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RulesLoaderTest {


    @Test
    public void testLoadingTerrainTypes() throws Exception {
        RulesLoader serializer = new RulesLoader();
        TerrainRules rules = serializer.loadTerrainRules();
        assertEquals( 2, rules.countUniqueTerrainTypes() );
    }

}
