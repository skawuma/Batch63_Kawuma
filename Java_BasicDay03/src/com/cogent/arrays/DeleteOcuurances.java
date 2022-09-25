package com.cogent.arrays;

import java.util.Arrays;

/**
 * @author samuelkawuma
 *Sep 25, 2022
 *5:22:59 PM
 */

public class DeleteOcuurances {

	static int[] deleteElement( int a[], int x)
	{ 
		int c=0;

		for(int i= 0; i<a.length; i++) {
			if (a[i]!=x) 
				a[c++]= a[i];
		}
		return Arrays.copyOf(a, c); 	
	}
	
	public static void main(String[] args) {
		int a[]=  {1,3,2,2,2,3,66,4,5,0,0,66,0,6};
		a = DeleteOcuurances.deleteElement(a,0);
		System.out.println("the Array after Element has been deleted is  " + Arrays.toString(a));

	}

}

