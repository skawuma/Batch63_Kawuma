package com.cogent;

/**
 * @author samuelkawuma
 *Oct 4, 2022
 *10:37:42 AM
 */

public class Manager_70 {
	

	//@Override
//	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
	//	return super.equals(obj);
	// }

	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = new String( "Java");
		String s3 = new String( "Java");
		String s4 = "Java";
		System.out.println(s1==s4);
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s2.equals(s1));
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s3));
	}
}

