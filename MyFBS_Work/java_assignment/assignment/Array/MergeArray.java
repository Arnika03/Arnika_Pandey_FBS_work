package com.array;
import java.util.Scanner;

public class MergeArray {

	public static void main(String[] args) {
		int[] array1 = new int[5];
		int[] array2 = new int[5];
		int[] mergeArray = new int[10];

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
		System.out.println("Merged Array of 1st and 2nd Array : ");
		for (int i = 0; i < array1.length; i++) {
			mergeArray[i] = array1[i];
			System.out.print(mergeArray[i] + " ");
		}
		for (int i = 0; i < array2.length; i++) {
			mergeArray[array1.length + i] = array2[i];
			System.out.print(mergeArray[array1.length + i] + " ");
		}

	}

}
