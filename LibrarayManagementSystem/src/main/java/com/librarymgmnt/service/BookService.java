package com.librarymgmnt.service;

import java.util.List;

import com.librarymgmnt.dto.BookDTO;
import com.librarymgmnt.entities.Book;


public interface BookService {
	Book saveBook(BookDTO bookDTO);
	String deleteBook(Integer id);
	String updateBook(BookDTO bookDTO,Integer id);
	Book getBookById(Integer id);
	List<Book> getAllBooks();
	String deleteAllBooks();

}
