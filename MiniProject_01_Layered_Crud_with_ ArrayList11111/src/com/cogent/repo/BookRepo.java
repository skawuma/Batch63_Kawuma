package com.cogent.repo;

import java.util.List;

import com.cogent.bean.BookBean;

/**
 * @author samuelkawuma
 *Sep 28, 2022
 *11:56:16 AM
 */

public interface BookRepo {


	public void addBook(BookBean bookbean);
	public void	deleteById(int bookId) ;
	public BookBean findBookById(int bookId);
	public BookBean findBookByAuthor(String author);
	public List<BookBean>findBookWithPriceRange (double miniPrice, double maxPrice);


}

