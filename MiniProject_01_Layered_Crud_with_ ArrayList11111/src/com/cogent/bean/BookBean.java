package com.cogent.bean;

/**
 * @author samuelkawuma
 *Sep 28, 2022
 *11:51:55 AM
 */

public class BookBean {

	private int bookId;
	private String bookTitle;
	private String bookAuthor;
	private double  price;
	/**
	 * 
	 */
	public BookBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the bookId
	 */
	public int getBookId() {
		return bookId;
	}
	/**
	 * @param bookId the bookId to set
	 */
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	/**
	 * @return the bookTitle
	 */
	public String getBookTitle() {
		return bookTitle;
	}
	/**
	 * @param bookTitle the bookTitle to set
	 */
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	/**
	 * @return the bookAuthor
	 */
	public String getBookAuthor() {
		return bookAuthor;
	}
	/**
	 * @param bookAuthor the bookAuthor to set
	 */
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @param bookId
	 * @param bookTitle
	 * @param bookAuthor
	 * @param price
	 */
	public BookBean(int bookId, String bookTitle, String bookAuthor, double price) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.price = price;
	}
	
	public String display() {
		return "BookBean [bookId=" + bookId + ", bookTitle=" + bookTitle + ", bookAuthor=" + bookAuthor + ", price="
				+ price + "]";
	}

}

