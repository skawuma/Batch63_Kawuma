package com.cogent.repo;

import java.util.List;

import com.cogent.bean.EmployeeBean;

/**
 * @author samuelkawuma
 *Sep 29, 2022
 *5:57:56 AM
 */

public interface EmployeeRepo {
	
	public void addEmployee(EmployeeBean  employeebean);
	public void viewAllEmployees();
	public EmployeeBean findEmployeeById(long employeeId);
    public void deleteById(long employeeId);
    public EmployeeBean findYoungestEmployee();
    //public boolean employeeIsMarried();
    public List<EmployeeBean>displayEmployeeFromCountry(String employeeCountry);
    public List<EmployeeBean>displayEmployeeCountryAndCity(String employeeCountry,String employeeCity);
    
}



