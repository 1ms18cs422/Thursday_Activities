package com.springormwithmapping.entitiy;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@Entity
@NoArgsConstructor

public class Book {
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int bookId;
	private String bookName;
	private double price;
	/*@ManyToOne(cascade=CascadeType.ALL)
	
	Library library;
	
	public Library getLibrary() {
		return library;
	}
	public void setLibrary(Library library) {
		this.library = library;
	}*/
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="bookId")
Library library;
	
	public Library getLibrary() {
		return library;
	}
	public void setLibrary(Library library) {
		this.library = library;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Book(int bookId, String bookName, double price) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.price = price;
	}
	

}
