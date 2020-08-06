package com.tds.server;

public class GameMap {

    private static final long HARDCODED_PLAINS_MAP_ID = 111;

    private long id;

    public GameMap() {
        this( HARDCODED_PLAINS_MAP_ID );
    }

    public GameMap( long mapId ) {
        this.id = mapId;
    }

    public long getId() {
        return this.id;
    }

}
