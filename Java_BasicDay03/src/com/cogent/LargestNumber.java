package com.cogent;

/**
 * @author samuelkawuma
 *
 */

public class LargestNumber {

	public void  largeNum(int x , int y) {
		if (x>y) 
			
			System.out.println( x + " is the largest Number ");
		
		else

			System.out.println( y + " is the largest Number ");	
		
	}
	public static void main(String[] args) {

		LargestNumber n = new LargestNumber();

		n.largeNum(3,7);

	}

	
}

