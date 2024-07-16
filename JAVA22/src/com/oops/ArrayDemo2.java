package com.oops;
/*
 * 2D Array
 * - Combination of Row and Column
 * 		int[row][col]
 */
public class ArrayDemo2 {
	public static void main(String[] args) {
		/*
		 * 1 2 3
		 * 1 2 3
		 * 1 2 3
		 */		
		int[][] a=new int[4][4];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = j+1;
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		/*
		 * 4 5 6
		 * 4 5 6
		 * 4 5 6
		 */
		int[][] b=new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				b[i][j] = j+4;
				System.out.print(" "+b[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Sum of 2 Arrays");
		int[][] c = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(" "+c[i][j]);
			}
			System.out.println();
		}
	}
}