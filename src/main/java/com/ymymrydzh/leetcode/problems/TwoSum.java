/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author cc
 * @date 2018年12月12日10:47:08
 * @description Given an array of integers, return indices of the two numbers
 *              such that they add up to a specific target.
 * 
 *              You may assume that each input would have exactly one solution,
 *              and you may not use the same element twice.
 * 
 *              Example:
 * 
 *              Given nums = [2, 7, 11, 15], target = 9,
 * 
 *              Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
 */
public class TwoSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 22;
		TwoSum ts = new TwoSum();
		int[] rs = ts.twoSum(nums, target);
		System.out.println(Arrays.toString(rs));
	}

	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int[] result = new int[2];
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) {
				result[0] = map.get(target - nums[i]);
				result[1] = i;
				break;
			}
			map.put(nums[i], i);
		}
		return result;
	}
}
