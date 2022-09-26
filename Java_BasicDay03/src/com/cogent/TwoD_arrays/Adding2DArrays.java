package com.cogent.TwoD_arrays;

/**
 * @author samuelkawuma
 *Sep 25, 2022
 *11:29:10 PM
 */

public class Adding2DArrays {
	
	
	public static void main(String[] args) {

		int x[][]= {{2,5,6},{3,7,9}};
		int y[][]= {{2,5,6},{3,7,9}};
    	//Creating new two diimentional array
		int z [][]= new int [2][3];

    	for(int i = 0; i < 2; i++)
    	{
    		for(int j = 0; j < 3; j++)
    		{
    			//Storing sum into z
    		    z[i][j]= x[i][j]+y[i][j];
   
    			System.out.print(z[i][j] + "  " );
    		}
    		
    		System.out.println("   ");
    	}

}

}

