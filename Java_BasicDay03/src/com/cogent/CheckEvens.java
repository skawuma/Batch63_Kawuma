package com.cogent;


/**
 * @author samuelkawuma
 *
 */

public class CheckEvens {
	public void checkEven(int n) {

		if (n%2==0 ) {

			System.out.println(n + " is Even");
		}
		else {
			System.out.println(n + " is Odd");
		}
	}

		public static void main(String[] args) {

			CheckEvens n = new CheckEvens();

			n.checkEven(37);

		}


}

