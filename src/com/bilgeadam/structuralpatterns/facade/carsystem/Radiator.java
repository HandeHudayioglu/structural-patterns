package com.bilgeadam.structuralpatterns.facade.carsystem;

import java.util.logging.Logger;

import org.slf4j.LoggerFactory;

public class Radiator {
	
	private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(Radiator.class);
	
	public void on(){
        LOGGER.info("Radiator switched on!");
    }

    public void off(){
        LOGGER.info("Radiator switched off!");
    }

    public void setSpeed(Integer speed){
        LOGGER.info("Setting radiator speed to " +speed);
    }

}
