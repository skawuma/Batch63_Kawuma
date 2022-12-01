package com.cogent.com;

/**
 * @author samuelkawuma
 *Nov 28, 2022
 *8:11:00 PM
 */

public class SubStrings {
	
	static void subString(char str[], int n) {
      
        for (int len = 1; len <= n; len++) {
          
            for (int i = 0; i <= n - len; i++) {
               
                int j = i + len - 1;
                for (int k = i; k <= j; k++) {
                    System.out.print(str[k]);
                }
 
                System.out.println();
            }
        }
    }

}

