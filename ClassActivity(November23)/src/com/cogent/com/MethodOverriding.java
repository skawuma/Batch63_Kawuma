package com.cogent.com;

/**
 * @author samuelkawuma
 *Dec 1, 2022
 *1:36:21 AM
 */

public class MethodOverriding {
	
		   //Overridden method
		   public void disp()
		   {
		     System.out.println("disp() method of parent class");
		    }     
		}
		class Demo extends MethodOverriding {
		   //Overriding method
		   public void disp(){
		     System.out.println("disp() method of Child class");
		   }
		   public void newMethod(){
		      System.out.println("new method of child class");
		   }
		   public static void main( String args[]) {
		 
		  MethodOverriding  obj = new  MethodOverriding ();
		  obj.disp();
		  MethodOverriding  obj2 = new Demo(); // Covariance with reference types
		  obj2.disp();
		   }
		}
