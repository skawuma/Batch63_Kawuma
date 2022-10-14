import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author samuelkawuma
 *Oct 12, 2022
 *4:24:24 PM
 */


public class StudentObjectWriter {
	public static void main(String[] args) {
		File file = new File ("StudentData.txt");
		try (Scanner scanner = new Scanner(System.in)) {
			FileOutputStream fos;
			try {
				fos = new FileOutputStream(file);
				try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
					ArrayList<StudentBean> student = new ArrayList<>();
					try {
						Class.forName("com.mysql.jdbc.Driver");
						String url = "jdbc:mysql://localhost:3306/StudentData?characterEncoding=utf8";
						Connection con = DriverManager.getConnection(url,"root","Stella@1972");

						PreparedStatement psmt = con.prepareStatement("insert into studentdirectory values(?,?,?,?)");
						
						System.out.println("Enter Student Number");
						psmt.setInt(1,scanner.nextInt());
			
						System.out.println("Enter Student FirstName");
						psmt.setString(2, scanner.next());
						System.out.println("Enter Student LastName");
						psmt.setString(3, scanner.next());
						System.out.println("Enter Student Email");
						psmt.setString(4, scanner.next());
						
						int i = psmt.executeUpdate();
						System.out.println(i + "No of Recods are inserted");
						Statement dt = con.createStatement();
						ResultSet  rs = dt.executeQuery("Select * from studentdirectory");
						while (rs.next())
						{ 
							StudentBean stdb = new StudentBean();
							stdb.setStdno(rs.getInt(1));
							stdb.setStdfname(rs.getString(2));
							stdb.setStdlname(rs.getString(3));
							stdb.setEmail(rs.getString(4));
							student.add(stdb);		
			
							//System.out.println(stdb);
						
						}
						System.out.println(" Student Records in the list are");
						oos.writeObject(student);
						psmt.close(); con.close();rs.close();
							
					} catch (ClassNotFoundException | SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

