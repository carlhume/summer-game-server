package com.tds.server;

public class HealthCheckController {

    public HealthCheck report() {
        return new HealthCheck();
    }

}
