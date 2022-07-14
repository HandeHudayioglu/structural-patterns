package com.bilgeadam.structuralpatterns.adapter;

public class MovableAdapterImpl implements Movable {
	
	private Movable car;

	public MovableAdapterImpl(Movable car) {
		super();
		this.car = car;
	}

	@Override
	public double getSpeed() {
		
		return convertMPHtoKMPH(car.getSpeed());
	}
	
	private double convertMPHtoKMPH(double mph) {
        return mph * 1.60934;
    }

}
