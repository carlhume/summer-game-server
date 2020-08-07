package com.tds.server;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TerrainRules {

    public static final TerrainRules DEFAULT_RULES = initializeDefaultRules();

    private static TerrainRules initializeDefaultRules() {
        TerrainRules rules = new TerrainRules();
        rules.addTerrain( Terrain.PLAINS );
        rules.addTerrain( Terrain.FOREST );
        return rules;
    }

    private List<Terrain> terrain;

    public TerrainRules() {
        this.terrain = new ArrayList<>();
    }

    public void addTerrain( Terrain terrain ) {
        this.terrain.add( terrain );
    }

    public List<Terrain> getTerrain() {
        return this.terrain;
    }

    public Terrain getRandomTerrain() {
        Random random = new Random();
        return this.terrain.get( random.nextInt( countUniqueTerrainTypes() ) );
    }

    public int countUniqueTerrainTypes() {
        return this.terrain.size();
    }

}
