package com.tds.server;

public class GameMap {

    private static final long HARDCODED_PLAINS_MAP_ID = 111;

    private long id;
    private MapData[][] mapData;

    public GameMap( long mapID, TerrainRules terrainRules ) {
        this( mapID );

        mapData = new MapData[2][2];
        mapData[0][0] = new MapData( terrainRules.pickRandomTerrain() );
        mapData[0][1] = new MapData( terrainRules.pickRandomTerrain() );
        mapData[1][0] = new MapData( terrainRules.pickRandomTerrain() );
        mapData[1][1] = new MapData( terrainRules.pickRandomTerrain() );
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
