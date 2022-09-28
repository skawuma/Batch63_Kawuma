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


	@SuppressWarnings("resource")
	public static void main(String[] args) {
		char answer = 'Y';
		Scanner keyboard = new Scanner(System.in);

		CustomerRepo customers = new CustomerRepo();
		Scanner s = new Scanner(System.in);
		System.out.println("***************************************");
		System.out.println(" CUSTOMER MANAGEMENT SYSTEM");
		System.out.println("***************************************");

		System.out.println("    1. Add Customer ");
		System.out.println("    2. View AllCustomers ");
		System.out.println("    3. Search Customer By Id ");
		System.out.println("    4. Exit");

		int  option;
		boolean continuethisloop = true;

		while(continuethisloop) {
			try {
				System.out.println("Please Select one of the Options ");
				option = s.nextInt();
				// option  = 1;
				switch (option) {


				case 1:
					answer = 'y';
					while (Character.toUpperCase(answer) == 'Y') 

					{
						System.out.println("ENTER CustomerID ");
						Long  n1 = s.nextLong();
						System.out.println("ENTER A Customer Name");
						String n2 = s.next();
						CustomerBean k = new CustomerBean(n1,n2);
						customers.addCustomer(k);
						System.out.print("\n Do you want to Add more Customers (y or n)?");


						answer = keyboard.next().charAt(0);

						if (answer == 'Y');

					}
					break;
				case 2:

					customers.Viewcustomers();

					System.out.print("\nPress Any Key to Return Back to the Menu?");

					answer = keyboard.next().charAt(0);

					if (answer == 'y');


					break;
				case 3:
					answer = 'y';
					while (Character.toUpperCase(answer) == 'Y') 
					{

						System.out.println("Please enter CustomerID Yo want to search ");


						long n3 = s.nextLong();
						CustomerBean k = new CustomerBean(n3);
						customers.SearchCustomerbyId(k);

						System.out.print("\n Do you want to Search More CustomerIDs (y or n)?");


						answer = keyboard.next().charAt(0);

						if (answer == 'Y');

					}
					break;

				case 4:
					System.out.println("PROGRAM EXITED!!");
					System.exit(0);		

				}	

			}
			catch (InputMismatchException e) {

				System.out.println("Oops that was an invalid input!!! TRY AGAIN");

			}
		}

	}	


}



