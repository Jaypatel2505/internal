package com.task;

public class YoungestPerson {
public static void main(String[] args) {
	int ram = 30, shyam = 40, ajay = 20;
	
	if(ram<=shyam&&ram<=ajay){
		System.out.println("Ram is young");
	}else if (shyam<=ajay&&shyam<=ram) {
		System.out.println("Shyam is Young");
	}else {
		System.out.println("Ajay is young");
	}
}
}