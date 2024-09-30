package com.arrays.strings;
import java.util.Scanner;

//Write a program to array elements print all odd number

public class Question3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array limit");
		int l=sc.nextInt();
		int [] a =new int[l];
		for(int i=0;i<l;i++) {
			System.out.printf("Enter elemewnt of a[%d] : ",i);
			a[i]=sc.nextInt();
		}
		System.out.println("Odd array elements   \n");
		for(int num:a) {
			if(num%2==0) {
				System.out.println(num);
			}
		}
	}

}

/*
 * Enter the array limit
5
Enter elemewnt of a[0] : 1
Enter elemewnt of a[1] : 2
Enter elemewnt of a[2] : 3
Enter elemewnt of a[3] : 4
Enter elemewnt of a[4] : 5
Odd array elements   

2
4*/
