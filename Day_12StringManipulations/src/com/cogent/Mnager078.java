package com.cogent;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * @author samuelkawuma
 *Oct 4, 2022
 *11:14:39 AM
 */

public class Mnager078 {
	
	
	public static void main(String[] args) {
        while (true) {
            try {
            	//Mnager078 n1[] = new Mnager078();
                Scanner s = new Scanner(System.in);
          
                System.out.println("Please enter Any Given String");
                String a = s.nextLine();
                String s2[] =a.split(" ");
                String b = "";
                for (int i = s2.length - 1; i >= 0; i--) { 
                    b += s2[i] + " "; 
                  } 
                System.out.println(b);

            } catch (InputMismatchException e) {
                System.out.println("Oops that was an invalid input!!! TRY AGAIN");
            }
        }
    }
}

