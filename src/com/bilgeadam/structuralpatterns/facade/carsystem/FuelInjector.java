package com.bilgeadam.structuralpatterns.facade.carsystem;

import java.util.logging.Logger;

import org.slf4j.LoggerFactory;

public class FuelInjector {
	
	private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(FuelInjector.class);
	
	
	private FuelPump fuelPump = new FuelPump();
	
	public void on(){
        LOGGER.info("Fuel injector ready to inject fuel.");
    }
	
	public void inject() {
        fuelPump.pump();
        LOGGER.info("Fuel injected.");
    }
	
	public void off() {
        LOGGER.info("Stopping Fuel injector..");
    }


}
