package com.arrays.strings;
import java.util.Scanner;

//Write a program to array elements print all Positive number

public class Question7 {
	public static void main(String[] args)
	{   
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the Array Limit :");
		int l =sc.nextInt();
		int [] a =new int[l];
		for(int i=0;i<l;i++)
		{
			System.out.printf("Element of a[%d] :",i);
			a[i]=sc.nextInt();
		}
		System.out.println("\nPositive Array Elements...\n");
		for(int p:a)
		{
			if(p>0)
				System.out.println(p);
		}
    }

}


/*
 * Enter the Array Limit :7
Element of a[0] :22
Element of a[1] :5
Element of a[2] :7
Element of a[3] :8
Element of a[4] :9
Element of a[5] :42
Element of a[6] :55

Positive Array Elements...

22
5
7
8
9
42
55*/
 