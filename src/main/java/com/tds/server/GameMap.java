package com.tds.server;

public class GameMap {

    private static final long HARDCODED_PLAINS_MAP_ID = 111;

    private long id;
    private MapData[][] mapData;

    public GameMap() {
        this( HARDCODED_PLAINS_MAP_ID );
        mapData = new MapData[2][2];
        mapData[0][0] = new MapData( TerrainRules.DEFAULT_RULES.getRandomTerrain() );
        mapData[0][1] = new MapData( TerrainRules.DEFAULT_RULES.getRandomTerrain() );
        mapData[1][0] = new MapData( TerrainRules.DEFAULT_RULES.getRandomTerrain() );
        mapData[1][1] = new MapData( TerrainRules.DEFAULT_RULES.getRandomTerrain() );
    }

    public GameMap( long mapId ) {
        this.id = mapId;
    }

    public long getId() {
        return this.id;
    }

    public MapData[][] getMapData() {
        return this.mapData;
    }

}
