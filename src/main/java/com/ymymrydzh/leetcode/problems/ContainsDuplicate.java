/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

import java.util.Arrays;

/**
 * @author 033172
 * @date 2019-01-04 17:57:48
 * @description Given an array of integers, find if the array contains any
 *              duplicates.
 * 
 *              Your function should return true if any value appears at least
 *              twice in the array, and it should return false if every element
 *              is distinct.
 * 
 *              Example 1:
 * 
 *              Input: [1,2,3,1] Output: true
 * 
 *              Example 2:
 * 
 *              Input: [1,2,3,4] Output: false
 * 
 *              Example 3:
 * 
 *              Input: [1,1,1,3,3,4,3,2,4,2] Output: true
 */
public class ContainsDuplicate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	public boolean containsDuplicate(int[] nums) {
		// Set<Integer> set = new HashSet<>();
		// for (int i : nums) {
		// set.add(i);
		// }
		// return !(nums.length == set.size());

		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				return true;
			}
		}
		return false;

		// for (int i = 0; i < nums.length; i++) {
		// for (int j = 0; j < i; j++) {
		// if (nums[i] == nums[j]) {
		// return true;
		// }
		// }
		// }
		// return false;

		// Map<Integer, Object> map = new HashMap<>();
		// for (int i : nums) {
		// if (map.containsKey(i)) {
		// return true;
		// } else {
		// map.put(i, null);
		// }
		// }
		// return !(nums.length == map.size());
	}
}
