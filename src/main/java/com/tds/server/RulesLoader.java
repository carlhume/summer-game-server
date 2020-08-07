package com.tds.server;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.File;
import java.io.IOException;

public class RulesLoader {

    public TerrainRules loadTerrainRules() throws IOException {
        ResourceLoader resourceLoader = new DefaultResourceLoader();
        Resource resource = resourceLoader.getResource( "classpath:rules/terrain_rules.json" );
        return readObjectFromFile( TerrainRules.class, resource.getFile() );
    }

    private <T> T readObjectFromFile( Class<T> aClass, File file ) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue( file, aClass );
    }

}
