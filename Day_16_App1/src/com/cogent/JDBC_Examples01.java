package com.cogent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



/**
 * @author samuelkawuma
 *Oct 10, 2022
 *2:25:32 PM
 */

public class JDBC_Examples01 {
	

public static void main(String[] args) {
	//Object Creation
	try {
		//Registering driver class by passing  its name in class .forName() method
	Class.forName("com.mysql.jdbc.Driver");
	
	
	String url = "jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8";
	/**
	 * 
	Establishing connection with connection with database using getConnection() method of DriverManager class
	After establishing the connection, it is stored in reference variable of connection 
	
    **/
	Connection con = DriverManager.getConnection(url,"root","Stella@1972");
	/**
	 * Creating the statement and 
	 * 
	 *Executing the sql query that will be returning  the rows into the results.
	 */
	Statement st = con.createStatement();
	//ResultSet  rs = st.executeQuery("select firstname,lastname,jobtitle from employees");
	ResultSet  rs = st.executeQuery("select ordernumber ,orderdate,status from orders");
	
	//Going through rows of the tables
	while (rs.next())
		
	{   //System.out.println( rs.toString());
		System.out.println(rs.getString(1)+ "   "+ rs.getString(2)+ "   "+ rs.getString(3)+ "   ");
		//System.out.println(rs.getString(1)+ "   "+ rs.getString(2)+ "   "+ rs.getString(3)+ "   "+ rs.getString(4)+ "   "+ rs.getString(6)+ " ");
		
	}
	//System.out.println("Get Connected");
	//Closing the ResultSet ,Statement and connection
	rs.close(); st.close(); con.close();
	}catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	}catch (SQLException e) {
		
		e.printStackTrace();
	}
	}
	
	
}


