package com.arrays.strings;
import java.util.Scanner;

//Write a program to calculate the average value of array elements

public class Question8 {
	public static void main(String[] args)
	{   
		Scanner input =new Scanner(System.in);
		System.out.print("Enter the Array Limit :");
		int l =input.nextInt();
		int [] a =new int[l]; 
		int sum = 0; 
		for(int i=0;i<l;i++)
		{
			System.out.printf("Element of a[%d] :",i);
			a[i]=input.nextInt();
		} 
		for(int i=0; i < l ; i++)
			sum = sum + a[i];
 
		double ave = sum / l;
		System.out.println("Sum of Array Value : " + sum); 
		System.out.println("Average of Array Value : " + ave); 
    }

}

/*
 * Enter the Array Limit :5
Element of a[0] :1
Element of a[1] :2
Element of a[2] :3
Element of a[3] :4
Element of a[4] :5
Sum of Array Value : 15
Average of Array Value : 3.0*/
 