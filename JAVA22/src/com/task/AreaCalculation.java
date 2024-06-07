package com.task;

public class AreaCalculation {
public static void main(String[] args) {
	//Rectangle
	int length = 10;
    double breadth = 20.232;
    float rectangle_area = (float) (length * breadth);
    double rectangle_perimeter = 2 * (length + (double)breadth);
    
    System.out.println("  Area: " + rectangle_area);
    System.out.println("  Perimeter: " + rectangle_perimeter + "\n");

    //Circle
    double radius = 39.98;
    double circle_area = 3.14*(2*radius);
    double circle_circumference = 2 * 3.14 * radius;

    System.out.println("  Area: "+ circle_area);
    System.out.println("  Circumference: "+ circle_circumference);
}
}
