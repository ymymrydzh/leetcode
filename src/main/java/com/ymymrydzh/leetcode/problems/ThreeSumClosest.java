/**
 * 
 */
package leetcode;

import java.util.Arrays;

/**
 * @author cc
 * @creation 2015-6-2
 * 
 */
public class ThreeSumClosest {

	public int threeSumClosest(int[] nums, int target) {
		if (nums == null || nums.length < 3) {
			return 0;
		}
		int closestSum = 0;
		int minDif = Integer.MAX_VALUE;
		int curSum = 0;
		Arrays.sort(nums);
		int i = 0;
		while (i < nums.length - 2) {
			int left = i + 1;
			int right = nums.length - 1;
			while (left < right) {
				curSum = nums[i] + nums[left] + nums[right];
				if (curSum == target) {
					return curSum;
				}
				int dif = Math.abs(curSum - target);
				if (dif < minDif) {
					minDif = dif;
					closestSum = curSum;
				}
				if (curSum < target) {
					while (nums[++left] == nums[left - 1] && left < right) {

					}
				} else {
					while (nums[--right] == nums[right + 1] && left < right) {

					}
				}
			}
			while (nums[++i] == nums[i - 1] && i < nums.length - 2) {

			}
		}
		return closestSum;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = { 1, 1, 1, 0 };
		int target = -100;
		ThreeSumClosest tsc = new ThreeSumClosest();
		int result = tsc.threeSumClosest(nums, target);
		System.out.println(result);
	}
}
