package com.bilgeadam.structuralpatterns.facade.carsystem;

import java.util.logging.Logger;

import org.slf4j.LoggerFactory;

public class AirFlowController {
	
	private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(AirFlowController.class);
    private static AirFlowMeter airFlowMeter = new AirFlowMeter();
    
    
    public void takeAir() {
    	
    	airFlowMeter.getMeasurements();
        LOGGER.info("Air provided!");
    }
    
    public void off() {
        LOGGER.info("Air controller switched off.");
    }
}
