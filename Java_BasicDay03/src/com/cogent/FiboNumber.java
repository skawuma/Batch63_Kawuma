package com.cogent;
import java.util.Scanner;
/**
 * @author samuelkawuma
 *
 */

public class FiboNumber {

	public static void main(String[] args) {
		System.out.print("please Enter ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		// check for base case, if 0, print 1
		if(n==0){
			System.out.print(1);
			//check if 1  print 1 and previous 1 of the zero
		}else if(n==1){
			System.out.print(1+" ");
			System.out.print(1);

			// assign 1 to both a and b to previous fib Numbers when n is greater than 1
		}else{
			System.out.print(1+" ");
			System.out.print(1+" ");
			int a=1;
			int b=1;
			// Begin the loop with numbers equal to 2 and greater, after assign the sum of the previous numbers and and b to value of c 
			for(int i=2;i<=n;i++){
				int c=a+b;
				System.out.print(c+" ");
				a=b;
				b=c;
			}
		}
	}

}

