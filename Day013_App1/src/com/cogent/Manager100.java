package com.cogent;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author samuelkawuma
 *Oct 5, 2022
 *2:42:43 PM
 */

public class Manager100 {
	public static void main(String[] args) {
		
		
		File f = new File ("/Users/samuelkawuma/eclipse-workspace/Day013_App1/src/jdbc.properties");
		
		try {
			FileInputStream fis =new FileInputStream(f);
			Properties prop = new Properties();
			prop.load(fis);
			
			System.out.println("Driver :-   + " + prop.getProperty("Driver"));
			System.out.println("Url:-" + prop.getProperty("url"));
			System.out.println("Username:-"+prop.getProperty("username"));
			System.out.println("Password   "+ prop.getProperty("password"));
		
	}catch (FileNotFoundException e) {
		e.printStackTrace();
	}catch (IOException e) {
	e.printStackTrace();
	}
	
	}
	
}

