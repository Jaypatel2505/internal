package com.exception;
/*
 * Exception : Any Abnormal Condition
 * - Exception class is a root class for all exception
 * 1. Compile time error : Syntax error, ; , } is missing
 * 2. Run time error : Arithmetic Exception, ArrayIndexOutOfBound, NumberFormatException, Etc.
 * 3. Error: Developer Mistake
 * 
 * Keyword:
 * 1. try:
 * - If you doubt that a code may have error it should written in try block.
 * - The code which have error will be skipped and remaining code must be executed.
 * - try throw the error to catch block
 * - try must be followed by catch block or finally or both.
 * 2. catch:
 * - whenever error is thrown by try block catch block handle the error.
 * - there may multiple catch
 * 3. finally:
 * - whether error is there or not finally block will be executed.
 * 4. throw
 * 5. throws
 */
public class ExceptionDemo {
	public static void main(String[] args) {
		int a=10, b=0;
//		int[] num = new int[3];
		
		try {
			System.out.println("Division is: "+a/b);
//			for (int i = 0; i <6; i++) {
//				num[i]=i+1;
//				System.out.println(num[i]);
//			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
//		catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
//		}
		finally {
			System.out.println("This code is written by Jay");
			System.out.println("Ph No is 26677889908");
		}
	}
}
