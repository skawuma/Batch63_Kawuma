package com.cogent.com;

import java.math.BigInteger;
import java.util.Random;

/**
 * @author samuelkawuma
 *Dec 1, 2022
 *12:48:33 AM
 */

public class RandomImpl {
	
	public int random01Generator() {
		  
        Random rand = new Random();
        return rand.nextInt(2); 
    }

    
    public void random06Generator(){
  
        Random rand = new Random();
        int val = 10;
        while (val >= 10) {
  
            String res = "";
            for (int i = 0; i < 3; i++) 
                res += 
                 String.valueOf(random01Generator());            
  
            BigInteger bg = new BigInteger(res,2);
                         
            val = bg.intValue();
        }
          
        System.out.println(val);
    }
      
    // Driver Code
    public static void main(String[] args){
        RandomImpl r = new RandomImpl();
        r.random06Generator();
    }

}

