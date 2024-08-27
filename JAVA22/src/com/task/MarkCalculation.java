package com.task;

public class MarkCalculation {
public static void main(String[] args) {
	int math = 40, sci = 55, guj = 78, hindi = 89, com = 100;
    int total_marks = math + sci + guj + hindi + com;
    double percentage = (double) total_marks / 500 * 100;

    System.out.println("Total marks obtained: " + total_marks);
    System.out.println("Percentage marks obtained:" + percentage);
}
}