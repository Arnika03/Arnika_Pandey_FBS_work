package com.array;

import java.util.Scanner;

public class AlternateNum {

	public static void main(String[] args) {

		int[] array = new int[10];

		// input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element : ");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		sc.close();
		// Busines logic for printing alternate number
		//starting from 1st index
		System.out.println("\nElements at even indices : ");
		for (int i = 0; i < array.length; i += 2) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		//starting from 2nd index
		System.out.println("\nElements at odd indices : ");
		for (int i = 1; i < array.length; i += 2) {
			System.out.print(array[i]+" ");
		}
		
		//More Optimize way
//		for (int i = 0; i < array.length; i++) {
//			if(i % 2 == 0) {
//			System.out.print(" Even index : " +array[i]);
//			}else {
//				System.out.print("\nOdd index : " +array[i]);
//			}
//		}

	}

}
