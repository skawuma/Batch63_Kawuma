import java.util.function.Function;

/**
 * @author samuelkawuma
 *Oct 7, 2022
 *9:17:45 AM
 */

public class Manager125 {
	public static void main(String[] args) {
	
		//FunctionalInterface<Integer,String> r = new 
		
		
		
	Function<Integer,String>	result = t->t*10 + "Display Data of 10"; 
		System.out.println(result.apply(5));
	}

}

