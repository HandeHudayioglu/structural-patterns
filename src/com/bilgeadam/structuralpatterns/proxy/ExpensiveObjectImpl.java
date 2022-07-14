package com.bilgeadam.structuralpatterns.proxy;

public class ExpensiveObjectImpl implements ExpensiveObject {
	
	 public ExpensiveObjectImpl() {
	        heavyInitialConfiguration();
	    }

	private void heavyInitialConfiguration() {
		
		System.out.println("Loading initial configuration..");
	}

	@Override
	public void process() {
		System.out.println("Processing complate.");
		
	}


}
