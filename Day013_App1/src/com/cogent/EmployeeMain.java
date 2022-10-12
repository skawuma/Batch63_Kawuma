package com.cogent;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author samuelkawuma
 *Oct 5, 2022
 *6:18:23 PM
 */

public class EmployeeMain {
public static void main(String[] args) {
	
	EmployeeDirectory emp3 = new EmployeeDirectory(444, 115000.00,"Samuel Kawuma");
	EmployeeDirectory emp4= new EmployeeDirectory(999, 65000.00,"Emin Pasha");
	EmployeeDirectory emp = new EmployeeDirectory(111, 65000.00,"Justin klein");
	EmployeeDirectory emp1 = new EmployeeDirectory(222, 95000.00,"Suzan Den");
	EmployeeDirectory emp2 = new EmployeeDirectory(888, 77000.00,"Alex Sawyer");

	 System.out.println("Sorting Queue by EmployeeID in Asceding Order");
	 System.out.println("");
	Queue<EmployeeDirectory> employeedirectory = new PriorityQueue<>();
	
	employeedirectory.add(emp);
	employeedirectory.add(emp1);
	employeedirectory.add(emp2);
	employeedirectory.add(emp3);
	employeedirectory.add(emp4);
		
 while (!employeedirectory.isEmpty()){
	 
	 System.err.println(employeedirectory.poll());
	 
 }
 System.out.println("***********************************************************");
 System.out.println("");
 System.out.println("Sorting Queue by Salary in Asceding Order");
 System.out.println("");
 Queue<EmployeeDirectory>empdrtory = new PriorityQueue<>( new EmployeeSalaryComparator());
 
 empdrtory.add(emp);
 empdrtory.add(emp1);
 empdrtory.add(emp2);
 empdrtory.add(emp3);
 empdrtory.add(emp4);
 
 while (!empdrtory.isEmpty()) {
	 
	 System.out.println(empdrtory.poll());
 }
 
} 
	
	
}

