package com.array;

import java.util.Scanner;

public class ElementSum {

	public static void main(String[] args) {
		int[] array = new int[5];	
		int sum = 0;
		
		//taking input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element : ");
		
		for(int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		sc.close();
		//Business logic to calculate sum
//		for(int i = 0; i < array.length; i++) {
//			sum += array[i]; 
//		}
		//use when index is not needed
		for(int num:array) {
			sum += num; 
		}
		
		System.out.println("Sum of Element = "+sum);

	}

	
}
