package com.tds.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HealthCheckController {

    private static final int STATUS_OK = 200;

    private static final Logger LOGGER = LoggerFactory.getLogger( HealthCheckController.class );

    private final AtomicLong counter = new AtomicLong();

    @GetMapping( "/health" )
    public HealthCheck report() {
        LOGGER.info( "HealthCheckController.report() called" );
        return new HealthCheck( counter.incrementAndGet(), STATUS_OK );
    }

}
