package com.yash.array;

import java.util.Scanner;

public class ArrayTask5 {
	public static void main(String[] args) {
		ArrayTask5 ps5 = new ArrayTask5();
		ps5.number();
	}

	void number() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		System.out.println("Enter array ele");
		int inputArray[] = new int[size];
		int sumOfPerfectArray[] = new int[size];
		int k = 0;
		for (int i = 0; i < size; i++) {
			inputArray[i] = sc.nextInt();
		}
		System.out.println("Even Numbers");
		int c = 0, sum;
		for (sum = 0; sum < size; sum++) {
			if (inputArray[sum] % 2 == 0) {
				System.out.println("  " + inputArray[sum]);
				c = c + inputArray[sum];
			}
		}
		System.out.println(" Sum of even numbers " + c);

		System.out.println("Odd Numbers");
		int b, sumOfOdd = 0;
		for (b = 0; b < size; b++) {
			if (inputArray[b] % 2 != 0) {
				System.out.println("  " + inputArray[b]);
				sumOfOdd = sumOfOdd + inputArray[b];
			}

		}
		System.out.println(" Sum of od numbers " + sumOfOdd);

		System.out.println("Prime Numbers");
		int flag = 0, sumOfPrimeNumber = 0;
		for (int i = 0; i < size; i++) {
			if (checkPrime(inputArray[i])) {
				System.out.print(inputArray[i] + "  ");
				sumOfPrimeNumber = sumOfPrimeNumber + inputArray[i];

			}
		}
		System.out.println("sumOfPrimeNumber " + sumOfPrimeNumber);

		// perfect number and sum
		int d;

		for (d = 0; d < size; d++) {
			int number = isPerfectNumber(inputArray[d]);
			if (number > 0) {
				sumOfPerfectArray[k] = number;
				k++;
			}
		}

		int sumOfPerfectNumbers = sumOfPerfectNumbers(sumOfPerfectArray);
		System.out.println(sumOfPerfectNumbers);

	}

	private int isPerfectNumber(int number) {
		int i = 1;
		int sum = 0;
		while (i <= (number / 2)) {
			if (number % i == 0) {
				sum = sum + i;
			}
			i++;
		}

		if (sum == number) {
			System.out.println("yes " + number + " perfect number !!");
			return number;
		}
		return 0;

	}

	public static int sumOfPerfectNumbers(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;

	}

	public static boolean checkPrime(int n) {
		if (n <= 1)
			return false;

		int i = 2;
		while (i <= n / 2) {
			if ((n % i) == 0)
				return false;
			i++;
		}

		return true;
	}

}

