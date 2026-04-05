package com.array;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		int[] array = new int[10];
//		int[] reverseArray = new int[10];

		// input for 1st Array
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element of Array 1 = ");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		sc.close();// Scanner class closing

		// Business Logic
		System.out.println("Reverse Array : ");
//		for (int i = 0; i < array.length; i++) {
//			reverseArray[i] = array[array.length - i - 1];
//			System.out.println(reverseArray[i] + " ");
//		}

//		2nd way with less space complexity
		for (int i = 0; i < array.length / 2; i++) {
			int temp = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = temp;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
	}

}
