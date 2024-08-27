package com.task;

public class ProfitAndLoss {
public static void main(String[] args) {
	float cost = 20.89f, profit, loss, sell = 90.77f;
	if (sell>cost) {
		profit = sell - cost;
		System.out.println("The Profit is "+profit);
	} else if(sell<cost)
	{
		loss = cost - sell;
		System.out.println("The Loss is "+loss);
	} else {
		System.out.println("There is no profit/Loss");
	}
}
}
