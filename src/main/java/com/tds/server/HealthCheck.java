package com.tds.server;

public class HealthCheck {

    private long id;
    private int status;

    public HealthCheck( long newId, int statusCode ) {
        this.id = newId;
        this.status = statusCode;
    }

    public long getId() {
        return this.id;
    }

    public int getStatus() {
        return this.status;
    }

}
