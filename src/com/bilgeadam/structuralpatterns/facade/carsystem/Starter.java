package com.bilgeadam.structuralpatterns.facade.carsystem;

import java.util.logging.Logger;

import org.slf4j.LoggerFactory;

public class Starter {
	
	private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(Starter.class);
	public void start() {
		
		LOGGER.info("Starting");
	}

}
