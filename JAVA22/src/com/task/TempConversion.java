package com.task;

public class TempConversion {
public static void main(String[] args) {
	double fahrenheit_temp = 134.90;
	double conversion_factor = 5 / 9d;
    double celsius_temp = (fahrenheit_temp - 32) * conversion_factor;
    System.out.println(+conversion_factor);
    System.out.println(+ fahrenheit_temp + " degrees Fahrenheit is equal to "+ celsius_temp + " degrees Celsius.");
}
}
