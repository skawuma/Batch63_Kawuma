import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author samuelkawuma
 *Oct 7, 2022
 *11:00:20 AM
 */

public class Manager130 {
	
	public static void main(String[] args) {
		
		
		Stream<Integer> stream = Stream.of(34,34,34,45,47,64,45,56);
		stream.forEach(p->System.out.println(p));
		
		
		Integer [] arr = new Integer [] {1,2,3,4,5,6,7,8,9,10};
		Stream<Integer> stream1= Stream.of(arr);
		stream1.forEach(p->System.out.println(p));
		
		
		
		
		
		List<Integer> list = new ArrayList();
		for(int i=0; i<=10; i++) {
		list.add(i*10);
		}
		
		
		Stream<Integer> stream3 = list.stream();
		stream3.forEach(p->System.out.println(p));
	}

}

