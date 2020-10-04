package com.tds.server;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GameMapControllerTest {

    @Test
    public void testCanCreateRandomMapWithoutException() {
        GameMapController gameMapController = new GameMapController();
        assertNotNull( gameMapController.createRandomMap() );
    }

    @Test
    public void testCanLoadMapFromId() throws IOException {
        GameMapController gameMapController = new GameMapController();
        assertEquals( 113, gameMapController.loadMap( 113 ).getId() );
    }
}
