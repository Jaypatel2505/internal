package com.keyword;
/*
 * 1. Super (Code will available in ConstructorChaining file)
 * 2. Abstract
 * 3. Final (Definition & Code will available in FinalDemo File)
 * 4. This (Definition & Code will available in ThisDemo File)
 * 5. Static (Definition & Code will available in StaticDemo File)
 * 6. Interface (Definition & Code will available in InterDemo & IDemo File)
 * 
 * 
 * 1. Super : Call the function of immediate parent & use super keyword
 * 2. Abstract : Details are hidden only essential information is shown
 * - Use with class:
 * 	 1. Abstract class can't create object
 * 	 2. Must inherit into some other class
 */
abstract class ADemo{
	int roll_no;
	String name;
	
	public void setData() {
		roll_no = 123;
		name = "Jay";
	}
	public abstract void show();
}
class Demo extends ADemo{
	@Override
	public void show() {
		System.out.println("Roll No is "+roll_no);
		System.out.println("Name is "+name);
	}
}
public class AbstractDemo {
	public static void main(String[] args) {
//		ADemo ad = new ADemo();
		
		Demo d1 = new Demo();
		d1.setData();
		d1.show();
	}
}
