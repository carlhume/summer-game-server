package com.tds.server;

public class Game {

    private long id;
    private long mapId;
    private GameMap map;

    public long getId() {
        return this.id;
    }

    public void setId( long newId ) {
        this.id = newId;
    }

    public long getMapId() {
        return this.mapId;
    }

    public void setMapId( long newId ) {
        this.mapId = newId;
    }

    public GameMap getMap() {
        return map;
    }

    public void setMap( GameMap newMap ) {
        map = newMap;
    }

}