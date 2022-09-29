package com.cogent.service;

import java.util.List;

import com.cogent.bean.BookBean;
import com.cogent.repo.BookRepo;
import com.cogent.repo.BookrepoImpl;

/**
 * @author samuelkawuma
 *Sep 28, 2022
 *12:09:50 PM
 */

public class BookServiceImpl implements BookService {
	BookRepo bookRepo = new BookrepoImpl();
	@Override
	public void addBook(BookBean bookBean) {
		// TODO Auto-generated method stub
		//BookRepo bookRepo = new BookRepoRepoImpl();
		bookRepo.addBook(bookBean);

	}

	@Override
	public void deleteById(int bookId) {
		// TODO Auto-generated method stub
		bookRepo.deleteById(bookId);
	}

	@Override
	public BookBean findBookById(int bookId) {
		// TODO Auto-generated method stub
		return bookRepo.findBookById(bookId);
	}

	@Override
	public BookBean findBookByAuthor(String author) {
		// TODO Auto-generated method stub
		return findBookByAuthor(author);
	}

	@Override
	public List<BookBean> findBookWithPriceRange(double miniPrice, double maxPrice) {
		// TODO Auto-generated method stub


		return bookRepo.findBookWithPriceRange(miniPrice, maxPrice);
	}

}

