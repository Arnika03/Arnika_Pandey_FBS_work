package com.array;

import java.util.Scanner;

public class EvenOddNum {

	public static void main(String[] args) {

		int[] array = new int[6];
		int evenCount, oddCount;
		evenCount = oddCount = 0;

		// input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Element : ");

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		sc.close();

		// Business Logic to print even & odd
		for (int num : array) {
			if (num % 2 == 0) {
				evenCount++;
				System.out.println(num + " is Even");
			} else {
				oddCount++;
				System.out.println(num + " is Odd");
			}
		}
		System.out.println();
		System.out.println("Even count = " + evenCount);
		System.out.println("Odd count = " + oddCount);

	}

}
