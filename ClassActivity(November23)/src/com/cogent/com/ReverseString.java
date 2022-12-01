package com.cogent.com;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author samuelkawuma
 *Nov 29, 2022
 *7:30:47 PM
 */

public class ReverseString {

	public static void main (String[] args) {
	
	        while (true) {
	            try {
	                Scanner s = new Scanner(System.in);
	                System.out.println("Please enter Any Given String");
	                String a = s.nextLine();
	                String b = "";
	                int ptr = a.length() - 1;
	                while (ptr >= 0) {
	                    b = b + a.charAt(ptr);
	                    ptr--;
	                }
	                System.out.println(b);

	            } catch (InputMismatchException e) {
	                System.out.println("Oops that was an invalid input!!! TRY AGAIN");
	            }
	        }
	    }

}


