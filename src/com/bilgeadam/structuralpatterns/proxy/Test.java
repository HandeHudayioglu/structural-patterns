package com.bilgeadam.structuralpatterns.proxy;

public class Test {

	public static void main(String[] args) {
		
		ExpensiveObject object = new ExpensiveObjectProxy();
        object.process();
        object.process();

	}

}
