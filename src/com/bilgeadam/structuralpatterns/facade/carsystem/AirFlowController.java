package com.bilgeadam.structuralpatterns.facade.carsystem;

import java.util.logging.Logger;

import org.slf4j.LoggerFactory;

public class AirFlowController {
	
	
    private static AirFlowMeter airFlowMeter = new AirFlowMeter();
    
    
    public void takeAir() {
    	
    	airFlowMeter.getMeasurements();
       System.out.println("Air provided!");
    }
    
    public void off() {
        System.out.println("Air controller switched off.");
    }
}
