package com.gautam.JSONFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;

public class JSONHandler {

	public static void createJsonFile(String filePath, Person person) {
		JSONObject jsonObject = new JSONObject();
		try {
			jsonObject.put("name", person.getName());
			jsonObject.put("age", person.getAge());
			jsonObject.put("email", person.getEmail());

			try (FileWriter file = new FileWriter(filePath)) {
				file.write(jsonObject.toString());
				System.out.println("Successfully created JSON file: " + filePath);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}

	public static Person readJsonFile(String filePath) {
		StringBuilder jsonString = new StringBuilder();

		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = reader.readLine()) != null) {
				jsonString.append(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		Person person = new Person();
		try {
			JSONObject jsonObject = new JSONObject(jsonString.toString());
			person.setName(jsonObject.getString("name"));
			person.setAge(jsonObject.getInt("age"));
			person.setEmail(jsonObject.getString("email"));
		} catch (JSONException e) {
			e.printStackTrace();
		}

		return person;
	}

	public static void modifyJsonFile(String filePath, String key, Object newValue) {
		StringBuilder jsonString = new StringBuilder();

		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = reader.readLine()) != null) {
				jsonString.append(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			JSONObject jsonObject = new JSONObject(jsonString.toString());
			jsonObject.put(key, newValue);

			try (FileWriter file = new FileWriter(filePath)) {
				file.write(jsonObject.toString());
				System.out.println("Successfully modified JSON file: " + filePath);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}

}
