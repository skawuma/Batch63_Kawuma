package com.cogent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author samuelkawuma
 *Oct 11, 2022
 *3:49:52 PM
 */

public class JDBC_Examples03 {
	
	public static void main(String[] args) {
		
		
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
		//PreparedStatement psmt = con.prepareStatement("insert into Employee01s values(?,?,?,?,?)");
		//PreparedStatement psmt = con.prepareStatement("update student set stname= ? where stno=?");
		//PreparedStatement psmt = con.prepareStatement("delete from student where stno=?");
		Statement st = con.createStatement();
		//ResultSet  rs = st.executeQuery("select firstname,lastname,jobtitle from employees");
		ResultSet  rs = st.executeQuery("select ordernumber ,orderdate,status from orders");
		
		//psmt.setInt (1,666666);
		//psmt.setString(2, "Kawuma");
		//psmt.setString(3, "Samuel");
		//psmt.setString(4, "christokawuma@gmail.coml");
		//psmt.setString(5, "General Manager");
		//int i = psmt.executeUpdate();
		//System.out.println(i + "No of Recods are inserted");
		
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

