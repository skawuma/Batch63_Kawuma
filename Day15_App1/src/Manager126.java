import java.util.function.Predicate;

/**
 * @author samuelkawuma
 *Oct 7, 2022
 *9:57:09 AM
 */

public class Manager126 {
	public static void main(String[] args) {
		
		
		Predicate<String> checkLength = str->str.length()>5;
		System.out.println(checkLength.test("Welcome"));
	}

}

