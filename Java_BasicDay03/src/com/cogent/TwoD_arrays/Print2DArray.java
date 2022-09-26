package com.cogent.TwoD_arrays;

/**
 * @author samuelkawuma
 *Sep 25, 2022
 *10:31:19 PM
 */

public class Print2DArray {
	public static void main(String[] args) {

		int arr[][]= {{2,5,6},{3,7,9}};
        
    	//int arr[][] = new int[m][n];

    	for(int i = 0; i < arr.length; i++)
    	{
    		for(int j = 0; j < arr[i].length; j++)
    		{
    		    
   
    			System.out.print(arr[i][j] + "# ");
    		}
    		
    		System.out.println("   ");
    	}

}
	}