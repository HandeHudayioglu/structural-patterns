package com.bilgeadam.structuralpatterns.facade.carsystem;

import java.util.logging.Logger;

import org.slf4j.LoggerFactory;

public class TemperatureSensor {
	
	
	private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(TemperatureSensor.class);
	
	public void getTemperature() {
		
		LOGGER.info("Getting temperature from the sensor...");
	}

}
