
/**
 * @author samuelkawuma
 *Nov 21, 2022
 *6:35:41 PM
 */

public class SwapNumbers {
	
	
	public  static void  swap(int x, int y) {
		
		int temp =0;
	    
		
		temp= x;
		x=y;
		y= temp;
	   System.out.println("The new value of x and y are " + x + " and " + y);    
		
	}
	public static void main(String[] args) {
		
		int x= 10,y=13;
		swap(x,y);
		
		
	}
	
	

}

