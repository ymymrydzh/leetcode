/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * @author 033172
 * @date 2018-12-17 10:04:28
 * @description Given a sorted array and a target value, return the index if the
 *              target is found. If not, return the index where it would be if
 *              it were inserted in order.
 * 
 *              You may assume no duplicates in the array.
 * 
 *              Example 1:
 * 
 *              Input: [1,3,5,6], 5 Output: 2
 * 
 *              Example 2:
 * 
 *              Input: [1,3,5,6], 2 Output: 1
 * 
 *              Example 3:
 * 
 *              Input: [1,3,5,6], 7 Output: 4
 * 
 *              Example 4:
 * 
 *              Input: [1,3,5,6], 0 Output: 0
 */
public class SearchInsertPosition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SearchInsertPosition s = new SearchInsertPosition();
		int[] nums = { 1, 3 };
		int target = 0;
		System.out.println(s.searchInsert(nums, target));
	}

	public int searchInsert(int[] nums, int target) {
		return nums == null || nums.length == 0 ? 0 : binarySearch(nums, target, 0, nums.length - 1);
	}

	private int binarySearch(int[] nums, int target, int low, int high) {
		if (low >= high) {
			return high >= 0 ? nums[high] >= target ? high : high + 1 : 0;
		}
		int m = (low + high) / 2;
		if (nums[m] == target) {
			return m;
		}
		if (nums[m] > target) {
			high = m - 1;
		} else {
			low = m + 1;
		}
		return binarySearch(nums, target, low, high);
	}
}
