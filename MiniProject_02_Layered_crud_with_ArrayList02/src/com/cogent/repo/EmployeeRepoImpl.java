package com.cogent.repo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;

import com.cogent.bean.EmployeeBean;

/**
 * @author samuelkawuma
 *Sep 29, 2022
 *7:11:31 AM
 */

public class EmployeeRepoImpl implements EmployeeRepo {
	List<EmployeeBean> employees = new ArrayList<>();
	{
		employees.add( new EmployeeBean(1111,"John","Kirk","jkirk@gmail.com","SanFransisco","USA",true,55));
		employees.add( new EmployeeBean(2222,"Sarah","Dior","sdior@gmail.com","SanFransisco","USA",false,28));
		employees.add( new EmployeeBean(3333,"Mary","Dows","DowMary@gyahoo.com.com","Frankfurt","Germany",true,43));
		employees.add( new EmployeeBean(4444,"Dave","Sawyer","sawyer46@gmail.com","Dubai","UAE",false,31));
		employees.add( new EmployeeBean(5555,"Annet","Dixy","Adixy@msn.com","Portland","UAE",true,72));
		employees.add( new EmployeeBean(6666,"Chanel","Mathews","chanel@hotmail.com","Boston","USA",true,39));
		employees.add( new EmployeeBean(7777,"Manny","Carter","jkirk@gmail.com","SCaiiro","Egypt",false,44));

	}

	EmployeeBean employee = null;
	@Override
	public void addEmployee(EmployeeBean employeebean) {
		employees.add(employeebean);
		// TODO Auto-generated method stub
	}
	@Override
	public void viewAllEmployees() {
		System.out.println("Employees Cureently in List");
		// TODO Auto-generated method stub
		//Traverse  the array and call display method on each index in the loop
		for(int i = 0; i< employees.size();i++) {
			System.out.println( employees.get(i).display());
		}
	}
	@Override
	public EmployeeBean findEmployeeById(long employeeId) {
		// TODO Auto-generated method stub
		//EmployeeBean employee = null;
		for(int i = 0; i< employees.size();i++) {
		//store index in temporary value employee
			employee = employees.get(i);
			//check to see if a given index have the value of employeeiD
			if(employee.getEmployeeId()== employeeId) {
				//Cast the index to EmployeeBeantype and then call the display method on it
				((EmployeeBean) employee).display();
				return employee;
			}
			//to avoid printing back the employee, After printing the employee.. assign employee to null
			employee= null;
		}
		//returns null Value
		return employee;
	}
	//@SuppressWarnings("unlikely-arg-type")
	@Override
	public void deleteById(long employeeId) {
		//EmployeeBean employee = null;
		for(int i=0; i<employees.size();i++) {
			employee =employees.get(i);
			if(employee.getEmployeeId()== employeeId) 
				employees.remove(i);		
		}
	}

	@Override
	public  EmployeeBean findYoungestEmployee() {
		// TODO Auto-generated method stub
		//EmployeeBean employee = null;
		int index =0;
		int min =150;
		for (int i = 0; i < employees.size(); i++) 
			employee =employees.get(i);

		if (employee.getEmployeeAge()< min   ) {
			min = employee.getEmployeeAge() ;
			// Updates the current value of minimum age and the continues to compare to next element
			index++;
			// assign back employee to the current index that carries the minimum age
			employee= employees.get(index);
			//Assign minimum age to variable min.
			min= employee.getEmployeeAge();
			System.out.println(min);
			System.out.println( "The Youngest Employee is;"+((EmployeeBean) employee).display());
		}
		employee= null;

		return employee;
	}

	@Override
	public List<EmployeeBean> displayEmployeeFromCountry(String employeeCountry) {
		// TODO Auto-generated method stub
		//int index =0;
    	List<EmployeeBean> newList = new ArrayList<>();
		for(int i =0; i< employees.size();i++) {
			employee = employees.get(i);
		      if (employee  == null) 
				System.out.println("Employees  not found with that Country and Matching City!");
				else if
			((employee.getEmployeeCountry().contains(employeeCountry)) ) 
				newList.add(employee);
		}	
		for (int j=0;j<newList.size();j++) {
			System.out.println(newList.get(j));}

		return newList;		
	}	
	@Override
	public List<EmployeeBean> displayEmployeeCountryAndCity(String employeeCountry, String employeeCity) {
		// TODO Auto-generated method stub
		List<EmployeeBean> newList = new ArrayList<>();
		for(int i =0; i< employees.size();i++) {
			employee = employees.get(i);

			if((employee.getEmployeeCountry().contains(employeeCountry))&&(employee.getEmployeeCity().contains(employeeCity)) ) 
				newList.add(employee);
		}
		for (int j=0;j<newList.size();j++) {

			System.out.println(newList.get(j));}

		return newList;	

	}
}

