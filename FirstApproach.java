package com.interviewPrep.leetcode.easy.buysellstock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;

public class FirstApproach {

	public static void main(String[] args) {
		
		/*
		 * input prices array
		 */
		int[] prices = {7,1,5,3,6,4};
		
		FirstApproach sa = new FirstApproach();
		int maxProfit = sa.maxProfit(prices);

		System.out.println("Max Profit: " + maxProfit);

	}

	 /*
	  * Function to find max profit from input stock prices.
	  * Input array -> int[] prices = {7,1,5,3,6,4};
	  */
	 public int maxProfit(int[] prices) {
		 
		 int maxProfit = 0;
		 int curProfit = 0;
		 int maxValAtIndex = -1;
		 
		
		/*
		 * Iterate the prices array in a for loop and find 
		 *  max price at every index
		 */
		 for(int i=0; i<prices.length-1; i++) {
			 
			 maxValAtIndex = getMax(i, prices);
			 
			 // compute profit at this index
			 curProfit = maxValAtIndex - prices[i];
			 
			 // if profit at this index is higher than current max profit, then store it as max profit
			 maxProfit = Math.max(maxProfit, curProfit);
		 }		 
		 
		 return maxProfit;
	 }
	 
	 /*
	  * compute the max value starting from the 
	  *  given index only
	  */
	 int getMax(int index, int[] prices) {
		 
		 // create a new ArrayList
		 List<Integer> pricesList = new ArrayList<>();
		 int max = 0;
		 
		 /*
		  * Iterate the prices array from the given 
		  *  index and populate the ArrayList
		  */
		 for(int i=index+1; i<prices.length; i++) {
			 
			 pricesList.add(prices[i]);
		 }
		 
		 // compute the max val in this list
		 max = (int) Collections.max(pricesList); 
		 
		 return max;
	 }
}
