package com.oops;
import java.util.Scanner;
/*
 * Jagged Array:
 * - Same as 2D array
 * - No. of row is fixed but no. of columns is not fixed
 * 
 * 1 2 3
 * 1 2 3 4 5
 * 1 2
 * ------------------------------
 * 1 2
 *   1 2 3
 * 1 2 3 4 5
 *     2 3 4
 */
public class JaggedArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nrow,ncol;
		System.out.println("Enter the no. of row:");
		nrow = sc.nextInt();
		
		int[][] a = new int[nrow][];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter no. of column in Row no. "+(i+1)+":");
			ncol = sc.nextInt();
			a[i] = new int[ncol];
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println("Enter the value in Row["+(i+1)+"]["+(j+1)+"]");
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
	}
}
