package com.cogent.service;

import java.util.List;

import com.cogent.bean.EmployeeBean;

/**
 * @author samuelkawuma
 *Sep 29, 2022
 *6:19:15 AM
 */

public interface EmployeeService {
	
	public void addEmployee(EmployeeBean  employeebean);
	public void viewAllEmployees();
	public EmployeeBean findEmployeeById(long employeeId);
    public void  deleteById(long employeeId);
   // public boolean employeeIsMarried();
    public EmployeeBean findYoungestEmployee();
    public List<EmployeeBean>displayEmployeeFromCountry(String employeeCountry);
    public List<EmployeeBean>displayEmployeeCountryAndCity(String employeeCountry,String employeeCity);
}

 
