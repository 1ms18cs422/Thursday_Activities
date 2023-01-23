package com.librarymgmnt.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.librarymgmnt.dto.BookDTO;
import com.librarymgmnt.entities.Book;

import com.librarymgmnt.serviceimpl.BookServiceImpl;



 

@RestController
public class BookController {
	@Autowired
	BookServiceImpl bookServiceImpl;
	@PostMapping(path="/books")
	ResponseEntity<Book> insertBook(@RequestBody @Valid BookDTO bookDTO) {
		
	
			return new ResponseEntity<Book> (bookServiceImpl.saveBook(bookDTO),HttpStatus.CREATED);
	
		
	}
	
	@GetMapping(path="/book/{bookId}")
	 public ResponseEntity<Book> getBookById(@PathVariable Integer bookId)
	{
		return new ResponseEntity<>(bookServiceImpl.getBookById(bookId),HttpStatus.OK);
	}
	@GetMapping(path="/books")
	public ResponseEntity<List<Book>> getAllBooks()
	{
		return new ResponseEntity<>(bookServiceImpl.getAllBooks(),HttpStatus.OK);
	}
	@PutMapping(path="/books/{bookId}")
	 public ResponseEntity<String> updateBook(@RequestBody @Valid BookDTO bookDTO , @PathVariable Integer bookId)
		{
		 return new ResponseEntity<>(bookServiceImpl.updateBook(bookDTO, bookId),HttpStatus.CREATED);
		}
	 @DeleteMapping(path="/book/{bookId}")
	 public ResponseEntity<String> deleteBook(@PathVariable Integer bookId)
		{
		 
		 return new ResponseEntity<>(bookServiceImpl.deleteBook(bookId),HttpStatus.OK);
		}
	 @DeleteMapping(path="/books")
	 public ResponseEntity<String> deleteAllBooks()
	 {
		 return new ResponseEntity<>(bookServiceImpl.deleteAllBooks(),HttpStatus.OK);
	 }
	 
	 
	 
	
	

}


