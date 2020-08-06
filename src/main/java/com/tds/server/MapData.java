package com.tds.server;

public class MapData {

    //TODO: Replace this with terrain info loaded from game rules
    private static final String TERRAIN_PLAINS = "P";

    private String terrain;

    public MapData() {
        this.terrain = TERRAIN_PLAINS;
    }

    public String getTerrain() {
        return this.terrain;
    }

}
