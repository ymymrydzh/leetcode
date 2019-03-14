/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * @author 033172
 * @date 2018-12-28 17:56:23
 * @description Given an array of integers that is already sorted in ascending
 *              order, find two numbers such that they add up to a specific
 *              target number.
 * 
 *              The function twoSum should return indices of the two numbers
 *              such that they add up to the target, where index1 must be less
 *              than index2.
 * 
 *              Note:
 * 
 *              Your returned answers (both index1 and index2) are not
 *              zero-based. You may assume that each input would have exactly
 *              one solution and you may not use the same element twice.
 *              Example:
 * 
 *              Input: numbers = [2,7,11,15], target = 9 Output: [1,2]
 *              Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1,
 *              index2 = 2.
 */
public class TwoSumIIInputarrayissorted {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	public int[] twoSum(int[] numbers, int target) {
		for (int i = 0, j = numbers.length - 1; i < j;) {
			while (numbers[i] + numbers[j] < target) {
				i++;
			}
			while (numbers[i] + numbers[j] > target) {
				j--;
			}
			if (numbers[i] + numbers[j] == target) {
				int[] r = { i + 1, j + 1 };
				return r;
			}
		}
		return null;
	}
}
