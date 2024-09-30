package com.arrays.strings;

//Write a program to count a number of Unicode code points in the specified text range of a String

public class Question14 {
	public static void main(String[] args)
	{
		String str = "Yogieshwar";
		System.out.println("Given String : " + str);
		int c = str.codePointCount(1, 10);
		System.out.println("Codepoint count : " + c);
	}

}


/*
 * 
 * Given String : Yogieshwar
Codepoint count : 9*/
 