/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * @author cc
 * @date 2019年1月10日14:34:04
 * @description Given an integer array nums, find the sum of the elements
 *              between indices i and j (i ≤ j), inclusive.
 * 
 *              Example:
 * 
 *              Given nums = [-2, 0, 3, -5, 2, -1]
 * 
 *              <li>sumRange(0, 2) -> 1
 *              <li>sumRange(2, 5) -> -1
 *              <li>sumRange(0, 5) -> -3
 * 
 *              Note: You may assume that the array does not change. There are
 *              many calls to sumRange function.
 */
public class RangeSumQueryImmutable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = new int[] { -2, 0, 3, -5, 2, -1 };
		RangeSumQueryImmutable rsqi = new RangeSumQueryImmutable(nums);
		System.out.println(rsqi.sumRange(0, 2));
		System.out.println(rsqi.sumRange(2, 5));
		System.out.println(rsqi.sumRange(0, 5));
	}

	int[] sums;

	public RangeSumQueryImmutable(int[] nums) {
		sums = new int[nums.length + 1];
		sums[0] = 0;
		for (int i = 0; i < nums.length; i++) {
			sums[i + 1] += sums[i] + nums[i];
		}
	}

	public int sumRange(int i, int j) {
		return sums[j + 1] - sums[i];
	}
}
