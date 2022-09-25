package com.cogent.arrays;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author samuelkawuma
 *Sep 24, 2022
 */

public class ArrayAddition {

	static void addArray(int first[],int second[]) {

		int merge[] = new int[first.length + second.length];


		int count =0;

		for(int i =0; i<first.length; i++) {
			merge[i]= first[i];
			count++;
		}
		for(int j=0; j< second.length;j++) {
			merge[count++]= second[j]; 
			

		}
		System.out.println("The merged Array is "+ Arrays.toString(merge) );

		//for(int i=0;i<merge.length;i++) {
		//	System.out.print(merge[i] +  "");
		//	
		//ArrayAddition.addArray(a,b);
	}
	public static void main(String[] args) {
		char answer = 'y';

		while (Character.toUpperCase(answer) == 'Y') {
			try {
				Scanner s = new Scanner(System.in);
				System.out.println("Please enter The Size of your preffered ArraySize of Array 1");
				//creates an array in the memory of length n
				int n1 = s.nextInt();
				System.out.println("Please enter The Size of your preffered ArraySize of Array2");
				//creates an array in the memory of length n
				int n2 = s.nextInt();
				System.out.println("enter random numbers of array size " + n1);
				int[] a = new int[n1];

				for (int i = 0; i < a.length; i++) {
					//reading the number of elements from the that we want to enter
					a[i] = s.nextInt();
				}

				System.out.println("enter random numbers of array size " + n2);
				int[] b = new int[n2];

				for (int i = 0; i < b.length; i++) {
					//reading the number of elements from the that we want to enter
					b[i] = s.nextInt();
				}

				ArrayAddition.addArray(a,b);

				System.out.print("\n Do you want to continue (y or n)?");
				Scanner keyboard = new Scanner(System.in);
				answer = keyboard.next().charAt(0);

			}catch (InputMismatchException e) {

				System.out.println("Oops that was an invalid input!!! TRY AGAIN");

			}
		}
	}
}

