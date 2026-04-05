package com.array;

import java.util.Scanner;

public class SecondMax {

	public static void main(String[] args) {
		int[] array = new int[5];
		int secondMax;

		// input for Array
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element of Array = ");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		sc.close();// Scanner class closing

		System.out.println("2nd Maximum Number : ");
		// Decending order concept
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		secondMax = array[array.length - 2];
		System.out.print(secondMax + " ");
	}

}
