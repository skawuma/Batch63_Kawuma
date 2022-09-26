package com.cogent.controller;
import com.cogent.repo.*;
import com.cogent.bean.*;
/**
 * @author samuelkawuma
 *Sep 26, 2022
 *2:43:32 PM
 */

public class CustomerManager {
	
	
	public static void main(String[] args) {
	CustomerRepo customers = new CustomerRepo();
	CustomerBean a = new CustomerBean(001, "James");
	CustomerBean b = new CustomerBean(002, "Stella");	
	customers.addCustomer(b);
	customers.addCustomer(a);
	
	customers.Viewcustomers();
//System.out.println(b.getCustomerName());

}

}