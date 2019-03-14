/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * @author 033172
 * @date 2019-01-09 18:13:23
 * @description Given an array containing n distinct numbers taken from 0, 1, 2,
 *              ..., n, find the one that is missing from the array.
 * 
 *              Example 1:
 * 
 *              Input: [3,0,1] Output: 2
 * 
 *              Example 2:
 * 
 *              Input: [9,6,4,2,3,5,7,0,1] Output: 8
 * 
 *              Note: Your algorithm should run in linear runtime complexity.
 *              Could you implement it using only constant extra space
 *              complexity?
 */
public class MissingNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MissingNumber m = new MissingNumber();
		int[] nums = { 3, 0, 1 };
		System.out.println(m.missingNumber(nums));
	}

	public int missingNumber(int[] nums) {
		// Arrays.sort(nums);
		// for (int i = 0; i < nums.length; i++) {
		// if (i != nums[i]) {
		// return i;
		// }
		// }
		// return nums.length;

		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		return (nums.length * (nums.length + 1) >> 1) - sum;

		// int miss = nums.length;
		// for (int i = 0; i < nums.length; i++) {
		// miss ^= i ^ nums[i];
		// }
		// return miss;
	}
}
