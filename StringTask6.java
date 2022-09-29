package com.yash.string;


import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTask6 {

	public static void main(String[] args)

	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();

		String delims = "#";
		StringTokenizer st = new StringTokenizer(str, delims);
		System.out.println("No of Token = " + st.countTokens());
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());

		}
	}

}
