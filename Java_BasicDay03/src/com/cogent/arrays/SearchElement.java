package com.cogent.arrays;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author samuelkawuma
 *Sep 22, 2022
 */

public class SearchElement {

	static int search(int arr[], int target) {
		int i;
		for(i=0; i<arr.length; i++) {
			if (arr[i]==target)
				return i;
		}

		// if the target element is not found 

		return -1;
	}	

	public static void main(String[] args) {
		/**
		int  array[] = {10,5,6,7,8,23,44,67,69, 90};

		int pos= search(array,11);
		if (pos==-1) 
			System.out.println("Element Not Found at Any Position");
		else 
			// pos+1 because index in array starts at 0
			System.out.println("Element  Found at index " + (pos) + " in the array" +" but position " + (pos+1)+ " in the set");

		 **/
		char answer = 'y';

		while (Character.toUpperCase(answer) == 'Y') {
			try {
				Scanner s = new Scanner(System.in);
				System.out.println("Please enter The Size of your preffered ArraySize");
				//creates an array in the memory of length n
				int n = s.nextInt();
				System.out.println("Enter random numbers of array size " + n);
				int[] a = new int[n];

				for (int i = 0; i < a.length; i++) {
					//reading the number of elements from the that we want to enter
					a[i] = s.nextInt();
				}

				System.out.println(Arrays.toString(a));
				System.out.println("Enter random number You want to Search ");

				int p = s.nextInt();
				int pos = search(a,p);
				if (pos==-1)
					System.out.println("The number you enetered doent seem to appear in your Array");
				else
					System.out.println("Element  Found at index " + (pos) + " in the array" +" but position " + (pos+1)+ " in the set");



				System.out.print("\n Do you want to continue (y or n)?");
				Scanner keyboard = new Scanner(System.in);
				answer = keyboard.next().charAt(0);

			}catch (InputMismatchException e) {

				System.out.println("Oops that was an invalid input!!! TRY AGAIN");

			}
		}
	}



}



