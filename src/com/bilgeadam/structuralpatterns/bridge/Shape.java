package com.bilgeadam.structuralpatterns.bridge;

public abstract class Shape {
	
	protected Color color;

	public Shape(Color color) {
		super();
		this.color = color;
	}
	
	abstract public String draw();

}
