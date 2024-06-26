package com.gautam.OOPSConcepts;

public class Child extends Person {

	public Child(String name, int age) {
		super(name, age);
		setTypePerson();
		// TODO Auto-generated constructor stub
	}

	public void setTypePerson() {
		type = "Child";
	}

}
