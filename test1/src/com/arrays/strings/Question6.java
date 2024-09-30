package com.arrays.strings;
import java.util.Scanner;

//write a program to print unique elements of array

public class Question6 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the Array Limit :");
		int l =sc.nextInt();
		int [] a =new int[l];
		
		for(int i=0;i<l;i++)
		{
			System.out.printf("Element of a[%d] :",i);
			a[i]=sc.nextInt();
		}
		// Print unique elements
        System.out.println("Unique elements in the array are:");
        for (int i = 0; i < l; i++) {
            boolean isUnique = true;
            for (int j = 0; j < l; j++) {
                if (i != j && a[i] == a[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.print(a[i] + " ");
            }
	}

}
}


/*
 * Enter the Array Limit :5
Element of a[0] :1
Element of a[1] :2
Element of a[2] :1
Element of a[3] :3
Element of a[4] :4
Unique elements in the array are:
2 3 4 */
