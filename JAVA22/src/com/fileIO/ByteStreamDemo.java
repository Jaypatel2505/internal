package com.fileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * File : 
 * - It is a class
 * - If we want to store the data permanent we use file
 * - We use stream to store data permanent
 * 	 - Stream : It is medium to store data
 * If source has the data destination will have too
 * 
 * 1. Byte stream : 1 Byte/char
 * 		1. FileOutputStream
 * 		   - To write data into the file
 * 		2. FileInputStream
 * 		   - To read data from the file
 * 2. Character stream : 2 Byte/char
 * 		1. FileWriter
 * 		   - To write data into file
 * 		2. FileReader
 * 		   - To read data from the file
 * 
 * Steps:
 * 1. To Open a file into particular class
 * 2. Write/Read into/from the file
 * 3. To close file
 * 
 * Must have error handle
 * IOException
 * FileNotFoundException
 */
public class ByteStreamDemo {
	public static void main(String[] args) {
		try {
			//To open and create file
			FileOutputStream fos = new FileOutputStream("File1.txt",true);
			String msg = "\n This is tops Technologies...Surat";
			byte[] bb = msg.getBytes();			// Get Bytes
			// To write into the file
			fos.write(bb);
			// To close file
			fos.close();
			System.out.println("Data Written");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		try {
			FileInputStream fis = new FileInputStream("file1.txt");
			int x;
			while ((x=fis.read())!=-1) {
				System.out.print((char)x);
			}
			//3. To close file
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}