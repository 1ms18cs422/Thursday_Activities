package com.springormwithmapping.Dao;

import com.springormwithmapping.entitiy.Book;

public interface BookDao {
	int insertBook(Book b);
	int updateBook(Book ubook);

}
