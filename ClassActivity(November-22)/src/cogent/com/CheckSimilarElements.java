package cogent.com;

import java.util.Arrays;

/**
 * @author samuelkawuma
 *Nov 24, 2022
 *7:20:12 PM
 */

public class CheckSimilarElements {


	public static  boolean twoArrEqual(int arr1[], int arr2[]) 
	{ 
		// If lengths of array are not equal means 
		// array are not equal 
		//if (arr1.length != arr2.length) 
		//	return false;

		// Sort both arrays 
		Arrays.sort(arr1);
		Arrays. sort(arr2);

		// Linearly compare elements 
		for (int i = 0 ; i < arr1.length;i++) 
			if (arr1[i] != arr2[i]) 
				return false;

		// If all elements were same. 
		return true;
	}

	public static void main(String[] args) {


		int a[]= {1,2,3,4,5,6,7,};
		int b[] = {2,3,5,7};	


		boolean appearsEle= twoArrEqual(a,b );
		System.out.println(appearsEle);

	}
}

