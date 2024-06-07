package com.basic;
/*
 * List Of condidtion
 * 
 * if : if condition is treu then print otherwise nothing
 * 
 * if else : if condition is treu then print otherwise print false
 * 
 * nested if
 * 
 * else if ladder
 * 
 * switch
 * 
 * 
 * Condinational opearator : <,>,<=,>=,==
 * Logical Opearator : &&, ||, !
 */
public class ConditionDemo {
public static void main(String[] args) {
	//if type
	int a=11;
	
	if (a>10) {
		System.out.println("a is greater then 10");
	}
	
	//If else type
	int b=11;
	
	if (b>10) {
		System.out.println("b is greater then 10");
	}
	else {
		
		System.out.println("b is smaller then 10");
	}
	
	//Nested If
	int t1=120, t2=23, t3=1000;
	if(t1>t2) {
		if(t1>t3) {
			System.out.println("T1 Is Higher : "+t1);
		}
		else {
			System.out.println("T3 is Higher :"+t3);
		}
	}
	else {
		if(t2>t3) {
			System.out.println("T2 is Higher :"+t2);
		}
		else {
			System.out.println("t3 is Higher :"+t3);
		}
	}
	
	//Else If Ladder
	int t4=120, t5=23, t6=1000;
	if (t4>t5&&t4>t6) {
		System.out.println("T4 Is Greater");
	}else if (t5>t4&&t5>t6) {
		System.out.println("T5 Is Greater");
	}else {
		System.out.println("T6 Is Greater");
	}
	
	
	//SWitch
	int z=3;
	switch (z) {
	case 1:
		System.out.println("Fan Is On");
		break;
	case 2:
		System.out.println("Light Is On");
		break;
	case 3:
		System.out.println("AC Is On");
		break;

	default:
		break;
	}
	
	char ch='t';
	switch (ch) {
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
	case 'A':
	case 'E':
	case 'I':
	case 'O':
	case 'U':
	
		System.out.println("Vowel");
		break;

	default:
		System.out.println("Consonant");
		break;
	}
}
}
