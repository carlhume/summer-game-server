package com.tds.server;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GameMapControllerTest {

    @Test
    public void testCanCreateRandomMapWithoutException() {
        MapController mapController = new MapController();
        assertNotNull( mapController.createRandomMap() );
    }

    @Test
    public void testCanLoadMapFromId() throws IOException {
        MapController mapController = new MapController();
        assertEquals( 113, mapController.loadMap( 113 ).getId() );
    }
}
