package com.arrays.strings;
import java.util.Scanner;

//Write a program to merge two arrays elements to store third array

public class Question10 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("Enter the First Array Limit :");
		int n =input.nextInt();
		System.out.print("Enter the Second Array Limit :");
		int m =input.nextInt();
		int [] a =new int[n];
		int [] b =new int[m];
		int [] c =new int[100];
		int k=0;
		for(int i=0;i<n;i++)
		{
			System.out.printf("Element of a[%d] :",i);
			a[i]=input.nextInt();
		}
		for(int i=0;i<m;i++)
		{
			System.out.printf("Element of b[%d] :",i);
			b[i]=input.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			c[k] = a[i];
			k++;
		}
		for(int i=0;i<m;i++)
		{
			c[k] = b[i];
			k++;
		}
		System.out.print("\nMerge two Array Elements ...\n");	
		for(int i=0;i<k;i++)
		{
			System.out.printf("\nc[%d] = %d",i,c[i]);
		}
	}
		
}

/*
 * Enter the First Array Limit :5
Enter the Second Array Limit :5
Element of a[0] :1
Element of a[1] :2
Element of a[2] :3
Element of a[3] :4
Element of a[4] :5
Element of b[0] :6
Element of b[1] :7
Element of b[2] :8
Element of b[3] :9
Element of b[4] :1

Merge two Array Elements ...

c[0] = 1
c[1] = 2
c[2] = 3
c[3] = 4
c[4] = 5
c[5] = 6
c[6] = 7
c[7] = 8
c[8] = 9
c[9] = 1*/


