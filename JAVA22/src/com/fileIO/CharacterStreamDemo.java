package com.fileIO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*
 * 2. Character stream : 2 Byte/char
 * 		1. FileWriter
 * 		   - To write data into file
 * 		2. FileReader
 * 		   - To read data from the file
 */
public class CharacterStreamDemo {
	public static void main(String[] args) {
		try {
			// To Open and Create file
			FileWriter fw = new FileWriter("file2.txt",true);
			String msg = "\n This is Tops tech Surat Ring Road";
			//To write into the file
			fw.write(msg);
			//File close
			fw.close();
			System.out.println("Data Written");
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		try {
			// To Open and Create file
			FileReader fd = new FileReader("file2.txt");
			int x;
			while ((x=fd.read())!=-1) {
				System.out.print((char)x);
			}
			//File close
			fd.close();
			System.out.println("Data Written");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
