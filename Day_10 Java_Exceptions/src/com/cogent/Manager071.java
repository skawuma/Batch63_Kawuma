package com.cogent;
import java.io.*;
/**
 * @author samuelkawuma
 *Sep 30, 2022
 *10:19:49 AM
 */

public class Manager071 {
	public static void main(String[] args) {
		
	
File file = new File ("Data1.txt");
String s =(" Welcome ");

//byte b;
byte b[] = s.getBytes();
//for(int i=0; i<b.length; i++) {
//	System.out.print((char)b[i]);
//}

FileOutputStream  fos = null;
try 
{
 fos = new FileOutputStream(file);
 
fos.write(b);

System.out.println("File is finally Created and added some data");
	//fos.close();
}catch(FileNotFoundException fnfe) {
		System.out.println(fnfe);
	}catch (IOException e) {
		
		System.out.println(e);
	}
}
	}