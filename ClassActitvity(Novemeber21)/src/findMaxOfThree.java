
/**
 * @author samuelkawuma
 *Nov 22, 2022
 *6:57:56 AM
 */

public class findMaxOfThree {
	
	public  static int findMax(int a,int b, int c){
		
		if(a>=b && a>=c)
		return a;
		
		else if(b>=a && b>=c)

        return b;
        else
		
		return c;
	

}
	
	public static void main(String[] args) {
		
		
		
		int a = 2;
		int b=7;
		int c=  100;
		
		
		int k  = findMax(a,b,c);
		
		System.out.println(k);
		
	}

}