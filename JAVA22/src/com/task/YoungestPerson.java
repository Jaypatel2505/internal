package com.task;

public class YoungestPerson {
public static void main(String[] args) {
	int ram = 10, shyam = 1, ajay = 2;
	
	if (ram<=shyam) {
		if (ram<=ajay) {
			System.out.println("Ram is young");
		} else {
			System.out.println("Ajay is young");
		}
	} else if(shyam<=ajay){
		System.out.println("Shyam is young");
	}else {
		System.out.println("Ajay is Young");
	}
}
}
