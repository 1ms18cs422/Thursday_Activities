package com.springormwithmapping.entitiy;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Library {
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int libraryId;
	private String libraryName;
	private int noOfBooks;
	List<Book> books;

	

	//@OneToOne(cascade=CascadeType.ALL)

	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="libraryId")
	

	
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	public int getLibraryId() {
		return libraryId;
	}
	public void setLibraryId(int libraryId) {
		this.libraryId = libraryId;
	}
	public String getLibraryName() {
		return libraryName;
	}
	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}
	public int getNoOfBooks() {
		return noOfBooks;
	}
	public void setNoOfBooks(int noOfBooks) {
		this.noOfBooks = noOfBooks;
	}
	@Override
	public String toString() {
		return "Library [libraryId=" + libraryId + ", libraryName=" + libraryName + ", noOfBooks=" + noOfBooks + "]";
	}
	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Library(int libraryId, String libraryName, int noOfBooks) {
		super();
		this.libraryId = libraryId;
		this.libraryName = libraryName;
		this.noOfBooks = noOfBooks;
	}
	
	

}
