package com.keyword;
/*
 * Final : Constant at Value side
 * 
 * Using With:
 * - Variable : Constant at Value side
 * 	 1. Value must be given at the time of declaration.
 * 	 2. At runtime as well as at compile time value can't be changed.
 * 
 * - Class : Opposite of abstract Class
 * 
 * - Method : Opposite of abstract Method
 */

final class FDemo{
	int id;
	final String app_name = "Tops Technologies";
	
	public final void show() {
		System.out.println("ID is :"+id);
		System.out.println("Name is :"+app_name);
	}
}
//class Demos extends FDemo{
//	public void setData() {
//		id = 123;
//	}
//}
public class FinalDemo {
	public static void main(String[] args) {
		FDemo fd = new FDemo();
		fd.show();
	}
}
