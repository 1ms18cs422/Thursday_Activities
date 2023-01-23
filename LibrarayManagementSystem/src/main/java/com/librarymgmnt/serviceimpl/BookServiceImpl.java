package com.librarymgmnt.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.librarymgmnt.dto.BookDTO;
import com.librarymgmnt.entities.Book;
import com.librarymgmnt.exceptions.BookNotFoundException;
import com.librarymgmnt.repositories.BookRepository;
import com.librarymgmnt.service.BookService;


@Service
public class BookServiceImpl implements BookService {
	@Autowired
	BookRepository bookRepository;
	public Book saveBook(BookDTO bookDTO) {
		Book book=Book.builder()
				.bookTitle(bookDTO.getBookTitle())
				.bookAuthor(bookDTO.getBookAuthor())
				.bookPubclication(bookDTO.getBookPubclication())
				.bookPrice(bookDTO.getBookPrice())
				.student(bookDTO.getStudent())
				.build();
		return bookRepository.save(book);
	}


	public String deleteBook(Integer id) {
		
		bookRepository.deleteById(id);
		return "Deleted one record successully";
		
	}


	public String updateBook(BookDTO bookDTO, Integer id) {
		Book book=bookRepository.findById(id).get();
		Book bookObj=Book.builder()
				.bookTitle(bookDTO.getBookTitle())
				.bookAuthor(bookDTO.getBookAuthor())
				.bookPubclication(bookDTO.getBookPubclication())
				.bookPrice(bookDTO.getBookPrice())
				.student(bookDTO.getStudent())
				.build();
		bookRepository.save(bookObj);
		return "Updated successfully";

	}

	
	public Book getBookById(Integer id) {
	
		return bookRepository.findById(id).orElseThrow(()->new BookNotFoundException("no book exist with the given id:"+id));
		
	}

	
	public List<Book> getAllBooks() {
		
		return bookRepository.findAll();
	}

	public String deleteAllBooks() {
		
		bookRepository.deleteAll();
		return "Deleted successfully";
		
		

	}

}
