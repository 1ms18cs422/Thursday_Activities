package com.ActivityQuestion3;

import java.util.ArrayList;
import java.util.List;

public class BookStore {
	//printing by normal static display method
	public static void display(Book b) {
		System.out.println("Book Title:"+ b.title);
		System.out.println("Book Author:"+ b.author);
		System.out.println("Book Price:"+ b.price);
		System.out.println("-------------------------------------");
	}
	
	

	public static void main(String[] args) {
		Book b1=new Book("java programming","Balaguruswamy",560.9);
		display(b1);
		List <Book> b=new ArrayList<>();
		b.add(new Book("core java","Satish",700.0));
		b.add(new Book("All in One","Sumiya",900.0));
		b.add(new Book("general Knowledge","shashidar",850.0));
		b.add(new Book("robotics","Shivam",1050.0));
		b.add(new Book("Good thoughts","raghuveer",670.0));
		//displaying elements by enhanced for loop
		for(Book book:b)
		{
			System.out.println(book.title+" "+book.author+" "+book.price);
		}
		//searching book by title
		for(Book book1:b) {
			if(book1.title.contains("All in One")) {
				System.out.println("Book Available "+book1.title+" "+book1.author+" "+book1.price);
			}
			
		}
		//searching book by author
		for(Book book2:b) {
			if(book2.author.contains("raghuveer")) {
				System.out.println("Author Name found "+book2.title+" "+book2.author+" "+book2.price);
			}
			
			
		
			
		}
		
		
		
		
		
		
	}

}
