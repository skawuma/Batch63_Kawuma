package com.cogent.com;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author samuelkawuma
 *Nov 29, 2022
 *9:21:44 PM
 */

public class Palindrome {
	
	 public static void main(String[] args){
	        while (true) {
	            try {
	                System.out.println("Please  Enter A Desired Word");
	            Scanner s = new Scanner(System.in);
	            String a = s.nextLine();
	           
	            int start = 0;
	            int end = a.length() - 1;
	            // Ignores uppercase
	                a = a.toUpperCase();
	            boolean isPal = true;
	            while (start < end) {
	                if (a.charAt(start) != a.charAt(end)) {
	                    isPal = false;
	                    break;
	                }
	                start++;
	                end--;
	            }
	            if (isPal) {
	                System.out.println("Yes,"+ a + " Is a Palindrome ");
	            } else {
	                System.out.println("No,"+ a + " Is not a Palindrome ");
	            }
	        }
	            catch (InputMismatchException e){
	                System.out.println("Oops that was an invalid input!!! TRY AGAIN");
	            }
	        }

	    }
	}



