package com.task;

public class FirstDayOfCurrentYear {
public static void main(String[] args) {
	int year = 2024, basic_year = 1900, leap_year, remain_year, total_day, day;
	
	year = (year-1)-basic_year;  // no of total year between basic year and year variable
	leap_year = year/4; // leap year count
	remain_year = year - leap_year;	//calculate which are not leap years
	total_day = (remain_year*365) + (leap_year*366) + 1;
	
	//Find actual day
	day = total_day%7;
	
	if (day == 0) {
		System.out.println("It's Monday");
	} else if (day == 1) {
		System.out.println("It's Tuesday");
	}else if (day == 2) {
		System.out.println("It's Wednesday");
	}else if (day == 3) {
		System.out.println("It's Thursday");
	}else if (day == 4) {
		System.out.println("It's Friday");
	}else if (day == 5) {
		System.out.println("It's Saturday");
	}else if (day == 6) {
		System.out.println("It's Sunday");
	}else{
		System.out.println("Inputted Wrong Year");
	}
	
}
}
