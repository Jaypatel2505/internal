package com.task;

public class CheckTriagleValid {
public static void main(String[] args) {
	int a = 10, b = 10, c=160, sum;
	sum = a+b+c;
	
	if (sum==180) {
		System.out.println("Triangle is Valid");
	} else {
		System.out.println("Triangle is not valid");
	}
}
}