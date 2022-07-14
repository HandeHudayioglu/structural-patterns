package com.bilgeadam.structuralpatterns.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.logging.Logger;

public class LoggerUtil {
	
	public final static Logger LOG = Logger.getLogger("GLOBAL");
	
	 static {
	    	configuration();
	    }

	private static void configuration() {
		
		Properties props = new Properties();
		
		try {
			props.load(new BufferedReader(new InputStreamReader(LoggerUtil.class.getResourceAsStream("log4j.properties"))));
			
		} catch (Exception e) {
			System.err.println("log4j.properties file not configured properly");
		}
		
	 PropertyConfigurator.configure(props);
		
	}
	
	

}

