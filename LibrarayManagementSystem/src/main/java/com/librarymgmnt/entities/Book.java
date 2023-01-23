package com.librarymgmnt.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Book_Table")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	 private Integer bookId;
	@Column(name="Title",length=20)
	 private String bookTitle;
	@Column(name="Author",length=20)
	 private String bookAuthor;
	@Column(name="Publication",length=20)
	 private String bookPubclication;
	@Column(name="Price",length=5)
	 private String bookPrice;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="studentId")
	private Student student;
	

}
