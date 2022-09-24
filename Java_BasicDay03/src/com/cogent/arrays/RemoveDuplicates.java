package com.cogent.arrays;

import java.util.Arrays;

/**
 * @author samuelkawuma
 *Sep 22, 2022
 */

public class RemoveDuplicates {
	static void sortArray(int arr[])
	{
		int temp=0;
		for(int i = 0; i< arr.length; i++) {
			for(int j =i+1; j< arr.length; j++)
				if(arr[j] < arr[i]) {
					temp =arr[i];
					arr[i]= arr[j];
					arr[j] =temp;
					
		}
		}
	}
	
	static int removeDuplicates(int arr[], int n)
	
    {
		//call function to sort Array 
		 sortArray(arr);
        // Return, if array is empty or contains a single element
        if (n == 0 || n == 1)
            return n;
        // Creating a new Array 
        int[] temp = new int[n];
 
        // Start traversing elements
        int j = 0;
        for (int i = 0; i < n - 1; i++)
            // If current element is not equal to next
            // store that element into  current element
            if (arr[i] != arr[i + 1])
                temp[j++] = arr[i];
 
        // Store the last element as whether it is unique or repeated
      
        temp[j++] = arr[n - 1];
 
        //Modify original array
        for (int i = 0; i < j; i++)
            arr[i] = temp[i];
 
        return j;
    }
 
	public static void main(String[] args) {
		
		int  array[] = { 5,5,4,3,5,8,0,7,0,3,11,89};
		int n = array.length;

		n =removeDuplicates(array,n);
		   for (int i=0; i<n; i++)
	           System.out.print(array[i]+" ");
		
			
}
}
