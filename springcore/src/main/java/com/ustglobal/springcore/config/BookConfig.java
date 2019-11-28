package com.ustglobal.springcore.config;

import org.springframework.context.annotation.Bean;

import com.ustglobal.springcore.di.Author;
import com.ustglobal.springcore.di.Book;

public class BookConfig {
	@Bean(name="author")
	public Author getAuthor() {
		Author a = new Author();
		a.setName("padmareddy");
		a.setAddress("banglore");
		return  a;
	}
	
	@Bean(name="book")
	public Book getBook() {
		Book b = new Book();
		b.setName("java");
		b.setPrice(200);
		return b;
		
		
		
		
	}

}
