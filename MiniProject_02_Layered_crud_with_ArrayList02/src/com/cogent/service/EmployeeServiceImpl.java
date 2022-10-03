package com.cogent.service;

import java.util.List;

import com.cogent.bean.EmployeeBean;
import com.cogent.repo.EmployeeRepo;
import com.cogent.repo.EmployeeRepoImpl;

/**
 * @author samuelkawuma
 *Sep 29, 2022
 *9:50:19 AM
 */

public class EmployeeServiceImpl implements EmployeeService {
EmployeeRepo employeeRepo =  new EmployeeRepoImpl();
	@Override
	public void addEmployee(EmployeeBean employeebean) {
		// TODO Auto-generated method stub
     employeeRepo.addEmployee(employeebean);
	}

	@Override
	public void viewAllEmployees() {
		// TODO Auto-generated method stub
		employeeRepo.viewAllEmployees();

	}

	@Override
	public EmployeeBean findEmployeeById(long employeeId) {
		// TODO Auto-generated method stub
		return  employeeRepo.findEmployeeById(employeeId);
	}

	@Override
	public void deleteById(long employeeId) {
		// TODO Auto-generated method stub
employeeRepo.deleteById(employeeId);
	}

	@Override
	public EmployeeBean findYoungestEmployee() {
		// TODO Auto-generated method stub
		
		return  employeeRepo.findYoungestEmployee();
	}

	@Override
	public List<EmployeeBean> displayEmployeeFromCountry(String employeeCountry) {
		// TODO Auto-generated method stub
		return employeeRepo.displayEmployeeFromCountry(employeeCountry);
	}
	/**
	@Override
	public boolean employeeIsMarried() {
		return employeeRepo.employeeIsMarried();
	}
	*/
	@Override
	public List<EmployeeBean> displayEmployeeCountryAndCity(String employeeCountry, String employeeCity) {
		// TODO Auto-generated method stub
		return employeeRepo.displayEmployeeCountryAndCity( employeeCountry,employeeCity);
	}

}

