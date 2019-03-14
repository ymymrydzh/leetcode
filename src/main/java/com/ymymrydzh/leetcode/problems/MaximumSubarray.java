/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * @author 033172
 * @date 2018-12-18 10:54:31
 * @description Given an integer array nums, find the contiguous subarray
 *              (containing at least one number) which has the largest sum and
 *              return its sum.
 * 
 *              Example:
 * 
 *              Input: [-2,1,-3,4,-1,2,1,-5,4], Output: 6 Explanation:
 *              [4,-1,2,1] has the largest sum = 6. Follow up:
 * 
 *              If you have figured out the O(n) solution, try coding another
 *              solution using the divide and conquer approach, which is more
 *              subtle.
 */
public class MaximumSubarray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MaximumSubarray m = new MaximumSubarray();
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(m.maxSubArray(nums));
	}

	public int maxSubArray(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		int maxsum = nums[0];
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
			maxsum = sum > maxsum ? sum : maxsum;
			sum = sum > 0 ? sum : 0;
		}
		return maxsum;
	}
}
