package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

// Public class accessible from Student.java file
public class GenericDemo2 {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		// Set S1 Data
		s1.setId(1);
		s1.setName("Jay");
		s1.setCity("Surat");
		s1.setBranch("IT");
		// Set S2 data
		s2.setId(2);
		s2.setName("Ajay");
		s2.setCity("New Surat");
		s2.setBranch("IT - Coder");
		
		ArrayList<Student> a1 = new ArrayList<Student>();
		
		a1.add(s1);
		a1.add(s2);
		
		System.out.println(a1);				// Without Iterator get data and print
		
		Iterator<Student> i1 = a1.iterator();
		
		while (i1.hasNext()) {
			Student s = (Student) i1.next();
			System.out.println("ID is: "+s.getId());
			System.out.println("Name is: "+s.getName());
			System.out.println("Branch is: "+s.getBranch());
			System.out.println("City is: "+s.getCity());
			System.out.println();
		}
		
	}
}
