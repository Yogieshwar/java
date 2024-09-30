package com.arrays.strings;

//Write a program to check whether two String objects contain the same data

public class Question13 {
	public static void main(String[] args)
	{
		String s1 = "Java Test";
		String s2 = "Java Full stack";
		String s3 = "Java Test";
		boolean equ1 = s1.equals(s2);
		boolean equ2 = s1.equals(s3);
		System.out.println("'" + s1 + "' equals '" +s2 + "' ? " + equ1);
		System.out.println("'" + s1 + "' equals '" +s3 + "' ? " + equ2);
	}

}

/*
 * 'Java Test' equals 'Java Full stack' ? false
'Java Test' equals 'Java Test' ? true
*/
 