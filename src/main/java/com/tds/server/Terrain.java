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

    public void setType( String newType ) {
        this.type = newType;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel( String newLabel ) {
        this.label = newLabel;
    }

}
