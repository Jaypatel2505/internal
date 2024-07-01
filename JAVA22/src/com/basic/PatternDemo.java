package com.basic;
/* 12345
 * 12345
 * 12345
 * 12345
 * 
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 
 * for i
 * initilization : First no of pattern
 * Condition : Largest/Smallest no in pattern
 * 			   Smallest to Largest <=
 *    		   Largest to smallest >=
 * Incree/Decree : <= then ++
 * 				   >= then --
 * for j
 * initilization : First Col of each row
 * 				   - Same no then that no only
 * 				   - Diff no then upper loop name
 * Condition : Last col of each row
 * 			   - Same no then that no only
 * 			   - Diff no then upper loop name
 * Incree/Decree : <= then ++
 * 				   >= then --
 * 
 * for k:
 * - k completely depends on i
 */
public class PatternDemo {
public static void main(String[] args) {
	for (int i = 1; i <= 4; i++) {
		for (int j = 1; j <= 5; j++) {
			System.out.print(j);
		}
		System.out.println();
	}
	
	/*1
	 *12
	 *123
	 *1234
	 *12345
	 */
	for (int i = 1; i <= 5; i++) {
		for (int j = 1; j <= i; j++) {
			System.out.print(j);
			
		}
		System.out.println();
	}
	
	/*5
	 *45
	 *345
	 *2345
	 *12345
	 */
	for (int i = 5; i >= 1; i--) {
		for (int j = i; j <= 5; j++) {
			System.out.print(j);
			
		}
		System.out.println();
	}
	
	/*5
	 *54
	 *543
	 *5432
	 *54321
	 */
	for (int i = 5; i >= 1; i--) {
		for (int j = 5; j >= i; j--) {
			System.out.print(j);
			
		}
		System.out.println();
	}
	
	/*1
	 *21
	 *321
	 *4321
	 *54321
	 */
	for (int i = 1; i <= 5; i++) {
		for (int j = i; j >= 1; j--) {
			System.out.print(j);		
		}
		System.out.println();
	}
	
	/*1
	 *10
	 *101
	 *1010
	 *10101
	 */
	for (int i = 1; i <= 5; i++) {
		for (int j = 1; j <= i; j++) {
			System.out.print(j%2);
		}
		System.out.println();
	}
	
	/*
	 * 1
	 * 01
	 * 101
	 * 0101
	 * 10101
	 */
	for (int i = 1; i <=5 ; i++) {
		for (int j = i; j <= 1; j++) {
			System.out.print(j%2);
		}
		System.out.println();
	}
	
	/*a
	 *ab
	 *abc
	 *abcd
	 *abcde
	 */
	for (int i = 97; i <= 101; i++) {
		for (int j = 97; j <= i; j++) {
			System.out.print((char)j);
		}
		System.out.println();
	}

	/*0
	 *0-1
	 *0-1-2
	 *0-1-2-3
	 *0-1-2-3-4
	 *0-1-2-3-4-5
	 */
	for (int i = 0; i >= -5; i--) {
		for (int j = 0; j >= i; j--) {
			System.out.print(j);
		}
		System.out.println();
	}
	
	/*
	 *     1
	 *    12
	 *   123
	 *  1234
	 * 12345
	 */
	for (int i = 1; i <= 5; i++) {
		for (int k = i; k <=5; k++) {
			System.out.print(" ");
		}
		for (int j = 1; j <=i; j++) {
			System.out.print(j);
		}
		System.out.println();
	}

	/*
	 *     1
	 *    1 2
	 *   1 2 3
	 *  1 2 3 4
	 * 1 2 3 4 5
	 */
	for (int i = 1; i <= 5; i++) {
		for (int k = i; k <=5; k++) {
			System.out.print(" ");
		}
		for (int j = 1; j <=i; j++) {
			System.out.print(" "+j);
		}
		System.out.println();
	}
	
	
}
}
