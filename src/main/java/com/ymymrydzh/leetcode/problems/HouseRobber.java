/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * @author 033172
 * @date 2019-01-03 08:49:43
 * @description You are a professional robber planning to rob houses along a
 *              street. Each house has a certain amount of money stashed, the
 *              only constraint stopping you from robbing each of them is that
 *              adjacent houses have security system connected and it will
 *              automatically contact the police if two adjacent houses were
 *              broken into on the same night.
 * 
 *              Given a list of non-negative integers representing the amount of
 *              money of each house, determine the maximum amount of money you
 *              can rob tonight without alerting the police.
 * 
 *              Example 1:
 * 
 *              Input: [1,2,3,1] Output: 4 Explanation: Rob house 1 (money = 1)
 *              and then rob house 3 (money = 3). Total amount you can rob = 1 +
 *              3 = 4.
 * 
 *              Example 2:
 * 
 *              Input: [2,7,9,3,1] Output: 12 Explanation: Rob house 1 (money =
 *              2), rob house 3 (money = 9) and rob house 5 (money = 1). Total
 *              amount you can rob = 2 + 9 + 1 = 12.
 */
public class HouseRobber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HouseRobber h = new HouseRobber();
		int[] nums = { 7, 1, 3, 9, 1 };
		System.out.println(h.rob(nums));
	}

	public int rob(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		} else if (nums.length == 1) {
			return nums[0];
		} else if (nums.length == 2) {
			return Math.max(nums[0], nums[1]);
		} else {
			int[] robbed = new int[nums.length];
			robbed[2] = nums[0];
			for (int i = 3; i < nums.length; i++) {
				robbed[i] = Math.max(robbed[i - 3] + nums[i - 3], robbed[i - 2] + nums[i - 2]);
			}
			return Math.max(robbed[nums.length - 2] + nums[nums.length - 2],
					robbed[nums.length - 1] + nums[nums.length - 1]);
		}
	}
}
