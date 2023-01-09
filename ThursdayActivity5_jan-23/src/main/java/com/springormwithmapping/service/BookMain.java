package com.springormwithmapping.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.springormwithmapping.Dao.BookDao;
import com.springormwithmapping.Dao.LibraryDao;
import com.springormwithmapping.entitiy.Book;
import com.springormwithmapping.entitiy.Library;

public class BookMain {

	public static void main(String[] args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("Bean1.xml");
		BookDao bdao=(BookDao)app.getBean("bookDaoImpl");
		
		Book b1=new Book(1,"java programming",678.50);
		Book b2=new Book(2,"C++ programming",890.50);
		Book b3=new Book(3,"Python",908.80);
		
		bdao.insertBook(b1);
		bdao.insertBook(b2);
		bdao.insertBook(b3);
		
		LibraryDao ldao=(LibraryDao)app.getBean("libraryDaoImpl");
		
		Library l1=new Library(1,"Information-Library",2);
		Library l2=new Library(2,"Science-Library",1);
		
	ldao.insertLibrary(l1);
	ldao.insertLibrary(l2);
		
		
		
		
		
		

	}

}
