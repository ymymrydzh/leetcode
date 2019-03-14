/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

import java.util.Arrays;

/**
 * @author 033172
 * @date 2019-01-02 16:48:54
 * @description Given an array, rotate the array to the right by k steps, where
 *              k is non-negative.
 * 
 *              Example 1:
 * 
 *              Input: [1,2,3,4,5,6,7] and k = 3 Output: [5,6,7,1,2,3,4]
 *              Explanation: rotate 1 steps to the right: [7,1,2,3,4,5,6] rotate
 *              2 steps to the right: [6,7,1,2,3,4,5] rotate 3 steps to the
 *              right: [5,6,7,1,2,3,4]
 * 
 *              Example 2:
 * 
 *              Input: [-1,-100,3,99] and k = 2 Output: [3,99,-1,-100]
 *              Explanation: rotate 1 steps to the right: [99,-1,-100,3] rotate
 *              2 steps to the right: [3,99,-1,-100] Note:
 * 
 *              Try to come up as many solutions as you can, there are at least
 *              3 different ways to solve this problem. Could you do it in-place
 *              with O(1) extra space?
 */
public class RotateArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RotateArray r = new RotateArray();
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 5;
		r.rotate(nums, k);
		System.out.println(Arrays.toString(nums));
	}

	public void rotate(int[] nums, int k) {
		// k %= nums.length;
		// int[] n = Arrays.copyOf(nums, nums.length);
		// for (int i = 0; i < nums.length; i++) {
		// nums[i + k < nums.length ? i + k : i + k - nums.length] = n[i];
		// }

		// k %= nums.length;
		// reverse(nums, 0, nums.length - 1);
		// reverse(nums, 0, k - 1);
		// reverse(nums, k, nums.length - 1);

		k %= nums.length;
		reverse(nums, 0, nums.length - k - 1);
		reverse(nums, nums.length - k, nums.length - 1);
		reverse(nums, 0, nums.length - 1);
	}

	private void reverse(int[] nums, int start, int end) {
		while (start < end) {
			int tmp = nums[start];
			nums[start++] = nums[end];
			nums[end--] = tmp;
		}
	}
}
