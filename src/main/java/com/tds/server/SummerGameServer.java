package com.tds.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SummerGameServer implements ApplicationRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger( SummerGameServer.class );

    public static void main( String [] args ) {
        LOGGER.info( "Starting the SummerGameServer" );
        SpringApplication app = new SpringApplication( SummerGameServer.class );
        app.run(args);

        // TODO: Log HealthCheck ...
        LOGGER.info( "SummerGameServer started successfully" );
    }

    @Override
    public void run( ApplicationArguments args ) {

        LOGGER.info( "SummerGameServer run() called" );

    }
}
