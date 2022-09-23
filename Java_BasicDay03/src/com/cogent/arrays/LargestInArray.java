package com.cogent.arrays;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author samuelkawuma
 *Sep 22, 2022
 */

public class LargestInArray {
	static int large(int []arr)
	{
		int i;

		// Initialize maximum element
		
		int max = Integer.MIN_VALUE;

		// Traverse array elements from second and
		// compare every element with current max
		for (i = 0; i < arr.length; i++)
			if (arr[i] > max)
				max = arr[i];

		return max;
	}
	public static void main(String[] args) {
		char answer = 'y';
		
		while (Character.toUpperCase(answer) == 'Y') {
			try {
				Scanner s = new Scanner(System.in);
				System.out.println("Please enter The Size of your preffered ArraySize");
				//creates an array in the memory of length n
				int n = s.nextInt();
				System.out.println("enter random numbers of array size " + n);
				int[] a = new int[n];

				for (int i = 0; i < a.length; i++) {
					//reading the number of elements from the that we want to enter
					a[i] = s.nextInt();
				}

				System.out.println(Arrays.toString(a));
				System.out.println("The Largets Number is "+ large(a) );
				System.out.print("\n Do you want to continue (y or n)?");
				Scanner keyboard = new Scanner(System.in);
				answer = keyboard.next().charAt(0);

			}catch (InputMismatchException e) {

				System.out.println("Oops that was an invalid input!!! TRY AGAIN");

			}
		}
	}

}

