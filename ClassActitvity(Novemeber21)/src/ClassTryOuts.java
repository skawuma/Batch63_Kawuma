import java.util.Arrays;
import java.util.List;

/**
 * @author samuelkawuma
 *Nov 23, 2022
 *10:12:49 AM
 */

public class ClassTryOuts {
	
	
	public static void main(String[] args) {
		
		
		
		 List<Integer> list = Arrays.asList(-50, -100, 0, 25, 5);
		  System.out.print("The maximum value is : ");
		  
	        Integer intg = list.stream().min(Integer::compare).get();
	  
	        System.out.println(intg);
	        
			
			 List<Integer> list1 = Arrays.asList(-50, -100, 0, 25, 5);
			 
			  System.out.print("The maximum value is : ");
			  
		        Integer intg1 = list1.stream().max(Integer::compare).get();
		  
		        System.out.println(intg1);
	}
	
	
	

}

