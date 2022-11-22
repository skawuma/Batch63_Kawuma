import java.util.function.Consumer;

/**
 * @author samuelkawuma
 *Oct 7, 2022
 *10:23:32 AM
 */



class Employee{

	private String name;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
public class Employee001 {
	public static void main(String[] args) {
		Employee e = new Employee();
		Consumer <Employee> name = t->t.setName(" Samuel Kawuma");
		name.accept(e);
		System.out.println(e.getName());
	}

}

