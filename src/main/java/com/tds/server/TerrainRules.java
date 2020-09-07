package com.tds.server;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TerrainRules {

    private List<Terrain> terrain;

    public TerrainRules() {
        this.terrain = new ArrayList<>();
    }

    public void addTerrain( Terrain terrain ) {
        if( alreadyDefinesTerrain( terrain ) == false ) {
            this.terrain.add(terrain);
        }
    }

    public boolean alreadyDefinesTerrain( Terrain terrain ) {
        boolean alreadyDefined = true;
        Terrain definition = findTerrainDefinitionForType( terrain.getType() );
        if( definition.getType().equals( "NF" ) ) {
            alreadyDefined = false;
        }
        return alreadyDefined;
    }

    public Terrain findTerrainDefinitionForType( String type ) {
        Terrain foundTerrain = new Terrain( "NF", "Terrain Not Found" );
        for( Terrain terrainDefinition : terrain ) {
            if( terrainDefinition.getType().equals( type ) ) {
                foundTerrain = terrainDefinition;
            }
        }
        return foundTerrain;
    }

    public List<Terrain> getTerrain() {
        return this.terrain;
    }

    public Terrain pickRandomTerrain() {
        Random random = new Random();
        return this.terrain.get( random.nextInt( countUniqueTerrainTypes() ) );
    }

    public int countUniqueTerrainTypes() {
        return this.terrain.size();
    }

}
