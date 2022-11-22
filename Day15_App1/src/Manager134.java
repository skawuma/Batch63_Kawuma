import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author samuelkawuma
 *Oct 7, 2022
 *2:42:50 PM
 */

public class Manager134 {
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
		
		
	Optional<String> reduced = s.stream().reduce((s1,s2)->s1+"@"+s2);
	reduced.ifPresent(System.out::println);
	System.out.println("********************************************************");
	String firstElement = s.stream().filter(t->t.startsWith("A")).findFirst().get();
	System.out.println(firstElement); 
	System.out.println("********************************************************");
	firstElement = s.parallelStream().filter(t->t.startsWith("A")).findFirst().get();
	System.out.println(firstElement);
}
}

