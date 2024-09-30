package com.arrays.strings;

//Write a program to Count Number of Uppercase and Lowercase letters

public class Question17 {
	static void char_Count(StringBuffer str)
	{
		int lwr=0,upr=0,len = str.length();
		for (int i = 0; i < len; i++) {
			Character c = str.charAt(i);
			if (Character.isLowerCase(c))
				lwr+=1;
			else if (Character.isUpperCase(c))
				upr+=1;
			
		}
 
		System.out.println("Number of UpperCase  : "+upr);
		System.out.println("Number of LowerCase  : "+lwr);
	}
	public static void main(String[] args)
	{
		StringBuffer str = new StringBuffer("Java FullStack");
		char_Count(str);
	}

}

/*
 * Number of UpperCase  : 3
Number of LowerCase  : 10*/
 