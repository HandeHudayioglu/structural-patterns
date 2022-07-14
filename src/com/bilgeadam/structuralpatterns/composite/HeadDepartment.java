package com.bilgeadam.structuralpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartment implements Department {
	
	private int id;
	private String name;
	private List<Department> childDepartments;

	public HeadDepartment(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.childDepartments = new ArrayList<>();
	}

	
	public void printDepartmentName() {
		
		childDepartments.forEach(Department::printDepartmentName);
		
		
	}
	
	public void addDepartMent(Department department) {
        childDepartments.add(department);
    }
	
	public void removeDepartment(Department department) {
        childDepartments.remove(department);
    }
	 
	 

}
