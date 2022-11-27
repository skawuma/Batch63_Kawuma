package cogent.com;

/**
 * @author samuelkawuma
 *Nov 23, 2022
 *6:05:55 PM
 */

public class SwapElements {
	
	
	static void swapValuesWithoutUsingThirdVariable(int m,
            int n)
{


// Difference of 2nd from 1st
// is stored in first variable
m = m - n;

// Sum is stored in second variable
n = m + n;

// Difference of 1st from 2nd
// is replaced in first variable
m = n - m;

// Print numbers
System.out.println("Value of m is " + m
+ " and Value of n is " + n);
}

//  Main driver method
public static void main(String[] args)
{
// Random numbers of integer type
int m = 9, n = 5;


swapValuesWithoutUsingThirdVariable(m, n);
}

}

