package com.yash.array;

import java.util.Scanner;

public class ArrayTask4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		System.out.println("Enter array ele");
		int inputArray[] = new int[size];
		for (int i = 0; i < size; i++) {
			inputArray[i] = sc.nextInt();
		}
		int first, second, third;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				for (int k = i + 2; k < size; k++) {
					first = inputArray[i];
					second = inputArray[j];
					third = inputArray[k];
					if (first * first + second * second == third * third)
						System.out.println(" " + first + " " + second + " " + third);

				}
			}
		}

	}

}
