package com.array;

import java.util.Scanner;

public class AdditionTwoArray {

	public static void main(String[] args) {
		int[] array1 = new int[5];
		int[] array2 = new int[5];
		int[] sumArray = new int[5];

		// input for 1st Array
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element of Array 1 = ");
		for (int i = 0; i < array1.length; i++) {
			array1[i] = sc.nextInt();
		}
		// input for 2nd Array
		System.out.println("\nEnter element of Array 2 = ");
		for (int i = 0; i < array2.length; i++) {
			array2[i] = sc.nextInt();
		}
		sc.close();// Scanner class closing

		// Business Logic
		System.out.println("Sum of 1st and 2nd Array Element : ");
		for (int i = 0; i < array1.length; i++) {
			sumArray[i] = array1[i] + array2[i];
			System.out.print(sumArray[i] + " ");
		}

	}

}
