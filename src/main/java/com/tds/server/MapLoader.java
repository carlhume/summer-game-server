package com.tds.server;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.IOException;

public class MapLoader {

    public GameMap load( long id ) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ResourceLoader resourceLoader = new DefaultResourceLoader();
        Resource resource = resourceLoader.getResource( createFilenameForId( id ) );
        return mapper.readValue( resource.getFile(), GameMap.class );
    }

    public GameMap loadMapForIdUsingRules(long id, TerrainRules rules ) throws IOException {
        GameMap map = load( id );
        for( MapData[] row : map.getMapData() ) {
            for( MapData data : row ) {
                Terrain mapTerrain = data.getTerrain();
                Terrain terrainDefinition = rules.findTerrainDefinitionForType( mapTerrain.getType() );
                mapTerrain.initializeFromTerrainDefinition( terrainDefinition );
            }
        }
        return map;
    }

    public String createFilenameForId( long id ) {
        return "classpath:maps/" + id + ".json";
    }
}
