package com.bilgeadam.structuralpatterns.adapter;

import java.util.logging.Logger;

public class Test {

	public static void main(String[] args) {
		
		
		final Logger LOG = Logger.getLogger("GLOBAL");
		
		
		Movable mercedes = new Mercedes();
    	MovableAdapter mercedesAdapter = (MovableAdapter) new MovableAdapterImpl(mercedes);
    	
    	LOG.info("Top speed of Mercedes: "+ mercedes.getSpeed()+ " mhp");
    	LOG.info("Top speed of Mercedes: "+mercedesAdapter.getSpeed()+" km");
	}

}
