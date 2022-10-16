import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;




/**
 * @author samuelkawuma
 *Oct 12, 2022
 *4:25:28 PM
 */



public class StudentObjectReader {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		
		File f = new File("StudentData.txt");
		
		try {
			FileInputStream  fis = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Object obj = ois.readObject();
		
			//@SuppressWarnings("unchecked")
			// student 
			ArrayList<StudentBean>  student  = ( ArrayList)obj;
			for (StudentBean studentBean :  student ) {
				System.out.println(studentBean);
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassCastException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}

