package com.bilgeadam.structuralpatterns.composite;

public class SalesDepartment implements Department {
	
	private int id;
	private String name;
	
	
	public SalesDepartment(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	@Override
	public void printDepartmentName() {
		
		System.out.println(getClass().getSimpleName());
	}



	public int getId() {
		return this.id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return this.name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
