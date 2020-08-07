package com.tds.server;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MapLoaderTest {

    @Test
    public void testMapCanBeLoaded() throws IOException {
        MapLoader mapLoader = new MapLoader();
        GameMap map = mapLoader.load( 111 );
        assertEquals( 111, map.getId() );
    }

    @Test
    public void testCreateFilenameFromId() {
        MapLoader mapLoader = new MapLoader();
        assertEquals( "classpath:maps/111.json", mapLoader.createFilenameForId( 111 ) );
    }

}
