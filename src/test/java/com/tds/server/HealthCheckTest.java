package com.tds.server;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class HealthCheckTest {

    private HealthCheckController healthCheck;

    @BeforeEach
    public void setUp() {
        healthCheck = new HealthCheckController();
    }

    @Test
    public void testHealthCheckCanReport() {
        assertNotNull( healthCheck.report() );
    }

    @Test
    public void testHealthCheckReturns200IfAllIsWell() {
        assertEquals( 200, healthCheck.report().getStatus() );
    }
}
