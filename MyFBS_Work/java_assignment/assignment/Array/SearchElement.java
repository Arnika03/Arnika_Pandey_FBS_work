package com.array;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		int[] numArray;
		numArray = new int[10];
		int num;
		int index = -1;
		boolean found = false;

		// Scanner class for taking input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Elements here : ");

		// loop for element input
		for (int i = 0; i < numArray.length; i++) {
			numArray[i] = sc.nextInt();
		}
		sc.close();

		// input for search number
		System.out.println("Enter number to search : ");
		num = sc.nextInt();

		// logic operation for searching number
		for (int i = 0; i < numArray.length; i++) {
			if (numArray[i] == num) {
				found = true;
				index = i;
				break;
			}
		}
		if (found) {
			System.out.println("Number Found at : " + index);
		} else {
			System.out.println("Number Not Found!!");
		}

	}

}
