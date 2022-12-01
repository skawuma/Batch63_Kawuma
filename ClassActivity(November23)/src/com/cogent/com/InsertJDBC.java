package com.cogent.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * @author samuelkawuma
 *Dec 1, 2022
 *1:17:36 AM
 */

public class InsertJDBC {
	 public static void main(String[] args)
	    {
	       
	        // Try block to check if exception/s occurs
	        try {
	        	
	        	Class.forName("com.mysql.jdbc.Driver");
				String url = "jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8";

				Connection con = DriverManager.getConnection(url,"root","Stella@1972");
	 
	          
	           
				PreparedStatement psmt = con.prepareStatement("insert into Employee01s values(?,?,?,?,?)");
	 
	           
	            psmt.execute();
	        }
	 
	        // Optional but recommended
	        // Step 7: Close the connection
	 
	        // Catch block to handle the exception/s
	        catch (Exception e) {
	 
	            // Print the exception
	            System.out.println(e);
	        }
	    }
}

