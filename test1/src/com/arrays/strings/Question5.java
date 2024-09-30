package com.arrays.strings;
import java.util.Scanner;

//Write a program to array elements print sum of all Negative number

public class Question5 {
	public static void main(String[] args)
	{   
		int sum=0;
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the Array Limit :");
		int l =sc.nextInt();
		int [] a =new int[l];
		
		for(int i=0;i<l;i++)
		{
			System.out.printf("Element of a[%d] :",i);
			a[i]=sc.nextInt();
		}
		System.out.println("\nNegative Array Elements...\n");
		for(int n:a)
		{
			if(n<0) {
			
				System.out.println(n);
				sum=sum+n;
			}
		}
		System.out.println("sum of all Negative numbers in array "+sum);
		
    }

}

/*
 * Enter the Array Limit :5
Element of a[0] :1
Element of a[1] :2
Element of a[2] :3
Element of a[3] :-4
Element of a[4] :-5

Negative Array Elements...

-4
-5
sum of all Negative numbers in array -9*/
