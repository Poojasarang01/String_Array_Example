package com.yash.string;


import java.util.Scanner;

public class StringTask3
{
	public static void main(String[] args) {
		
	Scanner sc= new Scanner(System.in);  
	System.out.print("Enter a String: ");  
	String str= sc.nextLine();   
	
		char strArr[] = str.toCharArray();
		for (int i = 0; i < strArr.length; i++) 
		{
			
			if (strArr[i] >= 'a' && strArr[i] <= 'z')
			{
				strArr[i] = (char) ((int) strArr[i] - 32);
			}
		}
		System.out.print("Upper Case String is :- ");
		
		for (int i = 0; i < strArr.length; i++) 
		{
			System.out.print(strArr[i]);
		}
	}

}
