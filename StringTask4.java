package com.yash.string;

import java.util.Scanner;

public class StringTask4
{
	static int sumOfChar(String alpha)
	{
	   
	    int score = 0;
	 
	    for (int i = 0; i < alpha.length(); i++)
	    {
	       
	       
	        if (alpha.charAt(i) >= 'A' && alpha.charAt(i) <= 'Z')
	            score += alpha.charAt(i) - 'A' + 1;
	        else
	            score += alpha.charAt(i) - 'a' + 1;
	    }
	   
	    return score;
	}
	 
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);  
		System.out.print("Enter a string: ");  
		String s= sc.nextLine();   
		
	    System.out.println(sumOfChar(s));
	}
	

}
