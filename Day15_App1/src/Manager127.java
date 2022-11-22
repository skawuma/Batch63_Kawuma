import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author samuelkawuma
 *Oct 7, 2022
 *10:08:02 AM
 */

public class Manager127 {
public static void main(String[] args) {
	
	
	Supplier<Double> rvalue = ()->Math.random();
	System.out.println(rvalue.get());
}
}

