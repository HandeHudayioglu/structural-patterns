package com.bilgeadam.structuralpatterns.decorator;

public class Garland extends TreeDecorator {

	public Garland(ChristmasTree tree) {
		super(tree);
		
	}

	@Override
	public String decorate() {
		
		return super.decorate()+decorateWithGarland();
	}

	private String decorateWithGarland() {
		
		return " with garland";
	}
	
	

}
