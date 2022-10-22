package com.cogent.innerclasses;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;



/**
 * @author samuelkawuma
 *Oct 6, 2022
 *9:25:21 PM
 */

public class Manager121 implements Comparable<Manager121> {
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
		public Manager121(int pId, String name) {
			super();
			this.pId = pId;
			this.name = name;
		}
		/**
		 * 
		 */
		public Manager121() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		
		@Override
		public int hashCode() {
			return Objects.hash(name, pId);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Manager121 other = (Manager121) obj;
			return Objects.equals(name, other.name) && pId == other.pId;
		}
		@Override
		public int compareTo(Manager121 o) {
			
			if (pId==o.pId)
			return 0;
			else if (pId > o.pId)
			return 1;
			else
				return -1;
		}
	

	public static void main(String[] args) {
		//Manager121 persons = null;
		List<Manager121> person = new ArrayList<>();
		person.add (new Manager121(999,"Teana"));
		person.add (new Manager121(1010,"jill"));
		person.add (new Manager121(555,"Aaron"));
		person.add (new Manager121(666,"Dan"));
		person.add (new Manager121(777,"April"));
		person.add (new Manager121(111,"Sam"));
		person.add (new Manager121(222,"akon"));
		person.add (new Manager121(333,"Jalyn"));
		person.add (new Manager121(444,"jean"));
		person.add (new Manager121(888,"Jax"));
	
		// Using Lamda Expressions 
		///person.forEach( (n)-> System.out.println(n));
		
		Set<Manager121> psn = new TreeSet<>(person);
		for (Manager121 m1 : psn) {
			System.out.println(m1); 
			
		}
		
		
			
	}
	
	
}

