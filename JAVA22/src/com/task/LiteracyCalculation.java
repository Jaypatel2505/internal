package com.task;
public class LiteracyCalculation {
public static void main(String[] args) {
	int total_population = 80000;
    float men_percentage = 0.52f;
    float total_literacy = 0.48f;
    float literate_men_percentage = 0.35f;
    float men_population = total_population * men_percentage;
    float women_population = total_population - men_population;
    float literate_population = total_population * total_literacy;
    float literate_women = literate_population - (men_population * literate_men_percentage);
    float illiterate_men = men_population - (men_population * literate_men_percentage);
    float illiterate_women = women_population - literate_women;
    
    System.out.println("Total Illiterate Men: "+illiterate_men);
    System.out.println("Total Illiterate Women: "+illiterate_women);
}
}