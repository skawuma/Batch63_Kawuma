package com.cogent.bean;

/**
 * @author samuelkawuma
 *Sep 29, 2022
 *5:44:31 AM
 */

public class EmployeeBean {
private long employeeId;
private String employeeFname;
private String employeeLname;
private String employeeFEmail;
private String employeeCity;
private String employeeCountry;
private boolean employeeIsMarried;
private int  employeeAge;
/**
 * @param employeeId
 * @param employeeFname
 * @param employeeLname
 * @param employeeFEmail
 * @param employeeCity
 * @param employeeCountry
 * @param employeeIsMarried
 * @param employeeAge
 */
public EmployeeBean(long employeeId, String employeeFname, String employeeLname, String employeeFEmail,
		String employeeCity, String employeeCountry, boolean employeeIsMarried, int employeeAge) {
	super();
	this.employeeId = employeeId;
	this.employeeFname = employeeFname;
	this.employeeLname = employeeLname;
	this.employeeFEmail = employeeFEmail;
	this.employeeCity = employeeCity;
	this.employeeCountry = employeeCountry;
	this.employeeIsMarried = employeeIsMarried;
	this.employeeAge = employeeAge;
}
/**
 * 
 */
public EmployeeBean() {
	super();
	// TODO Auto-generated constructor stub
}
/**
 * @return the employeeId
 */
public long getEmployeeId() {
	return employeeId;
}
/**
 * @param employeeId the employeeId to set
 */
public void setEmployeeId(long employeeId) {
	this.employeeId = employeeId;
}
/**
 * @return the employeeFname
 */
public String getEmployeeFname() {
	return employeeFname;
}
@Override
public String toString() {
	return "EmployeeBean [employeeId=" + employeeId + ", employeeFname=" + employeeFname + ", employeeLname="
			+ employeeLname + ", employeeFEmail=" + employeeFEmail + ", employeeCity=" + employeeCity
			+ ", employeeCountry=" + employeeCountry + ", employeeIsMarried=" + employeeIsMarried + ", employeeAge="
			+ employeeAge + "]";
}
/**
 * @param employeeFname the employeeFname to set
 */
public void setEmployeeFname(String employeeFname) {
	this.employeeFname = employeeFname;
}
/**
 * @return the employeeLname
 */
public String getEmployeeLname() {
	return employeeLname;
}
/**
 * @param employeeLname the employeeLname to set
 */
public void setEmployeeLname(String employeeLname) {
	this.employeeLname = employeeLname;
}
/**
 * @return the employeeFEmail
 */
public 	String getEmployeeFEmail() {
	return employeeFEmail;
}
/**
 * @param employeeFEmail the employeeFEmail to set
 */
public void setEmployeeFEmail(String employeeFEmail) {
	this.employeeFEmail = employeeFEmail;
}
/**
 * @return the employeeCity
 */
public String getEmployeeCity() {
	return employeeCity;
}
/**
 * @param employeeCity the employeeCity to set
 */
public void setEmployeeCity(String employeeCity) {
	this.employeeCity = employeeCity;
}
/**
 * @return the employeeCountry
 */
public String getEmployeeCountry() {
	return employeeCountry;
}
/**
 * @param employeeCountry the employeeCountry to set
 */
public void setEmployeeCountry(String employeeCountry) {
	this.employeeCountry = employeeCountry;
}
/**
 * @return the employeeIsMarried
 */
public boolean isEmployeeIsMarried() {
	return employeeIsMarried;
}
/**
 * @param employeeIsMarried the employeeIsMarried to set
 */
public void setEmployeeIsMarried(boolean employeeIsMarried) {
	this.employeeIsMarried = employeeIsMarried;
}
/**
 * @return the employeeAge
 */
public int getEmployeeAge() {
	return employeeAge;
}
/**
 * @param employeeAge the employeeAge to set
 */
public void setEmployeeAge(int employeeAge) {
	this.employeeAge = employeeAge;
}

public String display() {
	return " [" + employeeId + ", " + employeeFname + ", "
			+ employeeLname + ", " + employeeFEmail + ", " + employeeCity
			+ ", " + employeeCountry + ", " + employeeIsMarried + ", "
			+ employeeAge + "]";
}




}

