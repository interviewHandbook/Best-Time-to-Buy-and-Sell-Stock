package com.interviewPrep.leetcode.easy.buysellstock;

public class SecondApproach {

	public static void main(String[] args) {
		
		/*
		 * input prices array
		 */
		int[] prices = {7,1,5,3,6,4};
		
		SecondApproach ta = new SecondApproach();
		int maxProfit = ta.maxProfit(prices);
		
		System.out.println("Max Profit: " + maxProfit);
	}

	 /*
	  * Function to find max profit from input stock prices.
	  * Input array -> int[] prices = {7,1,5,3,6,4};
	  */
	public int maxProfit(int[] prices) {
		
		// Initialize max profit to zero
		int maxProfit = 0;
		
		int curProfit = 0;
		int min = 0;
		
		// initialize the buy index to zero 
		int buy = 0;
		
		/*
		 * Iterate the prices array in a for loop starting first index
		 * 
		 */
		 for(int sell=1; sell<prices.length; sell++) {
			 
			 // store the lowest price so far in min
			 min = prices[buy];
			 	 
			 // if a lower price is encountered then
			 if(min > prices[sell]) {
				 
				 // 1. update min
				 min = prices[sell];
				 
				 // 2. update buy index to indicate the min price so far in array
				 buy = sell;
			 }
			 
			 // at every index compute the current profit
			 curProfit = prices[sell] - prices[buy];
			 
			 
			 /*
			  * if current profit is greater than max profit, then 
			  * store its value in max profit
			  */
			 
			 maxProfit = Math.max(maxProfit, curProfit);
		 }
		
		
		// return answer 
		return maxProfit;
	}
}
