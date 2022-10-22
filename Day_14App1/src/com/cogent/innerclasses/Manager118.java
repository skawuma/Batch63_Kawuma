package com.cogent.innerclasses;

/**
 * @author samuelkawuma
 *Oct 6, 2022
 *2:21:01 PM
 */

interface Calculator
{
	int addValues(int x, int y);
	}

public class Manager118 {

	public static void main(String[] args) {
		
		
		//Calculator c=(a,b) -> {return a+b;};
		Calculator c=(a,b) -> a+b;
		System.out.println("Sum is "+ c.addValues(30, 40));
	}
	
	
}

