import java.util.Random;
import java.util.stream.Stream;

/**
 * @author samuelkawuma
 *Oct 7, 2022
 *11:16:46 AM
 */

public class Manager131 {
	public static void main(String[] args) {



		Stream<Integer> rn = Stream.generate(()-> (new Random ()).nextInt(100));

		rn.limit(20).forEach(p->System.out.println(p));

	}

}

