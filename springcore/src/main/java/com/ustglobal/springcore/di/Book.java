package com.ustglobal.springcore.di;

import org.springframework.beans.factory.annotation.Autowired;

public class Book {
	private String name;
	private int price;
	@Autowired
	private Author author;
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public Author getAuthor() {
		return author;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	

}
