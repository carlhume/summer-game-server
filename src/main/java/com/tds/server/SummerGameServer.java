package com.tds.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SummerGameServer {

    private static final Logger LOGGER = LoggerFactory.getLogger( HealthCheckController.class );

    public static void main( String [] args ) {
        LOGGER.info( "Starting the SummerGameServer" );
        SpringApplication.run( SummerGameServer.class, args );

        // TODO: Log HealthCheck ...
        LOGGER.info( "SummerGameServer started successfully" );
    }
}
