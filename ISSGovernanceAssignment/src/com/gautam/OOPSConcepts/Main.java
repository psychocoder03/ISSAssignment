package com.gautam.OOPSConcepts;

public class Main implements ITax {

//	 Polymorphism
	public double CalculateTax(Parent parent) {
		return (parent.income * parent.age) / 100;
	}

	public double CalculateTax(Child child) {
		return (child.income * 0.05);
	}

	public static void main(String[] args) {
		Person person = new Person("Ram", 7);
		System.out.println(person.type);
		Parent parent = new Parent("Shyam", 30);
		System.out.println(parent.type);

		// Inheritance
		System.out.println(parent.describeMe());

		parent.setIncome(1000);
		ITax tax = new Main();
		System.out.println(tax.CalculateTax(parent));

	}

}
