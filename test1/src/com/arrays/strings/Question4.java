package com.arrays.strings;
import java.util.Scanner;

//Write a program to search an element in an array

public class Question4 {
	public static void main(String[] args)
	{   
		Scanner input =new Scanner(System.in);
		System.out.print("Enter the Array Limit :");
		int l =input.nextInt();
		int [] a =new int[l];
		for(int i=0;i<l;i++)
		{
			System.out.printf("Element of a[%d] :",i);
			a[i]=input.nextInt();
		}
		System.out.print("Enter the Search Array Element :");
		int s =input.nextInt();
		int i,f=0;
		for(i=0; i<l; i++)
		{
			if(a[i]==s)
			{				
				f=1;
				break;
			}
		}
		if(f==1)
		{
			System.out.printf("Element is found at the position : %d", i + 1);
			System.out.printf("\nElement is  found at the index : %d", i);
		}
		else
		{
			System.out.println("Element is Not found");
		}
    }
	

}

/*
 * Enter the Array Limit :5
Element of a[0] :1
Element of a[1] :2
Element of a[2] :3
Element of a[3] :4
Element of a[4] :5
Enter the Search Array Element :3
Element is found at the position : 3
Element is  found at the index : 2*/
