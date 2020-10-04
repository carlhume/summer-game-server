package com.tds.server;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameLoaderTest {

    @Test
    public void testGameCanBeLoaded() {
        GameLoader gameLoader = new GameLoader();
        Game game = gameLoader.loadGame( 1000 );
        assertEquals( 1000, game.getId() );
    }

}
