package com.bilgeadam.structuralpatterns.facade.carsystem;

import java.util.logging.Logger;

import org.slf4j.LoggerFactory;

public class CatalyticConverter {
	
	private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(CatalyticConverter.class);
	
	public void on() {
        LOGGER.info("Catalytic Converter switched on!");
    }
	
	 public void off() {
	        LOGGER.info("Catalytic Converter switched off!");
	    }

}
