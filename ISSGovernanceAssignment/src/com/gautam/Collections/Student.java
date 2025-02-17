package com.gautam.Collections;

class Student implements Comparable<Student> {
	private int id;
	private String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Student other) {
		return Integer.compare(this.id, other.id);
	}

	@Override
	public String toString() {
		return "Student " + id + name + "}";

	}
}
