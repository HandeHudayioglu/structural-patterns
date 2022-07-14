package com.bilgeadam.structuralpatterns.facade.carsystem;

import java.util.logging.Logger;

import org.slf4j.LoggerFactory;

public class FuelPump {
	
	private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(FuelPump.class);
	
	 public void pump() {
	        LOGGER.info("Fuel Pump is pumping fuel..");
	    }

}
