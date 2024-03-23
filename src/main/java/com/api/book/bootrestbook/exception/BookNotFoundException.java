package com.api.book.bootrestbook.exception;

public class BookNotFoundException extends Exception {

	public BookNotFoundException()

	{
		System.out.println("this is normal constructor");
	}

	public BookNotFoundException(String message) {
		super(message);
	}

}
