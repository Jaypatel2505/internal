package com.oops;
/*
 * Inheritance : Making a class with the help of another class deriving the attribute of some other class.
 * - Re-Usability
 * - Extensibility
 * - Less object Creation
 * - Use "extends" keyword to inherit the parent class
 * 
 * Types of Inheritance :
 * 1. Single : One parent one child
 * 2. Multilevel : One grandparent one parent one child
 * 3. Hierarchical : On parent multiple child(Code will in InheritanceDemo2 file)
 * 4. Multiple : Multiple parent single child(Not directly supported in JAVA)
 * 5. Hybrid : Combination of any two types
 * 
 * Object will be created for last only
 */
class Students{
	protected int id;
	protected String name;
	
	public void setData() {
		id = 1;
		name = "Ajay";
	}	
}
class Sports extends Students{
	int sport_marks = 85;
	
//	public void show() {
//		System.out.println("ID is :"+id);
//		System.out.println("Name is :"+name);
//		System.out.println("Sport Marks is :"+sport_marks);
//		
//	}
}
class Result extends Sports{
	String grade = "A+";
	
	public void show() {
		System.out.println("ID is :"+id);
		System.out.println("Name is :"+name);
		System.out.println("Sport Marks is :"+sport_marks);
		System.out.println("Grade is :"+grade);
	}
}
public class InheritanceDemo {
	public static void main(String[] args) {
//		Sports sp = new Sports();
//		sp.setData();
//		sp.show();
		
		Result rs = new Result();
		rs.setData();
		rs.show();
	}
}
