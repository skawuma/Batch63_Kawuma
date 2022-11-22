import java.util.ArrayList;
import java.util.List;

/**
 * @author samuelkawuma
 *Oct 7, 2022
 *11:53:21 AM
 */

public class Manager133 {
	public static void main(String[] args) {
		
		List<String> s = new ArrayList<>();
		s.add("Jan");
		s.add("Feb");
		s.add("Mar");
		s.add("Apr");
		s.add("May");
		s.add("Jun");
		s.add("Jul");
		s.add("Aug");
		s.add("Sep");
		s.add("Oct");
		s.add("Nov");
		s.add("Dec");
		
		s.stream().filter(t->t.startsWith("A")).forEach(System.out::println);
		
		System.out.println("******************************************************");
		s.stream().filter(t->t.startsWith("A")).map(String:: toUpperCase).forEach(System.out::println);
		System.out.println("******************************************************");
		s.stream().sorted().map(String:: toUpperCase).forEach(System.out::println);
	}

}

