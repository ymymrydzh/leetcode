/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * @author 033172
 * @date 2018-12-27 16:14:10
 * @description Given a non-empty array of integers, every element appears twice
 *              except for one. Find that single one.
 * 
 *              Note:
 * 
 *              Your algorithm should have a linear runtime complexity. Could
 *              you implement it without using extra memory?
 * 
 *              Example 1:
 * 
 *              Input: [2,2,1] Output: 1
 * 
 *              Example 2:
 * 
 *              Input: [4,1,2,1,2] Output: 4
 */
public class SingleNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	public int singleNumber(int[] nums) {
		int a = 0;
		for (int i = 0; i < nums.length; i++) {
			a ^= nums[i];
		}
		return a;
	}
}
