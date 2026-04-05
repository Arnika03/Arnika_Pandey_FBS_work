package com.array;

import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		int[] array = new int[10];

		// input for Array
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element of Array  = ");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		sc.close();// Scanner class closing

		// Business logic
		System.out.println("Ascending Order : ");
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++)
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("Descending Order : ");
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
