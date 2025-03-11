package com;

import com.model.Author;
import com.model.Book;

public class Main {
	public static void main(String[] args) {
		Book book=new Book();
		book.setTitle("Complete Java");
		Author author=new Author();
		author.setName("Reff");
		book.setAuthor(author);
		System.out.println(book);
		
	}

}
