package com.tds.server;

public class Game {

    private long id;
    private GameMap map;

    public long getId() {
        return this.id;
    }

    public void setId( long newId ) {
        this.id = newId;
    }

    public GameMap getMap() {
        return map;
    }

    public void setMap( GameMap newMap ) {
        map = newMap;
    }

}