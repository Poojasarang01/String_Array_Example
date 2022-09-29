package com.yash.array;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ArrayTask9 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		System.out.println("Enter array ele");
		int arr[] = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int n = arr.length;
		int x = 7;

		rearrange(arr, n, x);
		printArray(arr, n);

	}

	static void rearrange(int[] arr, int n, int x) {
		TreeMap<Integer, ArrayList<Integer>> m = new TreeMap<>();

		for (int i = 0; i < n; i++) {
			int diff = Math.abs(x - arr[i]);
			if (m.containsKey(diff)) {
				ArrayList<Integer> al = m.get(diff);
				al.add(arr[i]);
				m.put(diff, al);
			} else {
				ArrayList<Integer> al = new ArrayList<>();
				al.add(arr[i]);
				m.put(diff, al);
			}
		}

		int index = 0;
		for (Map.Entry entry : m.entrySet()) {
			ArrayList<Integer> al = m.get(entry.getKey());
			for (int i = 0; i < al.size(); i++)
				arr[index++] = al.get(i);
		}
	}

	static void printArray(int[] arr, int n) {
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

}
