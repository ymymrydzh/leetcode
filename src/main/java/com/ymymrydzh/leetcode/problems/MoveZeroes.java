package main.java.com.ymymrydzh.leetcode.problems;
/**
 * 
 */

import java.util.Arrays;

/**
 * @author CC
 * @date 2019年1月10日09:21:24
 * @description Given an array nums, write a function to move all 0's to the end
 *              of it while maintaining the relative order of the non-zero
 *              elements.
 * 
 *              Example:
 * 
 *              Input: [0,1,0,3,12] Output: [1,3,12,0,0]
 * 
 *              Note:
 * 
 *              You must do this in-place without making a copy of the array.
 *              Minimize the total number of operations.
 */
public class MoveZeroes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MoveZeroes mz = new MoveZeroes();
		int[] nums = { 0, 1, 0, 0, 0 };
		mz.moveZeroes(nums);
		System.out.println(Arrays.toString(nums));
	}

	public void moveZeroes(int[] nums) {
		int i = 0;
		int j = 0;
		while (i < nums.length) {
			if (nums[i] == 0) {
				i++;
			} else {
				nums[j++] = nums[i++];
			}
		}
		while (j < nums.length) {
			nums[j++] = 0;
		}
	}
}
