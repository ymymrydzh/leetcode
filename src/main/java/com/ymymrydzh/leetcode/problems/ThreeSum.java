/**
 * 
 */
package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author cc
 * @creation 2015-6-1
 * 
 */
public class ThreeSum {

	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (nums == null || nums.length < 3) {
			return result;
		}
		Arrays.sort(nums);
		int i = 0;
		while (nums[i] <= 0 && i < nums.length - 2) {
			int left = i + 1;
			int right = nums.length - 1;
			while (left < right) {
				if (nums[left] + nums[right] + nums[i] == 0) {
					List<Integer> oneResult = new ArrayList<Integer>();
					oneResult.add(nums[i]);
					oneResult.add(nums[left]);
					oneResult.add(nums[right]);
					result.add(oneResult);
					while (nums[--right] == nums[right + 1] && left < right)
						;
					while (nums[++left] == nums[left - 1] && left < right)
						;
				} else if (nums[left] + nums[right] + nums[i] > 0) {
					while (nums[--right] == nums[right + 1] && left < right)
						;
				} else {
					while (nums[++left] == nums[left - 1] && left < right)
						;
				}
			}
			while (nums[++i] == nums[i - 1] && i < nums.length - 2) {
			}
		}
		return result;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		// int[] nums1 = { -15, 10, 0, -2, 14, -1, -10, -14, 10, 12, 6, -6, 10,
		// 2,
		// -11, -9, 2, 13, 2, -9, -14, -12, -10, -12, 13, 13, -10, -3, 2,
		// -11, 3, -6, 6, 10, 7, 5, -13, 4, -2, 12, 1, -11, 14, -4, 6,
		// -12, -6, -14, 8, 11, -8, 1, 7, -3, 5, 5, -13, 10, 9, -3, 6,
		// -10, 6, -3, 7, -9, -13, 9, 10, 0, -1, -11, 4, -10, -8, -13,
		// -15, 2, -12, 8, -2, -12, -14, -10, -8, 6, 2, -5, -7, -11, 7,
		// 14, -6, -10, -12, 8, -4, -10, -5, 14, -3, 9, -12, 8, 14, -13 };
		int[] nums = { 7, -1, 14, -12, -8, 7, 2, -15, 8, 8, -8, -14, -4, -5, 7,
				9, 11, -4, -15, -6, 1, -14, 4, 3, 10, -5, 2, 1, 6, 11, 2, -2,
				-5, -7, -6, 2, -15, 11, -6, 8, -4, 2, 1, -1, 4, -6, -15, 1, 5,
				-15, 10, 14, 9, -8, -6, 4, -6, 11, 12, -15, 7, -1, -9, 9, -1,
				0, -4, -1, -12, -2, 14, -9, 7, 0, -3, -4, 1, -2, 12, 14, -10,
				0, 5, 14, -1, 14, 3, 8, 10, -8, 8, -5, -2, 6, -11, 12, 13, -7,
				-12, 8, 6, -13, 14, -2, -5, -11, 1, 3, -6 };
		// int[] nums = { 0, 0, 0 };
		ThreeSum ts = new ThreeSum();
		List<List<Integer>> result = ts.threeSum(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		for (Iterator<List<Integer>> it = result.iterator(); it.hasNext();) {
			for (Iterator<Integer> ito = it.next().iterator(); ito.hasNext();) {
				System.out.print(ito.next() + " ");
			}
			System.out.println();
		}
		System.out.println("Total results : " + result.size());
		System.out.println(System.currentTimeMillis() - startTime);
	}

}
