package com.gautam.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collection {
	public static void main(String[] args) {

		List<Integer> integerList = new ArrayList<>(Arrays.asList(5, 3, 1, 4, 2));
		System.out.println("Original Integer List: " + integerList);
		Collections.sort(integerList);
		System.out.println("Sorted Integer List: " + integerList);

		Set<Integer> integerSet = new HashSet<>(integerList);
		System.out.println("Integer Set: " + integerSet);

		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student(3, "Ram"));
		studentList.add(new Student(1, "Shyam"));
		studentList.add(new Student(2, "Om"));
		System.out.println("Original Student List: " + studentList);
		Collections.sort(studentList);
		System.out.println("Sorted Student List by ID: " + studentList);

		Set<Student> studentSet = new HashSet<>(studentList);
		System.out.println("Student Set: " + studentSet);

		Map<Integer, Student> studentMap = new HashMap<>();
		for (Student student : studentList) {
			studentMap.put(student.getId(), student);
		}
		System.out.println("Student Map: " + studentMap);
	}
}
