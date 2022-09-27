package com.cogent.controller;
import com.cogent.repo.*;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import com.cogent.bean.*;
/**
 * @author samuelkawuma
 *Sep 26, 2022
 *2:43:32 PM
 */

public class CustomerManager {


	public static void main(String[] args) {
		System.out.println("***************************************");
		System.out.println(" CUSTOMER MANAGEMENT SYSTEM");
		System.out.println("***************************************");

		System.out.println("    1. Add Customer ");
		System.out.println("    2. View AllCustomers ");
		System.out.println("    3. Search Customer By Id ");
		System.out.println("    4. Exit");

		CustomerRepo customers = new CustomerRepo();
		Scanner s = new Scanner(System.in);
		System.out.println("Please Select one of the Options ");
		int  option = s.nextInt();
		// option  = 1;
		switch (option) {
		case 1:
			char answer = 'y';
			while (Character.toUpperCase(answer) == 'Y') 

			{
				System.out.println("Please enter CustomerID ");
				Long  n1 = s.nextLong();
				System.out.println("Please enter A Customer Name");
				String n2 = s.next();
				CustomerBean k = new CustomerBean(n1,n2);
				customers.addCustomer(k);

				System.out.print("\n Do you want to Add more Customers (y or n)?");
				Scanner keyboard = new Scanner(System.in);
				answer = keyboard.next().charAt(0);		
				//customers.Viewcustomers();
			}
			break;
		case 2:
			customers.Viewcustomers();
			break;
		case 3:
			System.out.println("Please enter CustomerID Yo want to search ");
			long n3 = s.nextLong();
			
	    // customers.SearchCustomerbyId(n);
			//break;
		case 4:
			System.exit(0);
			break;
		}
		/**

	{
	CustomerRepo customers = new CustomerRepo();
	//CustomerBean a = new CustomerBean(001, "James");
	//CustomerBean b = new CustomerBean(002, "Stella");	
	//customers.addCustomer(b);
	//customers.addCustomer(a);

	// customers.Viewcustomers();
//System.out.println(b.getCustomerName());

		char answer = 'y';

		while (Character.toUpperCase(answer) == 'Y') {
			try {
				Scanner s = new Scanner(System.in);
				System.out.println("Please enter CustomerID ");
				//creates an array in the memory of length n
				Long  n1 = s.nextLong();
				System.out.println("Please enter A Customer Name");
				//CustomerBean n1= new CustomerBean(001, "James");
				String n2 = s.next();
				CustomerBean k = new CustomerBean(n1,n2);
				customers.addCustomer(k);
				System.out.println(k.getCustomerId()+ " " + k.getCustomerName());

				//System.out.println("Enter Preffered  Names of array size " + n1);
				//String  names [] = new String[n1];

				//for (int i = 0; i < names.length; i++) {
					//reading the number of elements from the that we want to enter
				//	names [i] = s.next();
				//}

				//ArrayAddition.addArray(a,b);

				System.out.print("\n Do you want to continue (y or n)?");
				Scanner keyboard = new Scanner(System.in);
				answer = keyboard.next().charAt(0);
				customers.Viewcustomers();
			}catch (InputMismatchException e) {

				System.out.println("Oops that was an invalid input!!! TRY AGAIN");

			}
		}

	}
		 **/
	}

	/**
	 * @param n1
	 */
	
}
