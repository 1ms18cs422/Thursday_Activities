package com.librarymgmnt.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentDTO {
	@NotBlank(message="Empty not allowed")
	@NotNull(message="Null not allowed")
	@Size(min=3,max=15,message="Name must be within the range 3-15 characters")
	private String studentName;
	@Pattern(regexp="\\d{10}",message="Invalid phone number")
	private String phoneNumber;
	@Email(message="Invalid email format")
	private String studentEmail;
	@NotBlank(message="Empty not allowed")
	private String studentAddress;
	@Min(value=1,message="Age should be grater than zero")
	@Max(value=200,message="age should be lesser than 200")
	private Integer studentAge;

}
