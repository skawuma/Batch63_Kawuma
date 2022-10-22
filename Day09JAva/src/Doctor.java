
/**
 * @author samuelkawuma
 *Sep 29, 2022
 *11:35:23 AM
 */

public class Doctor {
	
	private int drId;
	private String drName;
	private double drSalary;
	private String drSpec;
	/**
	 * @param drId
	 * @param drName
	 * @param drSalary
	 * @param drSpec
	 */
	public Doctor(int drId, String drName, double drSalary, String drSpec) {
		super();
		this.drId = drId;
		this.drName = drName;
		this.drSalary = drSalary;
		this.drSpec = drSpec;
	}
	@Override
	public boolean equals(Object obj) {
		
		
		
		if (obj instanceof A060) {
			Doctor a = (Doctor)obj;
			if ((drId==a.drId)&&(drName== drName) &&( (drSalary==a.drSalary)&&(drSpec== drSpec))) {
				
				return true;
			}
			else {
				return false;
			}
			}
			else {
				return false;
			}
		// TODO Auto-generated method stub
	//	return super.equals(obj);
	}
	public static void main(String[] args) {
		Doctor a1 = new Doctor(10,"Sarah",2000.0, "Ortho");
		Doctor a2 = new Doctor(10,"Sarah",2000.0, "Ortho");
		System.out.println(a1==a2);
		System.out.println(a1.equals(a2));
	
		
	}

}

