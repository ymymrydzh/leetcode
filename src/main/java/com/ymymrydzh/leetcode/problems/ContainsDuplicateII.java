/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 033172
 * @date 2019-01-07 14:12:52
 * @description Given an array of integers and an integer k, find out whether
 *              there are two distinct indices i and j in the array such that
 *              nums[i] = nums[j] and the absolute difference between i and j is
 *              at most k.
 * 
 *              Example 1:
 * 
 *              Input: nums = [1,2,3,1], k = 3 Output: true
 * 
 *              Example 2:
 * 
 *              Input: nums = [1,0,1,1], k = 1 Output: true
 * 
 *              Example 3:
 * 
 *              Input: nums = [1,2,3,1,2,3], k = 2 Output: false
 * 
 */
public class ContainsDuplicateII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ContainsDuplicateII c = new ContainsDuplicateII();
		int[] nums = { 1, 2, 3, 1, 2, 3 };
		int k = 2;
		System.out.println(c.containsNearbyDuplicate(nums, k));
	}

	public boolean containsNearbyDuplicate(int[] nums, int k) {
		// for (int i = 0; i < nums.length - 1; i++) {
		// for (int j = 1; j <= k && i + j < nums.length; j++) {
		// if (nums[i] == nums[i + j]) {
		// return true;
		// }
		// }
		// }
		// return false;

		// Map<Integer, Integer> map = new HashMap<>();
		// for (int i = 0; i < nums.length; i++) {
		// if (map.get(nums[i]) == null) {
		// map.put(nums[i], i);
		// } else {
		// if (i - map.get(nums[i]) <= k) {
		// return true;
		// }
		// map.put(nums[i], i);
		// }
		// }
		// return false;

		Set<Integer> set = new HashSet<>();
		int i = 0;
		while (i <= k && i < nums.length) {
			if (!set.add(nums[i++])) {
				return true;
			}
		}
		i = 0;
		while (i + k + 1 < nums.length) {
			set.remove(nums[i]);
			if (!set.add(nums[++i + k])) {
				return true;
			}
		}
		return false;
	}
}
