package com.yash.string;

import java.util.Scanner;

public class StringTask5 {
	public static void main(String[] args) {
	
	 Scanner sc = new Scanner(System.in);
		System.out.println("how many names you want to be enter: ");
		int totalNamesLength = sc.nextInt();
		String[] allNames = new String[totalNamesLength];
		System.out.println("Please enter names: ");
		//totalNames
		for (int i = 0; i < totalNamesLength; i++) {
			allNames[i] = sc.next();
		}

		for (int i = 0; i < allNames.length; i++) {

			for (int j = i + 1; j < allNames.length; j++) {
				if (allNames[i].toCharArray().length > allNames[j].toCharArray().length) {
					String temp = allNames[i];
					allNames[i] = allNames[j];
					allNames[j] = temp;
				}

			}
		}
		for(String str : allNames) {
			System.out.println("Sorted names by length: "+str);
		}
	}
		
		
		
		
		
}


