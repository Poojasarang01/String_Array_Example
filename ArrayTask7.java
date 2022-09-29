package com.yash.array;


import java.util.Scanner;

public class ArrayTask7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();

		System.out.println("Enter array element");
		int array[] = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}

		int min, max, x, lcm = 0, hcf = 0;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size - 1; j++) {
				if (array[i] > array[j]) {
					min = array[j];
					max = array[i];
				} else {
					min = array[i];
					max = array[j];
				}
				for (int k = 0; k < size; k++) {
					x = k * max;
					if (x % min == 0) {
						lcm = x;
					}
				}
				if (array[i] < array[j]) {
					hcf = array[i];
				} else {
					hcf = array[j];
				}
				while (true) {
					if ((array[i] % hcf == 0) && (array[j] % hcf == 0))
						break;
					else
						hcf--;
				}
			}
		}

		System.out.println("LCM of the given array of numbers : " + lcm);
		System.out.println("HCF of the given array of numbers : " + hcf);
	}

}


