package com.softsquare.ms.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class HealthController implements HealthIndicator {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Override
    public Health health() {
		logger.info("/health called");
        //int errorCode = check(); // perform some specific health check
//        if (errorCode != 0) {
//            return Health.down().withDetail("Error Code", errorCode).build();
//        }
		
        return Health.up().status("I am OK!").build();
    }
	
}
