/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.util;

/**
 * @author cc
 * @creation 2015-6-1
 * 
 */
public class QuickSort {

	public void quickSort(int[] nums) {
		sort(nums, 0, nums.length - 1);
	}

	private void sort(int[] nums, int left, int right) {
		if (left >= right) {
			return;
		}
		int p = partition(nums, left, right);
		sort(nums, left, p - 1);
		sort(nums, p + 1, right);
	}

	private int partition(int[] nums, int left, int right) {
		int low = left;
		int high = right + 1;
		while (low < high) {
			while (nums[++low] < nums[left] && low < right) {
			}
			while (nums[--high] > nums[left]) {
			}
			if (low >= high)
				break;
			int tmp = nums[left];
			nums[left] = nums[high];
			nums[high] = tmp;
		}
		if (nums[high] < nums[left]) {
			int tmp = nums[left];
			nums[left] = nums[high];
			nums[high] = tmp;
		}
		return high;
	}

}
