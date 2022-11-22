
/**
 * @author samuelkawuma
 *Nov 22, 2022
 *7:38:04 AM
 */

public class LargestAndSmallest {

	
	static int largest(int []arr) 
	{ 
		int i; 
		
		int max = arr[0]; 
		
		
		for (i = 1; i < arr.length; i++) 
			if (arr[i] > max) 
				max = arr[i]; 
		
		return max; 
	} 
	static int smallest(int []arr) 
	{ 
		int i; 
		
		int min = arr[0]; 
		
		
		for (i = 1; i < arr.length; i++) 
			if (arr[i]< min) 
				min = arr[i]; 
		
		return min; 
	} 
	public static void main(String[] args) {
		
		int arr[] = {10, 324, 45, 90, 9808}; 
		System.out.println("Largest in given array is " + largest(arr));
		
		System.out.println("Smallest in given array is " + smallest(arr));
		
		
	}
	
	
}

