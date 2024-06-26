package com.gautam.OOPSConcepts;

public class Parent extends Person {

	public Parent(String name, int age) {
		super(name, age);
		setTypePerson();
	}

	// Overriding
	public void setTypePerson() {
		type = "Parent";
	}

}
