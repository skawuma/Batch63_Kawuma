
/**
 * @author samuelkawuma
 *Nov 21, 2022
 *6:20:33 PM
 */

public class findLargest {

	public static int findLargest(int x , int y){

		int max=0;
		if (x==y)
			return-1;
		if( x>y )
			return x;

		else {
			return y;
		}





	}

	public static void main(String[] args) {

		int z =13;
		int y =15;

		int p=	findLargest(z,y);

		System.out.println(p);

	}



}

