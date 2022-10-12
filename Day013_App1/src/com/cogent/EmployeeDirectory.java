package com.cogent;

/**
 * @author samuelkawuma
 *Oct 5, 2022
 *5:36:39 PM
 */

public class EmployeeDirectory implements Comparable<EmployeeDirectory> {
	private int empId;
	private double empSal;
	private String empName;
	/**
	 * 
	 */
	public EmployeeDirectory() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "EmployeeDirectory [empId=" + empId + ", empSal=" + empSal + ", empName=" + empName + "]";
	}
	/**
	 * @param empId
	 * @param empSal
	 * @param empName
	 */
	public EmployeeDirectory(int empId, double empSal, String empName) {
		super();
		this.empId = empId;
		this.empSal = empSal;
		this.empName = empName;
	}
	/**
	 * @param anotherString
	 * @return
	 * @see java.lang.String#compareTo(java.lang.String)
	 */

	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	/**
	 * @return the empSal
	 */
	public double getEmpSal() {
		return empSal;
	}
	/**
	 * @param empSal the empSal to set
	 */
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public int compareTo(EmployeeDirectory o) {
		// TODO Auto-generated method stub
		// if current object is greater,then return 1	
	if (this.empId > o.empId) {
		return 1;
	}
	// if current object is greater,then return -1
	else if (this.empId<o.empId) {
		return-1;
	}
	else {
        // if current object is equal to o,then return 0
		return 0;
	}
	}


}

