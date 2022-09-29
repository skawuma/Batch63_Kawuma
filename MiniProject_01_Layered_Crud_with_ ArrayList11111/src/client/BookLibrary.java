package client;

import java.util.List;
import java.util.Scanner;
import com.cogent.bean.BookBean;
import com.cogent.service.BookService;
import com.cogent.service.BookServiceImpl;
/**
 * @author samuelkawuma
 *Sep 28, 2022
 *3:41:11 PM
 */

public class BookLibrary {
public static void main(String[] args) {
	
	BookService bookService = new BookServiceImpl();
	char answer = 'Y';
	Scanner keyboard = new Scanner(System.in);
	Scanner scanner = new Scanner(System.in);
	int choice =0;
	
	System.out.println("*****************************");
	
	System.out.println("MENU");
	
	System.out.println("*****************************");
	
	System.out.println("1 . ADD BOOK");
	System.out.println("2 . FIND BOOK BY BookID");
	System.out.println("3 . FIND BOOK BY Author");
	System.out.println("4 . FIND BOOK BY Price Range");
	System.out.println("5 . DELETE BOOK BY ID");
	System.out.println("6 . EXIT");

	BookBean bookBean = null;
	int  option;
	boolean continuethisloop = true;
	while(continuethisloop) {
	System.out.println("Please Select one of the Options ");
	option = scanner.nextInt();
	switch (option) {
	
	case 1:
		answer = 'y';
		while (Character.toUpperCase(answer) == 'Y')
		{
    // Add New Book

	bookBean = new BookBean();
	System.out.println("Enter book Id");
	bookBean.setBookId(scanner.nextInt());
	System.out.println("Enter Book title");
	bookBean.setBookTitle(scanner.next());
	System.out.println("Enter Book Author");
	bookBean.setBookAuthor(scanner.next());
	System.out.println("Enter Book Price");
	bookBean.setPrice(scanner.nextDouble());
	bookService.addBook(bookBean);
	System.out.print("\n Do you want to Add more Books(y or n)?");
	
	answer = keyboard.next().charAt(0);

if(answer=='Y');
		}
		break;
	case 2:
		answer = 'y';
		while (Character.toUpperCase(answer) == 'Y') 
		{
	
	//Search Book
	System.out.println("Please enter the Book you want to search Id");
	BookBean book = bookService.findBookById(scanner.nextInt());
	if (book != null) {
		System.out.println(
				book.getBookId() + " " + book.getBookTitle() + " " + book.getBookAuthor() + " " + book.getPrice());
	} else {
		System.out.println("Book not found!");
	}
	System.out.print("\n Do you want to Search More BookIDs (y or n)?");


	answer = keyboard.next().charAt(0);

	if (answer == 'Y');

}
		break;
	case 3:
		answer = 'y';
		while (Character.toUpperCase(answer) == 'Y') 
		{
	
	//Search Book
	System.out.println("Please enter the book Author");
	BookBean book = bookService.findBookByAuthor(scanner.next());
	if (book != null) {
		System.out.println(book.display());
				//book.getBookId() + " " + book.getBookTitle() + " " + book.getBookAuthor() + " " + book.getPrice());
	} else {
		System.out.println("Book not found!");
	}
	System.out.print("\n Do you want to Search More BookIDs (y or n)?");


	answer = keyboard.next().charAt(0);

	if (answer == 'Y');

}
		break;
		
	case 4:
		answer = 'y';
		while (Character.toUpperCase(answer) == 'Y') 
		{
	
	//Search Book
	System.out.println("Please enter minimum price");
	Double  n1 = scanner.nextDouble();
	//bookBean.setPrice(scanner.nextDouble());
	System.out.println("Please enter Maximumprice");
	//bookBean.setPrice(scanner.nextDouble());
	Double  n2 = scanner.nextDouble();
	//BookBean n2=scanner.nextDouble();
	 List<BookBean> bookprice = bookService.findBookWithPriceRange(n1,n2);
	if (bookprice != null) {
		System.out.println(((BookBean) bookprice).display() );
		//		book.getBookId() + " " + book.getBookTitle() + " " + book.getBookAuthor() + " " + book.getPrice());
	} else {
		System.out.println("Book not found!");
	}
	System.out.print("\n Do you want to Search More Books In Different Price Range (y or n)?");


	answer = keyboard.next().charAt(0);

	if (answer == 'Y');

}
		break;
	case 5:
		answer = 'y';
		while (Character.toUpperCase(answer) == 'Y') 
		{

			System.out.println("Please enter BookID you to want to Delete ");
			bookService.deleteById(scanner.nextInt());
			
	
				System.out.println("Book Successfully Deleted!");
			


			System.out.print("\n Do you want to Search More Book Ids (y or n)?");


			answer = keyboard.next().charAt(0);

			if (answer == 'Y');

		}
		break;
	case 6:
		System.out.println("PROGRAM EXITED!!");
		System.exit(0);	
	
	}
	
	}
}

}

