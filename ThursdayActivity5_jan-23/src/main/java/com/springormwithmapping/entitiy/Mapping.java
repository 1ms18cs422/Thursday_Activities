package com.springormwithmapping.entitiy;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class Mapping {
public static void main(String args[])
{
	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	Session session=factory.openSession();
	session.beginTransaction();
	

	
	Book b1=new Book();
	b1.setBookName("java programming");
	b1.setPrice(400);
	
	Book b2=new Book();
	b2.setBookName("C programming");
	b2.setPrice(350);
	
	Book b3=new Book();
	b3.setBookName("operating system");
	b3.setPrice(500);
	
	List<Book> list=new ArrayList<Book>();
	list.add(b1);
	list.add(b2);
	list.add(b3);
	
	Library l1=new Library();
	l1.setLibraryId(1);
	l1.setLibraryName("what are the types of book library contains?");
	l1.setNoOfBooks(200);
	
	
	l1.setBooks(list);
	
	
	//l1.setBook(b1);
	b1.setLibrary(l1);
	
	
	session.save(l1);
	session.save(b1);
	session.save(b2);
	session.save(b3);
	
	session.getTransaction().commit();
	session.close();
	factory.close();
	
	
}
}
