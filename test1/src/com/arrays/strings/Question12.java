package com.arrays.strings;

//Write a program to check whether a given string ends with the contents of another string

public class Question12 {
	public static void main(String[] args)
	{
		String str1 = "Test of Java";
		String str2 = "Java Full Stack";
 
		String e = "va";
		boolean ends1 = str1.endsWith(e);
		boolean ends2 = str2.endsWith(e);
		System.out.println("'" + str1 + "' ends with " +"'" + e + "' ? " + ends1);
		System.out.println("'" + str2 + "' ends with " + "'" + e + "' ? " + ends2);
	}

}

/*
 * 'Test of Java' ends with 'va' ? true
'Java Full Stack' ends with 'va' ? false
*/
 