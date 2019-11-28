package com.ustglobal.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustglobal.springcore.config.BookConfig;
import com.ustglobal.springcore.config.ConfigurationClass;
import com.ustglobal.springcore.di.Author;
import com.ustglobal.springcore.di.Book;

public class BookAnnotation {
	
	public static void main(String[] args) {
		

		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(BookConfig.class);
		
		Book book = context.getBean(Book.class);
		System.out.println(book.getName());
		System.out.println(book.getPrice());
		System.out.println(book.getAuthor().getName());
		System.out.println(book.getAuthor().getAddress());
		
//		context.close();
		

	}

}
