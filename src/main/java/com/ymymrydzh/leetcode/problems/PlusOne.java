/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

import java.util.Arrays;

/**
 * @author 033172
 * @date 2018-12-18 13:46:15
 * @description Given a non-empty array of digits representing a non-negative
 *              integer, plus one to the integer.
 * 
 *              The digits are stored such that the most significant digit is at
 *              the head of the list, and each element in the array contain a
 *              single digit.
 * 
 *              You may assume the integer does not contain any leading zero,
 *              except the number 0 itself.
 * 
 *              Example 1:
 * 
 *              Input: [1,2,3] Output: [1,2,4] Explanation: The array represents
 *              the integer 123.
 * 
 *              Example 2:
 * 
 *              Input: [4,3,2,1] Output: [4,3,2,2] Explanation: The array
 *              represents the integer 4321.
 */
public class PlusOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PlusOne p = new PlusOne();
		int[] digits = { 9, 9 };
		System.out.println(Arrays.toString(p.plusOne(digits)));

	}

	public int[] plusOne(int[] digits) {
		int i = digits.length - 1;
		boolean more = false;
		while ((more = dealDigit(digits, i)) && --i > -1) {
		}
		if (i == -1 && more) {
			digits = new int[digits.length + 1];
			digits[0] = 1;
		}
		return digits;
	}

	private boolean dealDigit(int[] digits, int i) {
		digits[i] = digits[i] < 9 ? digits[i] + 1 : 0;
		return digits[i] == 0;
	}
}
