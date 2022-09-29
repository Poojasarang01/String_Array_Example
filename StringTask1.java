package com.yash.string;

import java.util.Scanner;

public class StringTask1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First String");
		String firstString = sc.nextLine();

		System.out.println("Enter the Second");
		String secondString = sc.nextLine();

		char input1[] = firstString.toCharArray();
		int ind = 0;
		for (int i = 0; i < firstString.length(); i++) {
			char c = firstString.charAt(i);
			if (c == 'a' || c == 'A' || c == 'E' || c == 'e' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u'
					|| c == 'U') {
				try {
					input1[i] = secondString.charAt(ind);
					ind++;
				} catch (StringIndexOutOfBoundsException e) {
					input1[i] = '_';
				}
			}

		}
		String s = new String(input1);
		System.out.println("Result String =" + s);
	}
}