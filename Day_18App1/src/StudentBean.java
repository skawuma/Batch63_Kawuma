import java.io.Serializable;

/**
 * @author samuelkawuma
 *Oct 12, 2022
 *4:19:06 PM
 */



public class StudentBean  implements Serializable {
	
	private static final long serialVersionUID = -226380369717150288L;
	private int stdno;
	private String stdfname;
	private String stdlname;
	private String email;
	@Override
	public String toString() {
		return "StudentBean [stdno=" + stdno + ", stdfname=" + stdfname + ", stdlname=" + stdlname + ", email=" + email
				+ "]";
	}
	/**
	 * @return the stdno
	 */
	public int getStdno() {
		return stdno;
	}
	/**
	 * @param stdno the stdno to set
	 */
	public void setStdno(int stdno) {
		this.stdno = stdno;
	}
	/**
	 * @return the stdfname
	 */
	public String getStdfname() {
		return stdfname;
	}
	/**
	 * @param stdfname the stdfname to set
	 */
	public void setStdfname(String stdfname) {
		this.stdfname = stdfname;
	}
	/**
	 * @return the stdlname
	 */
	public String getStdlname() {
		return stdlname;
	}
	/**
	 * @param stdlname the stdlname to set
	 */
	public void setStdlname(String stdlname) {
		this.stdlname = stdlname;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @param stdno
	 * @param stdfname
	 * @param stdlname
	 * @param email
	 */
	public StudentBean(int stdno, String stdfname, String stdlname, String email) {
		super();
		this.stdno = stdno;
		this.stdfname = stdfname;
		this.stdlname = stdlname;
		this.email = email;
	}
	
	/**
	 * 
	 */
	public StudentBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}

