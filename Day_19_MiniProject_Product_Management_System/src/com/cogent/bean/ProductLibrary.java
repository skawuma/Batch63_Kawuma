package com.cogent.bean;

import java.sql.Date;
import java.time.DateTimeException;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.cogent.service.ProductService;
import com.cogent.service.ProductServiceImpl;

/**
 * @author samuelkawuma
 *Oct 14, 2022
 *9:53:18 AM
 */

public class ProductLibrary {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ProductService productservice = new ProductServiceImpl();
		ProductBean productBean = null;
		boolean continuethisloop =true;
		int option ;
		char answer = 'Y';
		Scanner keyboard = new Scanner(System.in);
		int choice =0;

		System.out.println("*****************************");

		System.out.println("MENU");

		System.out.println("*****************************");

		System.out.println("1 . INSERT  PRODUCT");
		System.out.println("2 . DELETE PRODUCT BY ID");
		System.out.println("3 . DELETE PRODUCT BY CATEGORY");
		System.out.println("4 . FIND CHEAPEST PRODUCT IN CATEGORY");
		System.out.println("5 . FIND PRODUCT BY CATEGORY");
		System.out.println("6 . FIND PRODUCT BY ID");
		System.out.println("7 . FIND EXPIRED PRODUCTS");
		System.out.println("8 . UPDATE EMPLOYEE");
		System.out.println("9 . EXIT");



		while (continuethisloop)	{
			try  {
				productBean = new ProductBean();
				System.out.println("PLEASE  REFER to  MENU AND  SELECT ONE OF THE OPTIONS  ");
				option = scanner.nextInt();
				switch (option){
				case 1:
					answer ='y';
					while(Character.toUpperCase(answer)=='Y')

					{	

						System.out.println("Please Enter productID");
						productBean.setPid(scanner.nextDouble());
						System.out.println("Please Enter The Product name");
						productBean.setPname(scanner.next());
						System.out.println("Please Enter The Product Category");
						productBean.setPcat(scanner.next());
						System.out.println("Please Enter The Manufacturing Date");
						productBean.setManufacture_date(Date.valueOf(scanner.next()));
						System.out.println("Please Enter The Product Price");
						productBean.setPrice(scanner.nextDouble());
						System.out.println("Please Enter The Product Expiry Date");
						productBean.setExpiry_date( Date.valueOf(scanner.next()));
						productservice.addProduct(productBean);


						System.out.print("\n Do you want to Add more Products(y or n)?");
						answer = keyboard.next().charAt(0);

						if(answer=='Y');
					}

					break;
				case 2:
					answer ='y';
					while(Character.toUpperCase(answer)=='Y')

					{	

						System.out.println("Please Enter The product you want to delete ByID");
						Double n2 = scanner.nextDouble(); 
						productservice.deleteProductById(n2);

						System.out.print("\n Do you want to delete more Products by ID(y or n)?");
						answer = keyboard.next().charAt(0);

						if(answer=='Y');		

					}
					break;

				case 3:
					answer ='y';
					while(Character.toUpperCase(answer)=='Y')

					{		


						System.out.println("Please Enter the Product Category you want to Delete");
						String x2 = scanner.next();
						productservice.deleteProductByCat(x2);




						System.out.print("\n Do you want to delete more Product Categories (y or n)?");
						answer = keyboard.next().charAt(0);

						if(answer=='Y');		

					}
					break;

				case 4:
					answer ='y';
					while(Character.toUpperCase(answer)=='Y')

					{	

						//System.out.println("Please Enter the Product Category you want to Search the cheapest Product");
						//String y2 = scanner.next();
						productservice.findCheapestProductInCat();

						System.out.print("\nPress Any Key to Return Back to the Menu?");
						answer = keyboard.next().charAt(0);

						if(answer=='Y');		

					}
					break;

				case 5:
					answer ='y';
					while(Character.toUpperCase(answer)=='Y')

					{

						System.out.println("Please Enter the Product Category you want to View");
						String p2 = scanner.next();
						productservice.findProductByCat(p2);


						System.out.print("\n Do you want to Search other Product Categories (y or n)?");
						answer = keyboard.next().charAt(0);

						if(answer=='Y');		

					}
					break;

				case 6:
					answer ='y';
					while(Character.toUpperCase(answer)=='Y')

					{


						System.out.println("Please Enter the Product Id you want to View");
						Double k2 = scanner.nextDouble();
						productservice.findProductById(k2);



						System.out.print("\n Do you want to View other Product IDs (y or n)?");
						answer = keyboard.next().charAt(0);

						if(answer=='Y');		

					}
					break;
				case 7:		

					productservice.findExpiredProducts();
					scanner.nextLine();


					System.out.print("\nPress Any Key to Return Back to the Menu?");


					answer = keyboard.next().charAt(0);

					if (answer == 'y');

					break;

				case 8:
					answer ='y';
					while(Character.toUpperCase(answer)=='Y')

					{

						System.out.println( "Please Enter the Product id of the product you want to UPDATE ");
						productBean.setPid(scanner.nextDouble());
						System.out.println("Please enter the price you want to UPDATE ") ;
						productBean.setPrice(scanner.nextDouble());
						productservice.updateProduct(productBean);

						System.out.print("\n Do you want to UPDATE other Product  (y or n)?");
						answer = keyboard.next().charAt(0);

						if(answer=='Y');		

					}
					break;

				case 9:
					System.out.println("PROGRAM EXITED!!");
					System.exit(0);	

				}
			}

		catch (InputMismatchException | IllegalArgumentException e) {
				//e.printStackTrace();
				System.out.println("Oops that was an invalid input!!! TRY AGAIN");

				scanner.nextLine();
			}	catch (DateTimeException e) {
				//e.printStackTrace();
				System.out.println("Oops that was an invalid input!!! TRY AGAIN");

				scanner.nextLine();
			}	

		}

	}
}
