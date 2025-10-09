package com.jsp.bookcrud.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
	@Id
	int bookid;
	String bookname;
	String author;
	double price;
	int yopub;
	
	public Book() {
		super();
	}

	public Book(int bookid, String bookname, String author, double price, int yopub) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.author = author;
		this.price = price;
		this.yopub = yopub;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getYopub() {
		return yopub;
	}

	public void setYopub(int yopub) {
		this.yopub = yopub;
	}
	
	
	
  
}
