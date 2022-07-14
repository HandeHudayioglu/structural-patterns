package com.bilgeadam.structuralpatterns.bridge;

public class Square extends Shape {

	public Square(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String draw() {
		
		return "Square drawn " + color.fill();
	}

}
