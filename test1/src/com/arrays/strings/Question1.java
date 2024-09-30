package com.arrays.strings;
import java.util.Scanner;

// Q1 Write a program to copy the elements of one array into another array

public class Question1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the length of Array");
		int l=sc.nextInt();
		int [] a=new int [l];
		int  [] b=new int [l];
		for(int i=0;i<l;i++) {
			System.out.printf("Enter array element of a[%d]",i);
			a[i]=sc.nextInt();
		}
		for(int i=0;i<l;i++) {
			b[i]=a[i];
		}
		System.out.println("original array is /n");
		for(int i=0;i<l;i++) {
			System.out.printf("\na[%d]= %d ",i,a[i]);
		}
		System.out.println("\n copy array is");
		for(int i=0;i<l;i++) {
			System.out.printf("\nb[%d]= %d",i,a[i]);
		}
	}
	

}


/*
 * Enter the length of Array
5
Enter array element of a[0]1
Enter array element of a[1]2
Enter array element of a[2]3
Enter array element of a[3]4
Enter array element of a[4]5
original array is /n

a[0]= 1 
a[1]= 2 
a[2]= 3 
a[3]= 4 
a[4]= 5 
 copy array is

b[0]= 1
b[1]= 2
b[2]= 3
b[3]= 4
b[4]= 5*/
 