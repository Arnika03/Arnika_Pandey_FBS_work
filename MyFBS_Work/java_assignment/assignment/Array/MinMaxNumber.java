package com.array;

import java.util.Scanner;

public class MinMaxNumber {

	public static void main(String[] args) {

		int[] array;
		array = new int[10];

		int min, max;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element : ");

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		sc.close();
		min = max = array[0];

		// logic for Min and Max number search
		for (int i = 1; i < array.length; i++) {

			if (array[i] < min) {
				min = array[i];
			}

			if (array[i] > max) {
				max = array[i];
			}

		}
		System.out.println("Minimum number is = " + min);

		System.out.println("Maximum number is = " + max);
	}

}
