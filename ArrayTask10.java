package com.yash.array;

import java.util.Scanner;

public class ArrayTask10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array Size");
		int size = sc.nextInt();
		String s[] = new String[size];
		System.out.println("Enter String");
		for (int i = 0; i < s.length; i++) {
			s[i] = sc.next();
			// System.out.println(s[i]);
		}

		ascendingOrderString(s);
	}

	private static void ascendingOrderString(String[] arr) {
		// sorting array
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				String temp;
				if (arr[i].length() > arr[j].length()) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
