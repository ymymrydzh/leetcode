/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * @author 033172
 * @date 2018-12-25 18:56:31
 * @description Say you have an array for which the ith element is the price of
 *              a given stock on day i.
 * 
 *              If you were only permitted to complete at most one transaction
 *              (i.e., buy one and sell one share of the stock), design an
 *              algorithm to find the maximum profit.
 * 
 *              Note that you cannot sell a stock before you buy one.
 * 
 *              Example 1:
 * 
 *              Input: [7,1,5,3,6,4] Output: 5 Explanation: Buy on day 2 (price
 *              = 1) and sell on day 5 (price = 6), profit = 6-1 = 5. Not 7-1 =
 *              6, as selling price needs to be larger than buying price.
 * 
 *              Example 2:
 * 
 *              Input: [7,6,4,3,1] Output: 0 Explanation: In this case, no
 *              transaction is done, i.e. max profit = 0.
 */
public class BestTimetoBuyandSellStock {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BestTimetoBuyandSellStock b = new BestTimetoBuyandSellStock();
		int[] prices = { 7, 1, 5, 3, 6, 4 };
		System.out.println(b.maxProfit(prices));
	}

	public int maxProfit(int[] prices) {
		int profit = 0;
		for (int min = 0, i = 0; i < prices.length; i++) {
			min = prices[i] < prices[min] ? i : min;
			profit = prices[i] - prices[min] > profit ? prices[i] - prices[min] : profit;
		}
		return profit;
	}
}
