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
 *2:27:19 PM
 */

public class JDBC_Examples02 {

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
		//PreparedStatement psmt = con.prepareStatement("insert into student values(?,?,?)");
		//PreparedStatement psmt = con.prepareStatement("update student set stname= ? where stno=?");
		PreparedStatement psmt = con.prepareStatement("delete from student where stno=?");
		//psmt.setString(1, "John Kawuma");
		psmt.setInt (1,103);
		
		//psmt.setInt (1,103);
		//psmt.setString(2, "StellaKawuma");
		//psmt.setString(3, "@gamil.com");
		
		int i = psmt.executeUpdate();
		//System.out.println(i + "  No of Recods are Updated");
		//System.out.println(i + "No of Recods are inserted");
		System.out.println(i + " No of Recods are Deleted");
		psmt.close(); con.close();
		
		}catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
}

