package com.bilgeadam.structuralpatterns.facade.carsystem;

import java.util.logging.Logger;

import org.slf4j.LoggerFactory;

public class AirFlowMeter {
	
	private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(AirFlowMeter.class);
	
	public void getMeasurements() {
        LOGGER.info("Getting air measurements..");
    }

}
