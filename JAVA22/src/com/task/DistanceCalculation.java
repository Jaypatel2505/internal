package com.task;

public class DistanceCalculation {
public static void main(String[] args) {
	double distance_km = 78.98;
    double distance_meters = distance_km * 1000;
    double distance_feet = distance_meters * 3.28084;
    double distance_inches = distance_feet * 12;
    double distance_centimeters = distance_meters * 100;

    System.out.println("Distance in kilometers: " + distance_km + " km");
    System.out.println("Distance in meters:" + distance_meters + " mt");
    System.out.println("Distance in feet: " +distance_feet + " ft");
    System.out.println("Distance in inches: " +distance_inches + " in");
    System.out.println("Distance in centimeters: " +distance_centimeters + " cm");
}
}