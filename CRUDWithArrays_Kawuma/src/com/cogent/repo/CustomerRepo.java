package com.cogent.repo;
import com.cogent.bean.*;
import java.util.Scanner;
/**
 * @author samuelkawuma
 *Sep 26, 2022
 *2:40:17 PM
 */

public class CustomerRepo{

	private CustomerBean  customers[] = new CustomerBean[0];

	public  void  addCustomer(CustomerBean newCustomer) {

		CustomerBean newarr[] = new CustomerBean[this.customers.length+1];
		for(int i=0; i<this.customers.length;i++) {
			newarr [i] = this.customers[i];
		}

		newarr[newarr.length-1] = newCustomer;
		this.customers= newarr;	
	}

	public void  SearchCustomerbyId(CustomerBean customerId)

	{
		for(int i = 0; i < this.customers.length; i++)
		{
			if(customers[i] == customerId) {
				System.out.println("CustomerId is found at index: "+i);    
			}
			if (i== this.customers.length) 
				System.out.println("CustomerId isn't present anywhere in the list"); 

		}


		//return 0;


	}


	public void  Viewcustomers() {
		
		if (customers==null|| customers.length == 0 ) {  
			System.out.println(" For now Unfortunatley The list contains no customers");
		}
		else {

			for (int i=0; i <this. customers.length; i++)

			{
				System.out.println(customers[i].display());

			}
		}


	}

}
