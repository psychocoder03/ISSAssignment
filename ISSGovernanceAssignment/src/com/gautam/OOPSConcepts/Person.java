package com.gautam.OOPSConcepts;

public class Person {
	String name;
	int age;
	String type;
	int income;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		setTypePerson();
	}

	public void setTypePerson() {
		type = "Person";
	}

	public String describeMe() {
		String description = """
				Hello, my name is %s.
				I am %s years old.
				I am a %s.
				""";
		return String.format(description, name, age, type);

	}

	public void setIncome(int income) {
		this.income = income;
	}

}
