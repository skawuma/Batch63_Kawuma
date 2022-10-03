package com.cogent.bean;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.cogent.service.EmployeeService;
import com.cogent.service.EmployeeServiceImpl;

/**
 * @author samuelkawuma
 *Sep 29, 2022
 *11:39:31 PM
 */

public class EmployeeLibrary {

	public static void main(String[] args) {
		EmployeeService employeeService =  new EmployeeServiceImpl();

		char answer = 'Y';
		Scanner keyboard = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
		int choice =0;

		System.out.println("*****************************");

		System.out.println("MENU");

		System.out.println("*****************************");

		System.out.println("1 . ADD NEW EMPLOYEE");
		System.out.println("2 . VIEW ALL EMPLOYEES");
		System.out.println("3 . FIND EMPLOYYE BY ID");
		System.out.println("4 . FIND YOUNGEST EMPLOYEE");
		System.out.println("5 . DISPLAY EMPLOYEE BY COUNTRY");
		System.out.println("6 . DISPLAY ALL EMPLOYEES BY COUNTRY AND SAME CITY");
		System.out.println("7.  DELETE EMPLOYEE  BY ID");
		System.out.println("8 . EXIT");


		EmployeeBean employeeBean = null;
		int  option;
		boolean continuethisloop = true;

		while(continuethisloop) {
		try {
				System.out.println("PLEASE  REFER to  MENU AND  SELECT ONE OF THE OPTIONS  ");
				option = scanner.nextInt();	
				switch (option) {
				case 1:
					answer = 'y';
					while (Character.toUpperCase(answer) == 'Y')

					{
						employeeBean = new EmployeeBean();

						System.out.println("Enter Employee Id");
						employeeBean.setEmployeeId(scanner.nextLong());
						System.out.println("Enter Employee FirstName");
						employeeBean.setEmployeeFname((scanner.next()));
						System.out.println("Enter Employee LastName");
						employeeBean.setEmployeeLname((scanner.next()));
						System.out.println("Enter Employee  Email");
						employeeBean.setEmployeeFEmail(scanner.next());
						System.out.println("Enter Employee City");
						employeeBean.setEmployeeCity((scanner.next()));
						System.out.println("Enter Employee Country");
						employeeBean.setEmployeeCountry((scanner.next()));
						System.out.println("Enter Employee whether the Employees is Married, False for no And True for Yes");
						employeeBean.setEmployeeIsMarried((scanner.nextBoolean()));
						System.out.println("EnterEmployee Age");
						employeeBean.setEmployeeAge(scanner.nextInt());
						employeeService.addEmployee(employeeBean);
						System.out.print("\n Do you want to Add more Employees(y or n)?");
						answer = keyboard.next().charAt(0);

						if(answer=='Y');


					}
					break;
				case 2:

					employeeService.viewAllEmployees();

					System.out.print("\nPress Any Key to Return Back to the Menu?");

					answer = keyboard.next().charAt(0);

					if (answer == 'y');


					break;
				case 3:
					answer = 'y';
					while (Character.toUpperCase(answer) == 'Y') 
					{

						//Search Book
						System.out.println("Please enter the Employee you want to search By Id");
						EmployeeBean employee = employeeService.findEmployeeById(scanner.nextInt());
						if (employee != null) {
							System.out.println( employee.display());

						} else {
							System.out.println("Employee not found!");
						}
						System.out.print("\n Do you want to Search More EmployeeIDs (y or n)?");


						answer = keyboard.next().charAt(0);

						if (answer == 'Y');

					}
					break;
				case 4:

					employeeService.findYoungestEmployee();

					System.out.print("\nPress Any Key to Return Back to the Menu?");

					answer = keyboard.next().charAt(0);

					if (answer == 'y');


					break;

				case 5:
					answer = 'y';
					while (Character.toUpperCase(answer) == 'Y') 
					{

						//Search Book
						System.out.println("Please enter the Country you want to Display Employees");
						List<EmployeeBean> newList = new ArrayList<>();
						List<EmployeeBean> employee = employeeService.displayEmployeeFromCountry(scanner.next());

						System.out.print("\n Do you want to Search More Countrys (y or n)?");


						answer = keyboard.next().charAt(0);

						if (answer == 'Y');

					}
					break;
				case 6:
					answer = 'y';
					while (Character.toUpperCase(answer) == 'Y') 
					{

						//Search Employee
						System.out.println("Please enter A Country");
						String n1 = scanner.next();

						System.out.println("Please enter A City");

						String n2 = scanner.next();

						List<EmployeeBean> employee = employeeService.displayEmployeeCountryAndCity(n1,n2);

						System.out.print("\n Do you want to Search More Employees In Different Countries and City (y or n)?");
						answer = keyboard.next().charAt(0);

						if (answer == 'Y');

					}
					break;
				case 7:
					answer = 'y';
					while (Character.toUpperCase(answer) == 'Y') 
					{

						System.out.println("Please enter EmployeeID you to want to Delete ");
						Long n2 = scanner.nextLong();
						if (n2!= null) { 
							employeeService.deleteById(n2);

							System.out.println("Book Successfully Deleted!");
						}

						System.out.print("\n Do you want to Delete More Books by Ids (y or n)?");


						answer = keyboard.next().charAt(0);

						if (answer == 'Y');

					}
					break;

				case 8:
					System.out.println("PROGRAM EXITED!!");
					System.exit(0);	
				}
			}catch(InputMismatchException e) {

				System.out.println("Oops that was an invalid input!!! TRY AGAIN");
				///
				scanner.nextLine();
			}
		
		}

	}
}
