package com.cogent.innerclasses;

/**
 * @author samuelkawuma
 *Oct 6, 2022
 *2:41:31 PM
 */
interface Hello03{
	void message(String name);
}

public class Manager116 {
	public static void main(String[] args) {
		
		
		Hello03 h1 = (str)-> {System.out.println("Welcome to  "+ str+ " stream");};
		h1.message("Java");
	}

}

