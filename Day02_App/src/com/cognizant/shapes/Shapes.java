package com.cognizant.shapes;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author samuelkawuma
 *
 */

public class Shapes {

	int numberOfSides;
	double  area;

	/**
	public int calculateShapeArea(int numberOfSides, int side) {

		if(numberOfSides==1) {
			String shape = "Circle";
			int radius = side/2;

		 area= 3.14* (radius * radius);	
		 System.out.println("The Area of the " + shape  + area);

		}
		if(numberOfSides==3) {
			String shape = "Triangle";	
		 area= 0.433 * (side *  side);	
		 System.out.println("The Area of the " + shape  + area);
		}
		if (numberOfSides==4) {
			String shape = "tSquare";
		 area= side * side;	
		 System.out.println("The Area of the " + shape  + area);	

		}
		else {

			System.out.println("No Shape Present");
		}




		return (int)Math.round(area);

	}
	 **/
	public static void main(String args[]){

		while (true) {
			try {
				double area;
				Scanner s = new Scanner(System.in);



				System.out.println("Enter the Number of sides of the Shape:");
				int numberOfSides= s.nextInt();

				System.out.println("Enter the Side length:");
				int side= s.nextInt();

				if(numberOfSides==1) {
					String shape = "Circle";
					int radius = side/2;

					area= 3.14* (radius * radius);	
					System.out.println("The Area of the " + shape  +  area);

				}
				if(numberOfSides==3) {
					String shape = "Triangle";	
					area= 0.433 * (side *  side);	
					System.out.println("The Area of the " + shape  +  area);
				}
				if (numberOfSides==4) {
					String shape = "Square";
					area= side * side;	
					System.out.println("The Area of the " + shape  +  area);	

				}
				else {

					System.out.println("No Shape Present");
				}




			}catch(InputMismatchException e) {

				System.out.println("Oops that was an invalid input!!! TRY AGAIN");
			}
		}






	}
}
