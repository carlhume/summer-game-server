package com.tds.server;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GameControllerTest {

    @Test
    public void testCanLoadGameFromId() throws IOException {
        GameController gameController = new GameController();
        assertEquals( 1000, gameController.loadGame( 1000 ).getId() );
    }

//    @Test
//    public void testLoadedGameHasMapId() {
//        GameController gameController = new GameController();
//        assertEquals( 112, gameController.loadGame( 1000 ).getMap().getId() );
//    }

}
