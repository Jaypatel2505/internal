package com.oops;
/*
 * OOP : Object Oriented Programming
 * 1. To organize the code
 * 2. To create less object
 * 3. Reduce code redundancy
 * 
 * Concept of OOPS
 * 1. Class
 * 2. Object
 * 3. Encapsulation
 * 4. Inheritance
 * 5. Polymorphism
 * 6. Abstraction
 * 
 * 1. Class : It is a collection of data member and member function.
 * 2. Object : It gives the permission to access functionality of class.
 * 3. Encapsulation : Wrapping of data
 * 		Access Specifier
 * 		1. private : Only access within a class
 * 		2. protected : only access given to the child
 * 		3. default : only accessible within a package
 * 		4. Public : accessible everywhere
 * 5. Polymorphism: One name multiple form
 * 		1. Function overloading : Same Func. name but diff. parameter
 * 		2. Function overriding 
 */
class Student{
	private int roll_no;
	private String name;

	public void setData() {
		roll_no = 1;
		name = "Jay";
	}
	
	public void display() {
		System.out.println("Roll No is: "+roll_no);
		System.out.println("Name is: "+name);
	}
}
public class ClassDemo {
	public static void main(String[] args) {
		//class_name obj_name = new class_name();
		Student s1 = new Student();
		s1.setData();
		s1.display();
		
		// System.out.println("Roll no is :"+s1.roll_no);  : Due type is private system not allow to access out of class
		// System.out.println("Name is :"+s1.name);  : Due type is private system not allow to access out of class
	}

}
