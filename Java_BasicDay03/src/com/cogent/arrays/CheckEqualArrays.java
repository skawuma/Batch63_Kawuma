package com.cogent.arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author SamuelKawuma
 *Sep 25, 2022
 */

public class CheckEqualArrays {

	static boolean isEquals(int a[],int b[]) {
		// checking first if the arrays aare equal in size
		if (a.length!=b.length)
			return false;
		// iterate through first array while comparing each element, if atleast one is not equal then return false;
		if (a.length == b.length) {
			for (int i =0; i< a.length;i++) {
				if (a[i]!=b[i]) {
					return false;
				}
			}
		}	 

		return  true;

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

				CheckEqualArrays.isEquals(a,b);
				if (CheckEqualArrays.isEquals(a,b)){

					System.out.println("Both Arrays are Equal");

				}
				else 
					System.out.println("Arrays are not Equal");

				System.out.print("\n Do you want to continue (y or n)?");
				Scanner keyboard = new Scanner(System.in);
				answer = keyboard.next().charAt(0);

			}catch (InputMismatchException e) {

				System.out.println("Oops that was an invalid input!!! TRY AGAIN");

			}
		}

		/**
		int x[]=  {1,2,3,8,5};
		int y[]=  {1,2,3,4,5};


		CheckEqualArrays.isEquals(x,y);

		if (CheckEqualArrays.isEquals(x,y)){

			System.out.println("Both Arrays are Equal");

		}
		else 
			System.out.println("Arrays are not Equal");

	}
		 */
	}
}

