package com.cogent.arrays;

import java.util.Arrays;

/**
 * @author samuelkawuma
 *Sep 25, 2022
 *9:01:30 PM
 */

public class RotateArray {
	static  void rotate(int a[]) {
		
		int temp= a[0];
		for(int i=1; i<a.length; i++) {
			a[i-1]=a[i];
		}
			a[a.length-1] =temp;
			
	}
	public static void main(String[] args) {
		int x[] = {2,3,4,5};
		
		RotateArray.rotate(x);
		System.out.println( Arrays.toString(x));
			
		
	}

}

