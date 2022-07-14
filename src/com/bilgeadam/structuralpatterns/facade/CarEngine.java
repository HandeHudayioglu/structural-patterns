package com.bilgeadam.structuralpatterns.facade;

import com.bilgeadam.structuralpatterns.facade.carsystem.AirFlowController;
import com.bilgeadam.structuralpatterns.facade.carsystem.AirFlowMeter;
import com.bilgeadam.structuralpatterns.facade.carsystem.CatalyticConverter;
import com.bilgeadam.structuralpatterns.facade.carsystem.CoolingController;
import com.bilgeadam.structuralpatterns.facade.carsystem.FuelInjector;
import com.bilgeadam.structuralpatterns.facade.carsystem.FuelPump;
import com.bilgeadam.structuralpatterns.facade.carsystem.Radiator;
import com.bilgeadam.structuralpatterns.facade.carsystem.Starter;
import com.bilgeadam.structuralpatterns.facade.carsystem.TemperatureSensor;

public class CarEngine {
	private static final Integer DEFAULT_COOLING_TEMP = 90;
	AirFlowController airFlowController = new AirFlowController();
	CatalyticConverter catalyticConverter = new CatalyticConverter();
	FuelPump fuelPump = new FuelPump();
	Starter starter = new Starter();
	CoolingController coolingController = new CoolingController();
	FuelInjector fuelInjector = new FuelInjector();
	
	public void start() {
		
		airFlowController.takeAir();
		starter.start();
		catalyticConverter.on();
		coolingController.setTemperatureUpperLimit(DEFAULT_COOLING_TEMP);
		fuelInjector.on();
		fuelInjector.inject();
		System.out.println("Engine is starting");
		
		}
	
	public void stop() {
		
		fuelInjector.off();
		catalyticConverter.off();
		coolingController.stop();
		airFlowController.off();
		System.out.println("Engine is stopping ");
		
		
	}

}
