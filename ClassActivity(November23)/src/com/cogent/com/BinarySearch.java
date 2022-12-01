package com.cogent.com;

/**
 * @author samuelkawuma
 *Dec 1, 2022
 *12:56:28 AM
 */

public class BinarySearch {
	static int bSearch(int arr[], int low, int high, int x)
	{
		if(low > high)

			return -1;

		int mid = (low + high) / 2;

		if(arr[mid] == x)
			return mid;

		else if(arr[mid] > x)
			return bSearch(arr, low, mid - 1, x);

		else
			return bSearch(arr, mid + 1, high, x);
	}

	public static void main(String args[]) 
	{
		int arr[] = {10, 20, 30, 40, 50, 60, 70}, n = 7;

		int x = 50;
		if(bSearch(arr,0,n-1,x) ==-1) {
			System.out.println("Number not present, TRY NUMBER WITH IN THE GIVEN ARRAY");

		}

		System.out.println( " Target Number found at index " + bSearch(arr, 0, n - 1, x));
	} 


}

