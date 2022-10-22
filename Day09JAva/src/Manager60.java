
/**
 * @author samuelkawuma
 *Sep 29, 2022
 *11:18:40 AM
 */
class A060{
	private int i;
	private int j;
	/**
	 * @param i
	 * @param j
	 */
	public A060(int i, int j) {
		super();
		this.i = i;
		this.j = j;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof A060) {
		A060 a = (A060)obj;
		if ((i==a.i)&&(j== a.j)) {
			
			return true;
		}
		else {
			return false;
		}
		}
		else {
			return false;
		}
	}
}
	

public class Manager60 {

	
	public static void main(String[] args) {
		
		A060 a1 = new A060(10,20);
		A060 a2 = new A060(10,20);
		System.out.println(a1==a2);
		System.out.println(a1.equals(a2));
	}
}

