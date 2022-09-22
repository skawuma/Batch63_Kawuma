package com.cogent;

/**
 * @author samuelkawuma
 *
 */

public class PrimeNumberChecker {
	
 static boolean checkPrime(int n) {
	 // Base case 
     if (n <= 1)
         return false;
     if (n==2||n==3) 
    	 return true;

     if  (n %2 == 0||n%3==0)
    	 return false;
     // Check from 5 to n-1
     for (int i = 5; i*i <= n; i=+6)
         if (n % i == 0|| n % (i+2) == 0)
             return false;

     return true;
	  
 }
 public static void main(String args[])
 {
     if (checkPrime(5761))
         System.out.println(" true");
     else
         System.out.println(" false");

}
}

