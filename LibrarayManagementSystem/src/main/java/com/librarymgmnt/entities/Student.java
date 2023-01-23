package com.librarymgmnt.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Student_Table")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer studentId;
	@Column(name="Name",length=20)
	private String studentName;
	@Column(name="PhoneNo",length=10)
	private String phoneNumber;
	@Column(name="Email",length=20)
	private String studentEmail;
	@Column(name="Address",length=30)
	private String studentAddress;
	@Column(name="Age",length=3)
	private Integer studentAge;

}
