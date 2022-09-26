package com.cogent.arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author samuelkawuma
 *Sep 25, 2022
 *8:00:18 PM
 */

public class CommonElements {


	static void commonEle(int a[],int b[]) {

		for(int i =0; i<a.length; i++) 
			for (int j =0; j<b.length;j++) {
				if (a[i]==b[j])		
				{
					System.out.print("The common elements between the two Arrays are: " + a[i] + " ");
				}
				else 
					continue;
			}		
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
				//function to check whether both arrays have similar elements and returns them in an array
				CommonElements.commonEle(a,b);
				System.out.print("\n Do you want to continue (y or n)?");
				Scanner keyboard = new Scanner(System.in);
				answer = keyboard.next().charAt(0);

			}catch (InputMismatchException e) {

				System.out.println("Oops that was an invalid input!!! TRY AGAIN");

			}
		}



		/**
	int x[]=  {0,2,3,8,5};
	int y[]=  {1,2,3,4,5};
	CommonElements.commonEle(x,y);

		 */

	}
}

