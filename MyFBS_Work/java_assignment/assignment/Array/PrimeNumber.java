package com.array;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int[] number = new int[10];
		boolean flag = false;
		// input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element : ");
		for (int i = 0; i < number.length; i++) {
			number[i] = sc.nextInt();
		}
		sc.close();

		// Busines logic for printing prime number
		for (int i = 0; i < number.length; i++) {
			flag = false;
			for (int j = 2; j < number[i]; j++) {
				if (number[i] % j == 0) {
					flag = true;
					break;
				}
			}
			if (flag) {
				System.out.println("Not Prime : " + number[i]);
			} else {
				System.out.println("Prime : " + number[i]);
			}
		}

	}

}
