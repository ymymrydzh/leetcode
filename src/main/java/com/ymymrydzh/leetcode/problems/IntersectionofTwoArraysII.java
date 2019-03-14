/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

import java.util.Arrays;

/**
 * @author 033172
 * @date 2019-01-10 18:12:57
 * @description Given two arrays, write a function to compute their
 *              intersection.
 * 
 *              Example 1:
 * 
 *              Input: nums1 = [1,2,2,1], nums2 = [2,2] Output: [2,2]
 * 
 *              Example 2:
 * 
 *              Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4] Output: [4,9]
 * 
 *              Note:
 * 
 *              Each element in the result should appear as many times as it
 *              shows in both arrays. The result can be in any order.
 * 
 *              Follow up:
 * 
 *              What if the given array is already sorted? How would you
 *              optimize your algorithm? What if nums1's size is small compared
 *              to nums2's size? Which algorithm is better? What if elements of
 *              nums2 are stored on disk, and the memory is limited such that
 *              you cannot load all elements into the memory at once?
 */
public class IntersectionofTwoArraysII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	public int[] intersect(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int count = 0;
		for (int i = 0, j = 0; i < nums1.length && j < nums2.length;) {
			if (nums1[i] < nums2[j]) {
				nums1[i] = -1;
				i++;
			} else if (nums1[i] > nums2[j]) {
				j++;
			} else {
				count++;
				i++;
				j++;
			}
		}
		int[] inter = new int[count];
		for (int i = 0, j = 0; i < count; i++) {
			while (j < nums1.length && nums1[j] == -1) {
				j++;
			}
			inter[i] = nums1[j++];
		}
		return inter;
	}
}
