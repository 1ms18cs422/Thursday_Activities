package com.question1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class StudentMain {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
		session.beginTransaction();
		
		//Illustrating insertion
		Student sobj=new Student();
		sobj.setRoll_no(200);
		sobj.setName("maunika");
		sobj.setMarks(99.90);
		
		Student s1obj=new Student();
		s1obj.setRoll_no(500);
		s1obj.setName("sumaiya");
		s1obj.setMarks(78.90);
		session.save(sobj);
		session.getTransaction().commit();
		System.out.println("inserted successfully");
		
		//Illustrating Select
	
		/*session.beginTransaction();
		Student sobj=session.get(Student.class,1);
		System.out.println(sobj.getName());
		Student sobj1=session.get(Student.class,1);
		
		System.out.println(sobj1.getName());*/
		
		//Illustrating delete
		session.beginTransaction();
		Student s2=session.get(Student.class, 1);
		session.delete(s2);
		session.getTransaction().commit();
		session.clear();
				
		//Illustrating Update
		
		session.beginTransaction();
		Student s3=session.get(Student.class, 1);
		if(s3!=null) {
					s3.setName("saaniya");
					s3.setMarks(99.80);
					session.saveOrUpdate(s3);
					session.getTransaction().commit();
				}
				System.out.println("Id not found");
				session.close();
				
			}

				
	}


