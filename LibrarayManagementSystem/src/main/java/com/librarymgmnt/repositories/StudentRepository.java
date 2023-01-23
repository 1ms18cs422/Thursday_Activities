package com.librarymgmnt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.librarymgmnt.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
