package com.gautam;

public class Loop {

	public static void main(String[] args) {
		int[] numArr = new int[10];
		int i = 0;

		// for loop
		for (int j = 0; j < 10; j++) {
			numArr[j] = j;
		}

		// while loop
		while (i < 10) {

			// Decision Making
			if (i % 2 != 0) {
				numArr[i] += 10 * i;
				i++;
			} else {
				numArr[i] += i;
				i++;
			}

		}

		// foreach loop
		for (int num : numArr) {
			System.out.println(num);
		}

	}

}
