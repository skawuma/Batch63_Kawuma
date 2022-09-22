package com.cogent;
import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;
/**
 * @author samuelkawuma
 *
 */

public class LargeAndSmallNumber {

	static int largest(int []arr)
	{
		int i;

		// Initialize maximum element
		// int max = arr[0];
		int max = Integer.MIN_VALUE;

		// Traverse array elements from second and
		// compare every element with current max
		for (i = 0; i < arr.length; i++)
			if (arr[i] > max)
				max = arr[i];

		return max;
	}

	static int smallest(int []arr)
	{
		int i;

		// Initialize minimum element to the largest Max value
		// Start comparing from arr[0];
		int min = Integer.MAX_VALUE;

		// Traverse array elements from second and
		// compare every element with current min
		for (i = 0; i < arr.length; i++)
			if (arr[i] < min)
				min = arr[i];

		return min;
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
				System.out.println("The Largets Number is "+ largest(a) + " Whereas The smallest number is " + smallest(a) );

				System.out.print("\n Do you want to continue (y or n)?");
				Scanner keyboard = new Scanner(System.in);
				answer = keyboard.next().charAt(0);

			}catch (InputMismatchException e) {

				System.out.println("Oops that was an invalid input!!! TRY AGAIN");

			}
		}
	}
}

