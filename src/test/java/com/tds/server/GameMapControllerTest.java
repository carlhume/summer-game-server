package com.tds.server;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GameMapControllerTest {

    @Test
    public void testHealthCheckCanReport() {
        MapController mapController = new MapController();
        assertNotNull( mapController.createRandomMap() );
    }

}
