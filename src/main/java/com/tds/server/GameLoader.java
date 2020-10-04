package com.tds.server;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.IOException;

public class GameLoader {

    // We are currently loading the game from a file on disk.
    // At some point we are likely going to want created games to be stored in a database,
    // or at least on a directory separate from the configuration resources used to create games.
    // ie. Create separation between static resources and dynamically created ones
    public Game loadGame( long id ) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ResourceLoader resourceLoader = new DefaultResourceLoader();
        Resource resource = resourceLoader.getResource( createFilenameForId( id ) );
        return mapper.readValue( resource.getFile(), Game.class );
    }

    public String createFilenameForId( long id ) {
        return "classpath:games/" + id + ".json";
    }


}
