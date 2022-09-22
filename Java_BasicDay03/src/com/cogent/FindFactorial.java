package com.cogent;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.HashMap;
/**
 * @author samuelkawuma
 *
 */

public class FindFactorial {

	
	public Long factorial(long n) throws IllegalArgumentException {

		if(n<0)
			throw new IllegalArgumentException();

		else if(n==0)
			return Long.valueOf(1);
		long result = n* factorial(n-1);
		return result;
	}

	public static void  main(String[] args){
		while (true){
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Please enter a none negative integer");
				long d = sc.nextInt();
				FindFactorial  f = new FindFactorial ();

				System.out.println("The Factorial of " + d +" "+  "is" +" "+ f.factorial(d));
			}
			catch (InputMismatchException e){

				System.out.println("Oops that was an invalid input!!! TRY AGAIN");





			}
		}
	}

}

