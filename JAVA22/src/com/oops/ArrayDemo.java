package com.oops;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Array : It's Collection of data of similar type
 * 1. Start with index 0
 * 2. Size = length - 1
 * 3. If data enter is greater than the size then it will give exception ArrayIndexOutOfBound().
 * 
 * Types Of Array
 * 1. 1D Array
 * 2. 2D Array
 * 3. Jagged/ragged Array
 * 
 * 
 * new
 */
public class ArrayDemo {
	public static void main(String[] args) {
		// Syntex : datatype[] [variable_name] = new datatype[size];
		
		int[] a = new int[5];
		
		for (int i = 0; i <= 4; i++) {
			a[i] = i+1;
			System.out.println("the"+a[i]);
		}
		
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}
		
		// 23 4 67 2 5 {Sorting Number - Selection Sort}
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		System.out.println("Enter the values");
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
//		for (int i = 0; i < num.length; i++) {
//			for (int j = 0; j < num.length; j++) {
//				if (num[i]>num[j]) {
//					int temp = num[i];
//					num[i] = num[j];
//					num[j] = temp;
//				}
//			}
//		}
		Arrays.sort(num);
		System.out.println("Sorted Array");
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}

}
