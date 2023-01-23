package com.librarymgmnt.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.librarymgmnt.entities.Student;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookDTO {
	
	@NotBlank(message="Empty not allowed")
	@NotNull(message="Null not allowed")
	 private String bookTitle;
	@NotNull(message="Null not allowed")
	 private String bookAuthor;
	@NotNull(message="Null not allowed")
	 private String bookPubclication;
	@Pattern(regexp="\\d{3}",message="Give book price with 3 digits only")
	
	 private String bookPrice;
	
	private Student student;
	 

}
