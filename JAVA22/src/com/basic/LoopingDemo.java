package com.basic;
/*
 * Loop : Iterative & repetitive
 * 
 * 1. Entyr Control
 * 	For
 * 	Syntx : for(initialization; condition; incree/decree)
 * 			{ }
 * 
 * 	while
 * 	Syntx : initialization;
 * 			while(condition){
 * 				statement;
 * 				incree/decree;}
 * 
 * 2. Exit Control
 * 	Do while
 * 	Syntx : initialization;
 * 			do{
 * 				statement;
 * 				incree/decree;
 * 			  }while(condition);
 */
public class LoopingDemo {
public static void main(String[] args) {
	
	//For loop
	System.out.println("For Loop");
	for (int i = 1; i <=5; i++) {
		System.out.println(i);
	}
	
	//while loop
	System.out.println("While loop");
	int j=1;
	while (j <= 5) {
		System.out.println(j);
		j++;
	}
	
	//Do While loop
	System.out.println("Do while");
	int k = 1;
	do {
		System.out.println(k);
		k++;
	} while (k<=5);
}
}
