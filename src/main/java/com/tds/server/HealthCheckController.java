package com.tds.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HealthCheckController {

    private static final int STATUS_OK = 200;

    private final AtomicLong counter = new AtomicLong();

    @GetMapping( "/health" )
    public HealthCheck report() {
        return new HealthCheck( counter.incrementAndGet(), STATUS_OK );
    }

}
