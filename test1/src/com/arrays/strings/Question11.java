package com.arrays.strings;

//Write a program to get the canonical representation of the string object

public class Question11 {
	public static void main(String[] args)
	{
		String str1 = "Java Test";
		String str2 = new StringBuffer("Java").append(" Test").toString();
		String str3 = str2.intern();
 
		System.out.println("str1 == str2 ? " + (str1 == str2));
		System.out.println("str1 == str3 ? " + (str1 == str3));
	}

}
/*
 * str1 == str2 ? false
str1 == str3 ? true*/
 