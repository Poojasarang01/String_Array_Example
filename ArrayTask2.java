package com.yash.array;

public class ArrayTask2 {

	public static int removeDuplicateElements(int arr[], int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[j++] = arr[i];
			}
		}
		arr[j++] = arr[n - 1];
		return j;
	}

	public static void main(String[] args) {
		int arr[] = { 22, 13, 20, 15, 25, 15, 16, 17 };
		int count = 0;
		for (int i : arr) {
			count++;
		}
		int length = count;
		length = removeDuplicateElements(arr, length);

		for (int i = 0; i < length; i++)
			System.out.print(arr[i] + " ");
	}
}