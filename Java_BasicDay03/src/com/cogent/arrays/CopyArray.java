package com.cogent.arrays;

import java.util.Arrays;

/**
 * @author samuelkawuma
 *Sep 25, 2022
 *8:43:04 PM
 */

public class CopyArray {
	static int[] copied(int a[]) {
		
		int b[] = new int [a.length];
		for(int i =0,k=0; i<a.length;i++) {
			b[k++]=a[i];
		}
		return b;
	}
public static void main(String[] args) {
	
	int x[] = {2,3,4,5};
	
	//int r []= CopyArray.copied(x);
	
	System.out.println(Arrays.toString(x));
	
}
}

