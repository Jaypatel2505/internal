package com.task;

public class AdditionSameOfSameValueOfVariable {
public static void main(String[] args) {
	int a=12345, temp,sum;
	
	temp = a%10;  //5
	sum = temp;
	a=a/10;  //1234
	temp = a%10;  //4
	sum = sum + temp;
	a=a/10;  //123
	temp = a%10;  //3
	sum = sum + temp;
	a=a/10;  //12
	temp = a%10;  //2
	sum = sum + temp;
	a=a/10;  //1
	temp = a%10;  //1
	sum = sum + temp;
	
	
	
	System.out.println(+sum);
}
}
