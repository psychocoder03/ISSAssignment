package com.gautam;

public class SwitchCase {

	private enum Colors {
		Blue, Orange, Green, Red

	}

	private static void colorTheWall(String color) {

		// Decision Making
		switch (color) {
		case "Red":
			System.out.println(String.format("Color the wall %s", Colors.Red.name()));
			break;
		case "Orange":
			System.out.println(String.format("Color the wall %s", Colors.Orange.name()));
			break;
		case "Green":
			System.out.println(String.format("Color the wall %s", Colors.Green.name()));
			break;
		case "Blue":
			System.out.println(String.format("Color the wall %s", Colors.Blue.name()));
			break;
		default:
			System.out.println("Color the wall White");

		}

	}

	public static void main(String[] args) {
		colorTheWall(Colors.Red.name());
	}

}
