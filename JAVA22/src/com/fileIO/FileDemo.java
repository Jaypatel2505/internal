package com.fileIO;
/*
 * File is a class
 */
import java.io.File;
import java.io.IOException;

class FDemo{
	File file;
	
	public FDemo() {
		file = new File("file3.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		display();
	}
	
	public void display() {
		System.out.println("Is file or not: "+file.isFile());
		System.out.println("Is directory or not: "+file.isDirectory());
		System.out.println("Is directory or not: "+file.isDirectory());
		System.out.println("Can write or not: "+file.canWrite());
		System.out.println("Can read or not: "+file.canRead());
		System.out.println("File name: "+file.getName());
		System.out.println("File path: "+file.getPath());
		System.out.println("Get absolute file path: "+file.getAbsolutePath());
	}
}
public class FileDemo {
	public static void main(String[] args) {
		new FDemo();
	}
}
