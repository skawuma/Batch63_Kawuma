
/**
 * @author samuelkawuma
 *Nov 21, 2022
 *10:04:57 PM
 */

public class SwapNumbers2 {
	
	
	public static void  swap (int x,  int y) {
		
		x=  x-y;
		y=x+y;
		x=y-x;
		System.out.println("The new value of x and y are " + x + " and " + y); 
		
		
	}
	
public static void main(String[] args) {
		
		int x= 10,y=13;
		swap(x,y);

}

}