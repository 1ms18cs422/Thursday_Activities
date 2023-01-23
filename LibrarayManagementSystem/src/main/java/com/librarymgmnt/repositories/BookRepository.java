package com.librarymgmnt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.librarymgmnt.entities.Book;

public interface BookRepository extends JpaRepository<Book,Integer>{

}
