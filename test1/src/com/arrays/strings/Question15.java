package com.arrays.strings;

//Write a program to compare a given string to the specified character sequence

public class Question15 {
	public static void main(String[] args)
	{
		String str1 = "Yogieshwar";
		String str2 = "Java Developer";
		CharSequence cs = "Java Developer";
		System.out.println("Comparing '"+str1+"'"+" and '"+cs+"' : " + str1.contentEquals(cs));
		System.out.println("Comparing '"+str2+"'"+" and '"+cs+"' :"+ str2.contentEquals(cs));
	}

}


/*
 * Comparing 'Yogieshwar' and 'Java Developer' : false
Comparing 'Java Developer' and 'Java Developer' :true*/
 