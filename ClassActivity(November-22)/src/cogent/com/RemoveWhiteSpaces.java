package cogent.com;

/**
 * @author samuelkawuma
 *Nov 23, 2022
 *6:32:53 PM
 */

public class RemoveWhiteSpaces {
	
	
public static void main(String[] args) {
	
	
	
	  String str = "  Happy     Thanks   Giving     ";
	  
      // Call the replaceAll() method
      str = str.replaceAll("\\s", "");

      System.out.println(str);
  }


}



