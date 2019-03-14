/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * @author CC
 * @date 2018年12月19日11:02:42
 * @description Given two sorted integer arrays nums1 and nums2, merge nums2
 *              into nums1 as one sorted array.
 * 
 *              Note:
 * 
 *              The number of elements initialized in nums1 and nums2 are m and
 *              n respectively. You may assume that nums1 has enough space (size
 *              that is greater or equal to m + n) to hold additional elements
 *              from nums2. Example:
 * 
 *              Input: nums1 = [1,2,3,0,0,0], m = 3 nums2 = [2,5,6], n = 3
 * 
 *              Output: [1,2,2,3,5,6]
 */
public class MergeSortedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		int[] nums1 = { 1,0 };
		int m = 1;
		int[] nums2 = { 0 };
		int n = 1;
		MergeSortedArray msa = new MergeSortedArray();
		msa.merge(nums1, m, nums2, n);
		System.out.println();
	}

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		
		while (m > 0 && n > 0) {
			nums1[m + n - 1] = nums1[m - 1] > nums2[n - 1] ? nums1[m-- -1] : nums2[n-- - 1];
		}
		while (n > 0) {
			nums1[n - 1] = nums2[n-- - 1];
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int i = m - 1, j = m + n - 1, k = 0;
//		while (i > -1) {
//			nums1[j--] = nums1[i--];
//		}
//		i = n;
//		j = 0;
//		while (i < m + n && j < n) {
//			nums1[k++] = nums1[i] < nums2[j] ? nums1[i++] : nums2[j++];
//		}
//		while (i < m) {
//			nums1[k++] = nums1[i++];
//		}
//		while (j < n) {
//			nums1[k++] = nums2[j++];
//		}
	}
}
