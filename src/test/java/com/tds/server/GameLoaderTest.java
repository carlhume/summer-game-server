package com.tds.server;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GameLoaderTest {

    private GameLoader gameLoader;

    @BeforeEach
    public void setUp() {
        gameLoader = new GameLoader();
    }

    @Test
    public void testGameCanBeLoaded() throws IOException {
        Game game = gameLoader.loadGame( 1000 );
        assertEquals( 1000, game.getId() );
    }

    @Test
    public void testLodedGameIsLinkedToAMap() throws IOException {
        Game game = gameLoader.loadGame( 1000 );
        assertEquals( 112, game.getMapId() );
    }

    @Test
    public void testDifferentGamesCanBeLinkedToDifferentMaps() throws IOException {
        Game game = gameLoader.loadGame( 1001 );
        assertEquals( 113, game.getMapId() );
    }

//    @Test
//    public void testLoadedGameMapIsInitialized() throws IOException {
//        Game game = gameLoader.loadGame( 1000 );
//        assertNotNull( game.getMap() );
//    }

}
