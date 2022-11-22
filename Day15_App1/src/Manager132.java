import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author samuelkawuma
 *Oct 7, 2022
 *11:29:14 AM
 */

public class Manager132 { 
	public static void main(String[] args) {
		
		
		
		List<Integer> list = new ArrayList<>();
		
		
		for(int i=0;i<=10;i++) {
			
			list.add(i);
		}
		Stream <Integer>stream3 = list.stream();
		List<Integer>evenNumber = stream3.filter(i->i%2==0).collect(Collectors.toList());
		
		System.out.println(evenNumber);
		
		System.out.println();
		
		
	}
}

