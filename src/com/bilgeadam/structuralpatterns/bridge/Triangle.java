package com.bilgeadam.structuralpatterns.bridge;

public class Triangle extends Shape {

	public Triangle(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String draw() {
		
		return "Triangle drawn "+ color.fill();
	}

}
