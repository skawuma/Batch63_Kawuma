
/**
 * @author samuelkawuma
 *Nov 21, 2022
 *10:25:01 PM
 */
import java.util.Scanner;


public class CheckEvenOdd {

	
	   public static void main(String[] args) {

	        Scanner sc= new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        String evenOddNum = (num % 2 == 0) ? "even" : "odd";

	        System.out.println(num + " is " + evenOddNum );

	    }
}

