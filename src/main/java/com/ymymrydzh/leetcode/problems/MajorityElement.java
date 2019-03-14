/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * @author 033172
 * @date 2019-01-02 14:02:08
 * @description Given an array of size n, find the majority element. The
 *              majority element is the element that appears more than n/2
 *              times.
 * 
 *              You may assume that the array is non-empty and the majority
 *              element always exist in the array.
 * 
 *              Example 1: Input: [3,2,3] Output: 3
 * 
 *              Example 2: Input: [2,2,1,1,1,2,2] Output: 2
 */
public class MajorityElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MajorityElement m = new MajorityElement();
		int[] nums = { 10, 9, 9, 9, 10 };
		System.out.println(m.majorityElement(nums));
	}

	public int majorityElement(int[] nums) {
		// int l = nums.length;
		// Map<Integer, Integer> c = new HashMap<>();
		// for (int i : nums) {
		// if (c.get(i) == null) {
		// c.put(i, 1);
		// } else {
		// int t = c.get(i) + 1;
		// c.put(i, t);
		// }
		// if (c.get(i) > l / 2) {
		// return i;
		// }
		// }
		// return 0;

		// Arrays.sort(nums);
		// return nums[nums.length / 2];

		int num = nums[0];
		int count = 1;
		for (int i = 1; i < nums.length; i++) {
			if (count == 0) {
				num = nums[i];
				count++;
			} else if (num == nums[i]) {
				count++;
			} else {
				count--;
			}
		}
		return num;
	}
}
