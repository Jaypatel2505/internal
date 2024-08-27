package com.task;

public class SalaryCalculation {
public static void main(String[] args) {
	float basic_salary = 50080.32f;
    float dearness_allowance = basic_salary * 0.4f;
    float house_rent_allowance = basic_salary * 0.2f;
    double gross_salary = basic_salary + dearness_allowance + house_rent_allowance;
    System.out.println("Gross salary: ₹" + gross_salary);
}
}
