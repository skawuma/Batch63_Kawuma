package com.cogent;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author samuelkawuma
 *
 */

public class ReverseNumber {
public static void main(String[] args) {
		
		while (true) {
			try {
				Scanner s = new Scanner(System.in);
				System.out.println("Please enter Any Given number");
				int sum =0,r;
				int  n = s.nextInt();
				while (!(n==0)) {
					r=n%10;
					sum = sum *10+r;
					n=n/10;
				}
				System.out.println("Reverse Number is :"+ sum);

			} catch (InputMismatchException e) {
				System.out.println("Oops that was an invalid input!!! TRY AGAIN");
			}
		}
	}


}

