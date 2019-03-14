/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

import java.util.Arrays;

/**
 * @author 033172
 * @date 2019-01-10 16:24:59
 * @description Given two arrays, write a function to compute their
 *              intersection.
 * 
 *              Example 1:
 * 
 *              Input: nums1 = [1,2,2,1], nums2 = [2,2] Output: [2]
 * 
 *              Example 2:
 * 
 *              Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4] Output: [9,4]
 * 
 *              Note:
 * 
 *              Each element in the result must be unique. The result can be in
 *              any order.
 */
public class IntersectionofTwoArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IntersectionofTwoArrays i = new IntersectionofTwoArrays();
		int[] nums1 = { 54, 93, 21, 73, 84, 60, 18, 62, 59, 89, 83, 89, 25, 39, 41, 55, 78, 27, 65, 82, 94, 61, 12, 38,
				76, 5, 35, 6, 51, 48, 61, 0, 47, 60, 84, 9, 13, 28, 38, 21, 55, 37, 4, 67, 64, 86, 45, 33, 41 };
		int[] nums2 = { 17, 17, 87, 98, 18, 53, 2, 69, 74, 73, 20, 85, 59, 89, 84, 91, 84, 34, 44, 48, 20, 42, 68, 84,
				8, 54, 66, 62, 69, 52, 67, 27, 87, 49, 92, 14, 92, 53, 22, 90, 60, 14, 8, 71, 0, 61, 94, 1, 22, 84, 10,
				55, 55, 60, 98, 76, 27, 35, 84, 28, 4, 2, 9, 44, 86, 12, 17, 89, 35, 68, 17, 41, 21, 65, 59, 86, 42, 53,
				0, 33, 80, 20 };
		System.out.println(Arrays.toString(i.intersection(nums1, nums2)));
	}

	public int[] intersection(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int count = 0;
		int pre = -1;
		for (int i = 0, j = 0; i < nums1.length && j < nums2.length;) {
			if (nums1[i] < nums2[j] || (nums1[i] == nums2[j] && nums1[i] == pre)) {
				nums1[i] = -1;
				i++;
			} else if (nums1[i] > nums2[j]) {
				j++;
			} else {
				pre = nums1[i];
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
