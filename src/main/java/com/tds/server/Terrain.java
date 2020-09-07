package com.tds.server;

public class Terrain {

    private String type;
    private String label;

    public Terrain() {
        this.type = "";
        this.label = "";
    }

    public Terrain( String type, String label ) {
        this.type = type;
        this.label = label;
    }

    public String getType() {
        return this.type;
    }

    public String getLabel() {
        return this.label;
    }

}
