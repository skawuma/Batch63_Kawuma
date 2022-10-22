package com.cogent;

import java.util.ArrayList;
import java.util.List;

/**
 * @author samuelkawuma
 *Oct 4, 2022
 *4:03:50 PM
 */

public class Manager079 {
    private int pId;
	private String name;
	/**
	 * @return the pId
	 */
	public int getpId() {
		return pId;
	}
	/**
	 * @param pId the pId to set
	 */
	public void setpId(int pId) {
		this.pId = pId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Manager079 [pId=" + pId + ", name=" + name + "]";
	}
	/**
	 * @param pId
	 * @param name
	 */
	public Manager079(int pId, String name) {
		super();
		this.pId = pId;
		this.name = name;
	}
	/**
	 * 
	 */
	public Manager079() {
		super();
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
	Manager079 persons = null;
	List<Manager079> person = new ArrayList<>();
	person.add (new Manager079(111,"Sam"));
	person.add (new Manager079(222,"akon"));
	person.add (new Manager079(333,"Jalyn"));
	person.add (new Manager079(444,"jean"));
	person.add (new Manager079(555,"Aaron"));
	person.add (new Manager079(666,"Dan"));
	person.add (new Manager079(777,"April"));
	person.add (new Manager079(888,"Jax"));
	person.add (new Manager079(999,"Teana"));
	person.add (new Manager079(1010,"jill"));
	
	// Using Lamda Expressions 
	//person.forEach( (n)-> System.out.println(n));
	
	
	for(int i = 0; i< person.size();i++) {
		persons = person.get(i);
		if ((persons.getName().toUpperCase().charAt(0)=='A')|| (persons.getName().toUpperCase().charAt(0)=='J')){
		
			System.out.println(persons);
		}
		//persons = null;
	}
	
		
}
}

