package com.cogent.repo;
import com.cogent.bean.*;
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

public  long SearchCustomerbyId(CustomerBean customerId)
	
    {
		CustomerBean newarr[] = new CustomerBean[this.customers.length];
    	for(int i = 0; i < this.customers.length; i++)
    	{
    		if(newarr[i] == customerId)
    			return i;
    	}

    	return -1;}


	 public void  Viewcustomers()
	
	{
for (int i=0; i <this. customers.length; i++)
   { 
	System.out.println( customers[i].getCustomerName() + " ");
}
	}



}

