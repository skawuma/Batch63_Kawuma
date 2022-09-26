package com.cogent.TwoD_arrays;

/**
 * @author samuelkawuma
 *Sep 26, 2022
 *7:20:41 AM
 */

public class Sort2DArray {

	public static void sort(int arr[][]) {
		int i, j,k, temp;
		int n=arr.length;
		int m=arr[0].length;
		for (k = 0; k < m; ++k) {
			for (i = 0; i < n; ++i) {
				for (j = 0; j < n - 1 - i; ++j) {
					if (arr[j][k] > arr[j + 1][k]) {
						temp = arr[j + 1][k];
						arr[j + 1][k] = arr[j][k];
						arr[j][k] = temp;
					}
				}
			}
		}
	}
		static void print(int x[][]) {
			for(int i=0; i<x.length; i++) {
				for(int j=0; j<x[i].length;j++) {
					
				
					System.out.print(x[i][j]+ " ");		}
				System.out.println( );	
			
	}
		}
	public static void main(String[] args) {
	System.out.println("Array Before Sorting is : ");
		int x[][] =  {{2,4,1},{0,9,8}}; 
		Sort2DArray.print(x);
	
			System.out.println("Array After Sorting is : ");
			Sort2DArray.sort(x);
			Sort2DArray.print(x);
					
		//System.out.println("Array After Sorting is : ");
		//Sort2DArray.sort(x);
		
	}
}

