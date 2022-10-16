package com.cogent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


/**
 * @author samuelkawuma
 *Oct 11, 2022
 *4:49:59 PM
 */

public class JDBC_Examples04 {

	public static void main(String[] args) {

		char answer = 'Y';
		Scanner keyboard = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
		int choice =0;

		System.out.println("*****************************");

		System.out.println("MENU");

		System.out.println("*****************************");

		System.out.println("1 . INSERT  EMPLOYEE");
		System.out.println("2 . VIEW ALL EMPLOYEES");
		System.out.println("3 . FIND EMPLOYYE BY ID");
		System.out.println("4 . FIND EMPLOYYE BY Name");
		System.out.println("5 . FIND EMPLOYYE BY EMAIL");
		System.out.println("6 . DELETE EMPLOYYE BY ID");
		System.out.println("7 . UPDATE EMPLOYEE");
		System.out.println("8 . EXIT");

		int  option;
		boolean continuethisloop = true;

		while(continuethisloop) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				String url = "jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8";

				Connection con = DriverManager.getConnection(url,"root","Stella@1972");

				System.out.println("PLEASE  REFER to  MENU AND  SELECT ONE OF THE OPTIONS  ");
				option = scanner.nextInt();	
				switch (option) {
				case 1:
					answer = 'y';
					while (Character.toUpperCase(answer) == 'Y')

					{

						PreparedStatement psmt = con.prepareStatement("insert into Employee01s values(?,?,?,?,?)");
						System.out.println("Enter Employee Id");
						psmt.setInt(1,scanner.nextInt());

						System.out.println("Enter Employee FirstName");
						psmt.setString(2, scanner.next());
						System.out.println("Enter Employee LastName");
						psmt.setString(3, scanner.next());
						System.out.println("Enter Employee  Email");
						psmt.setString(4, scanner.next());
						System.out.println("Enter Employee Job title");
						psmt.setString(5, scanner.next());
						int i = psmt.executeUpdate();
						System.out.println(i + "No of Recods are inserted");

						System.out.print("\n Do you want to Add more Employees(y or n)?");
						answer = keyboard.next().charAt(0);

						if(answer=='Y');
						//psmt.close(); con.close();

					}

					break;
				case 2:

					Statement st = con.createStatement();
					ResultSet  rs = st.executeQuery("select * from Employee01s");

					while (rs.next())

					{   
						System.out.println(rs.getString(1)+ "   "+ rs.getString(2)+ "   "+ rs.getString(3)+ "   "+ rs.getString(4)+ "   "+ rs.getString(5)+ "   ");

					}
					rs.close(); st.close(); con.close();

					System.out.print("\nPress Any Key to Return Back to the Menu?");


					answer = keyboard.next().charAt(0);

					if (answer == 'y');


					break;
				case 3:
					answer = 'y';
					while (Character.toUpperCase(answer) == 'Y') 
					{

						//Search Book
						System.out.println("Please enter the Employee you want to search By Id");
						Statement dt = con.createStatement();
						ResultSet  res = dt.executeQuery("select  from Employee01s where empno=?");
						while (res.next())

						{ 
							System.out.println(res.getString(1));

						}
						res.close(); dt.close(); con.close();
				

						System.out.print("\n Do you want to Search More EmployeeIDs (y or n)?");


						answer = keyboard.next().charAt(0);

						if (answer == 'Y');

					}
					break;
				case 4:
					answer = 'y';
					while (Character.toUpperCase(answer) == 'Y') 
					{

						//Search Book
						System.out.println("Please enter the Employee you want to search By Name");
						String s1 = scanner.next();
						//Statement dt = con.createStatement();
						
						PreparedStatement psmt = con.prepareStatement("select * from Employee01s where emplofname=?");
						psmt.setString(1,s1);
						
						ResultSet  res = psmt.executeQuery();
						
						while (res.next())

						{ 
							System.out.println(res.getString(1)+ "   "+ res.getString(2)+ "   "+ res.getString(3)+ "   "+ res.getString(4)+ "   "+ res.getString(5)+ " ");
							

						}

						System.out.print("\n Do you want to Search More EmployeeIDs (y or n)?");


						answer = keyboard.next().charAt(0);

						if (answer == 'Y');

					}
					break;
				case 5:
					answer = 'y';
					while (Character.toUpperCase(answer) == 'Y') 
					{

						//Search Book
						System.out.println("Please enter the Employee you want to search By Email");
						String s1 = scanner.nextLine();
						//Statement dt = con.createStatement();
						
						PreparedStatement psmt = con.prepareStatement("select * from Employee01s where email=?");
						psmt.setString(1,s1);
						
						ResultSet  res = psmt.executeQuery();
						
						while (res.next())

						{ 
							System.out.println(res.getString(1)+ "   "+ res.getString(2)+ "   "+ res.getString(3)+ "   "+ res.getString(4)+ "   "+ res.getString(5)+ " ");
							

						}
						//PreparedStatement psmt = con.prepareStatement("select  from Employee01s where stno=?");

						//psmt.setInt (1,scanner.nextInt());

						System.out.print("\n Do you want to Search More EmployeeIDs (y or n)?");


						answer = keyboard.next().charAt(0);

						if (answer == 'Y');

					}
					break;
				case 6:
					answer = 'y';
					while (Character.toUpperCase(answer) == 'Y') 
					{

						//Search Book
						System.out.println("Please enter the Employee you want to Delete");
						int n2 = scanner.nextInt();
						PreparedStatement psmt = con.prepareStatement("delete from Employee01s where empno=?");
						psmt.setInt (1,n2);

						int i = psmt.executeUpdate();
						System.out.println(i + " No of Records are Deleted");
						psmt.close(); con.close();

						System.out.print("\n Do you want to Delete more Employeess by IDs (y or n)?");


						answer = keyboard.next().charAt(0);

						if (answer == 'Y');

					}
					break;
				case 7:
					answer = 'y';
					while (Character.toUpperCase(answer) == 'Y') 
					{
						PreparedStatement psmt = con.prepareStatement("update Employee01s set emplofname= ? where empno=?");
						System.out.println("Please enter the Employee ID NUMBER you want to UPDATE");
						int s2 = scanner.nextInt();
						System.out.println("Please enter the Employee NAME you want to UPDATE");
						String s1 = scanner.next();
				
						psmt.setString(1,s1);
						psmt.setInt(2,s2);
					
						int i = psmt.executeUpdate();
						
						System.out.println(i + " Records are Updated");
						

						System.out.print("\n Do you want to Update More Employees (y or n)?");


						answer = keyboard.next().charAt(0);

						if (answer == 'Y');

					}
					break;
				
				case 8:
					System.out.println("PROGRAM EXITED!!");
					System.exit(0);	
				}
			}		catch(InputMismatchException e) {

				System.out.println("Oops that was an invalid input!!! TRY AGAIN");
				///
				scanner.nextLine();
			}
			
			catch (ClassNotFoundException e) {

				e.printStackTrace();}
			catch (SQLException e) {

				e.printStackTrace();
			}

	

		}

	}



}

