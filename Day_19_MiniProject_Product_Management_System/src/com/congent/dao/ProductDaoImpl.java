package com.congent.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.cogent.bean.ProductBean;

/**
 * @author samuelkawuma
 *Oct 14, 2022
 *10:54:05 AM
 */

public class ProductDaoImpl implements ProductDao {
	@Override
	public void addProduct(ProductBean productbean) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/batch63?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url,"root","Stella@1972");


			PreparedStatement psmt = con.prepareStatement("insert into Product values(?,?,?,?,?,?)");
			psmt.setDouble(1,productbean.getPid());	
			psmt.setString(2,productbean.getPname());
			psmt.setString(3,productbean.getPcat() );
			psmt.setDate(4,new java.sql.Date(productbean.getManufacture_date().getTime()));
			psmt.setDouble(5, productbean.getPrice());	
			psmt.setDate(6, new java.sql.Date(productbean.getExpiry_date().getTime()));  
			int i = psmt.executeUpdate();
			System.out.println(i + "Records have been Added successflly!!");

			psmt.close();con.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();		
		} catch (SQLException e) {
			e.printStackTrace();
		}catch (InputMismatchException e) {
			System.out.println("OOps that was an INVALID INPUT!!!! PLEASE TRY AGAIN");
			//e.printStackTrace();
		}
	}
	@Override
	public void deleteProductById(Double pId) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/batch63?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url,"root","Stella@1972");

			PreparedStatement psmt = con.prepareStatement("delete from Product where pid =?");
			psmt.setDouble(1, pId);
			int i = psmt.executeUpdate();
			System.out.println(i +" Record has been successfully deleted");
			psmt.close();con.close();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteProductByCat(String pcat) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url= "jdbc:mysql://localhost:3306/batch63?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url,"root","Stella@1972");
			PreparedStatement psmt = con.prepareStatement("delete from Product where pcat =?");
			psmt.setString(1, pcat);
			int i = psmt.executeUpdate();
			System.out.println(i + " Category Successfully Been deleted!!");
			psmt.close();con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public ProductBean findCheapestProductInCat( ) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url= "jdbc:mysql://localhost:3306/batch63?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url,"root","Stella@1972");
			Statement st = con.createStatement();

			PreparedStatement psmt = con.prepareStatement(" SELECT pname, price,pcat FROM Product  WHERE price=(SELECT MIN(price) FROM Product)");
			ResultSet rs = psmt.executeQuery();
			while (rs.next())
			{


				System.out.println(rs.getString(1)+ "  "+rs.getString(2)+ "  "+rs.getString(3));
			}
			rs.close(); st.close(); con.close();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();	

		}
		return null;
	}

	@Override
	public List<ProductBean> findProductByCat(String pcat) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url= "jdbc:mysql://localhost:3306/batch63?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url,"root","Stella@1972");
			Statement st = con.createStatement();
			PreparedStatement psmt = con.prepareStatement(" SELECT * FROM Product WHERE pcat=?");
			psmt.setString(1, pcat);
			ResultSet rs = psmt.executeQuery();
			while (rs.next())
			{			
				System.out.println(rs.getString(2)); 
			}
			rs.close(); st.close(); con.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public ProductBean findProductById(Double pId) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url= "jdbc:mysql://localhost:3306/batch63?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url,"root","Stella@1972");
			Statement st = con.createStatement();
			PreparedStatement psmt = con.prepareStatement(" SELECT * FROM Product WHERE pid=?");
			psmt.setDouble(1, pId);
			ResultSet rs = psmt.executeQuery();
			while (rs.next())
			{
				System.out.println(rs.getString(2)+"  "+ rs.getString(3)+"  "+ rs.getString(5)); 
			}
			rs.close(); st.close(); con.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return null;
	}

	@Override
	public List<ProductBean> findExpiredProducts() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url= "jdbc:mysql://localhost:3306/batch63?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url,"root","Stella@1972");
			Statement st = con.createStatement();
			PreparedStatement psmt = con.prepareStatement("  SELECT * from Product where expiry_date< Now() ");
			ResultSet rs = psmt.executeQuery();
			while (rs.next())
			{
				System.out.println((rs.getString(2)+ "  "+rs.getString(3)+ "  "+rs.getString(6))); 

			}
			rs.close(); st.close(); con.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public void updateProduct(ProductBean productbean) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url= "jdbc:mysql://localhost:3306/batch63?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url,"root","Stella@1972");
			PreparedStatement psmt = con.prepareStatement("update Product set price=? where pid=?");
			psmt.setDouble(1, productbean.getPrice());
			psmt.setDouble(2, productbean.getPid());
			int i = psmt.executeUpdate();
			System.out.println(i + " Records are Updated SUCCESSFULLY!!");
			psmt.close();  con.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

