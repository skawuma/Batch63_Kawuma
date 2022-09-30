package com.cogent.repo;

import java.util.ArrayList;
import java.util.List;

import com.cogent.bean.BookBean;

/**
 * @author samuelkawuma
 *Sep 28, 2022
 *12:08:17 PM
 */

public class BookrepoImpl implements BookRepo {

	//ArrayList list = new ArrayList();
	
	List<BookBean> books = new ArrayList();
	{
		books.add(new BookBean(1, "Learn Java in 2 mins", "Samuel", 110));
		books.add(new BookBean(2, "Learn Spring in 2 mins", "Bryan", 210));
		books.add(new BookBean(3, "Learn Angular in 2 mins", "Ashley", 250));
	}

	// Repository or Database
	//List<BookBean> books = new ArrayList<>();
	@Override
	public void addBook(BookBean bookbean) {
		books.add(bookbean);
		// TODO Auto-generated method stub

		
	}

	@Override
	public void deleteById(int bookId) {
		BookBean book=null;
		for(int i=0; i<books.size();i++) {
			book=books.get(i);
			if(book.getBookId()==bookId)
				books.remove(bookId);		
		}
	

	}

	@Override
	public BookBean findBookById(int bookId) {
		BookBean book=null;
		for(int i=0; i<books.size();i++) {
			book=books.get(i);
			if(book.getBookId()==bookId) {
				System.out.println("Book Found in Repository");
				return book;
			}
			book=null;
		}
		return book;
	}
	

	@Override
	public BookBean findBookByAuthor(String author) {
		
		BookBean book= null;
		for (int i=0; i< books.size(); i++) {
			
			book=books.get(i);
			if (book.getBookAuthor()== author) {
				System.out.println("Book Found in Repository");
				return book;
			}
			book= null;
		}
		return book;
	}

	@Override
	public List<BookBean> findBookWithPriceRange(double miniPrice, double maxPrice) {
		//List<BookBean> books = new ArrayList();
		BookBean bookprice =null;
		for(int i=0; i<books.size();i++) {
			bookprice =books.get(i);
			if(bookprice.getPrice() >= miniPrice && bookprice.getPrice() <= maxPrice ) {
				System.out.println(" The List Books Found in Repository are");
				return books;
			}
			books =null;
		}
		return books;	
	


}
}

