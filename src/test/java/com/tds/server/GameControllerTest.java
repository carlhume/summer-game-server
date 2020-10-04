package com.tds.server;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GameControllerTest {

    @Test
    public void testCanLoadGameFromId() {
        GameController gameController = new GameController();
        assertEquals( 1000, gameController.loadGame( 1000 ).getId() );
    }

}
