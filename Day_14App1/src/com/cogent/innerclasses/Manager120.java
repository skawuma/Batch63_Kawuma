package com.cogent.innerclasses;

/**
 * @author samuelkawuma
 *Oct 6, 2022
 *2:36:24 PM
 */
interface Calculator1
{
	int addValues();
	}

public class Manager120 {
public static void main(String[] args) {
		
		//int x=0;
		//Calculator c=(a,b) -> {return a+b;};
		Calculator1 c=() ->1100;
		System.out.println("Sum is "+ c.addValues());
	}
}

