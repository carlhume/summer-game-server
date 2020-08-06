package com.tds.server;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class HealthCheckTest {

    @Test
    public void testHealthCheckCanReport() {
        HealthCheckController healthCheck = new HealthCheckController();
        assertNotNull( healthCheck.report() );
    }

}
