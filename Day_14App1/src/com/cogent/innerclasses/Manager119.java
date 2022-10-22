package com.cogent.innerclasses;

/**
 * @author samuelkawuma
 *Oct 6, 2022
 *2:30:25 PM
 */
interface FullName
{
	String addValues(String x, String y);
	}

public class Manager119 {
public static void main(String[] args) {
		
		
		//Calculator c=(a,b) -> {return a+b;};
		FullName c=(a,b) -> a+b;
		System.out.println("Full Name  is "+ c.addValues("Samuel ",  "Kawuma"));
	}
	

}

