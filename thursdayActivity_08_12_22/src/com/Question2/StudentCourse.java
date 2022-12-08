package com.Question2;

import java.util.Map;
import java.util.TreeMap;

public class StudentCourse {

	public static void main(String[] args) {
		//Creating TeeMap to Add elements 
		TreeMap<Integer,String> course=new TreeMap<>();
		course.put(100,"Java");
		course.put(101,"python");
		course.put(99,"networks");
		course.put(102,"Data Science");
		course.put(103,"Artificial Intelligence");
		System.out.println(course);
		//copying a Tree Map content to another Tree Map
		TreeMap<Integer,String> course1=new TreeMap<>();
		course1.put(201,"Springs");
		course1.put(200, "Jango Springs");
		course.putAll(course1);
		System.out.println("-------------------------------------");
		for(Map.Entry e : course.entrySet())
		{
			System.out.println(e.getValue()+" "+e.getKey());
			
		}
		
		//To search a key in a Tree Map.
		System.out.println(course.containsKey(101));
		//To search a value in a Tree Map
		System.out.println(course.containsValue("Java"));
		//To get a reverse order view of the keys contained in a given map
		
		System.out.println(course.descendingKeySet());
		
		//To get the least key-value in a map.
		System.out.println("least entry in map"+course.firstEntry());
		//To get the Greatest key-value in a map.
		System.out.println("greates entry in map"+course.lastEntry());
		//to remove and get a key-value mapping associated with the least key in a map.
		System.out.println(course.pollFirstEntry());
		//to remove and get a key-value mapping associated with the greatest key in this map
		System.out.println(course.pollLastEntry());
		System.out.println("After Removing Greatest and Least element");
		System.out.println(course);
		
	

	}

}
