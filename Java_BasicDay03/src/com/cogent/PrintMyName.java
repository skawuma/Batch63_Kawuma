package com.cogent;

/**
 * @author samuelkawuma
 *
 */

public class PrintMyName {
	String name;
	public String printName(String name) {
		return this.name;
		
	
	}
	public static void main(String[] args) {
		
		PrintMyName n = new PrintMyName();
		
	n.printName("Samuel Kawuma");
	System.out.println(n);
		
	}


}

