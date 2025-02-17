package com.gautam.JSONFile;

public class Main {
	public static void main(String[] args) {
		String filePath = "person.json";

		Person person = new Person();
		person.setName("John Doe");
		person.setAge(30);
		person.setEmail("johndoe@example.com");

		JSONHandler.createJsonFile(filePath, person);

		Person readPerson = JSONHandler.readJsonFile(filePath);
		System.out.println("Read from JSON file:");
		System.out.println("Name: " + readPerson.getName());
		System.out.println("Age: " + readPerson.getAge());
		System.out.println("Email: " + readPerson.getEmail());

		JSONHandler.modifyJsonFile(filePath, "age", 35);
		System.out.println("Modified age in JSON file to 35.");

		Person modifiedPerson = JSONHandler.readJsonFile(filePath);
		System.out.println("Read modified JSON file:");
		System.out.println("Name: " + modifiedPerson.getName());
		System.out.println("Age: " + modifiedPerson.getAge());
	}
}
