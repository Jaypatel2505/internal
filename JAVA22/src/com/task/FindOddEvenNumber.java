package com.task;

public class FindOddEvenNumber {
public static void main(String[] args) {
	int num = 2, result;
	result = num%2;
	
	if (result == 0) {
		System.out.println("The number is even.");
	} else {
		System.out.println("The number is odd.");
	}
}
}
