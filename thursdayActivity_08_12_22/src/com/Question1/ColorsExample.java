package com.Question1;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

//import com.collectionExamples.Student;
//import com.collectionExamples.StudentNameComparator;

public class ColorsExample {

	public static void main(String[] args) {
		//Creating TreeSet to add Elements
		TreeSet<String> color=new TreeSet<String>();
		//To add colors into set
		color.add("purple");
		color.add("blue");
		color.add("red");
		color.add("green");
		color.add("yellow");
		//To print colors into set
		Iterator<String> itr=color.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//adding all the elements of a specified tree set to another tree set
		TreeSet<String> color1=new TreeSet<String>();
		color1.add("pink");
		color1.add("white");
		color.addAll(color1);
		System.out.println(color);
		//Creating reverse order of elements
		Iterator<String> itr1=color.descendingIterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		//Comparing two sets
		
		
		/*Collections.(color,new ColorComparator());
		for(Color c:color)
		{
			System.out.println(c.getColorName()+" ");
		}*/
		//
		//Getting the first and last elements in a tree set
		System.out.println("First element in the Set:"+color.pollFirst());
		System.out.println("Last element in the Set:"+color.pollLast());
		
		
		

	}

}
