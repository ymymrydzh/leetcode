/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * @author 033172
 * @date 2019-01-14 16:55:25
 * @description Find the n^th digit of the infinite integer sequence 1, 2, 3, 4,
 *              5, 6, 7, 8, 9, 10, 11, ...
 * 
 *              Note: n is positive and will fit within the range of a 32-bit
 *              signed integer (n < 2^31).
 * 
 *              Example 1:
 * 
 *              Input: 3
 * 
 *              Output: 3
 * 
 *              Example 2:
 * 
 *              Input: 11
 * 
 *              Output: 0
 * 
 *              Explanation: The 11th digit of the sequence 1, 2, 3, 4, 5, 6, 7,
 *              8, 9, 10, 11, ... is a 0, which is part of the number 10.
 */
public class NthDigit {

	int[] counts = { 9, 180, 2700, 36000, 450000, 5400000, 63000000, 720000000, Integer.MAX_VALUE };
	int[] sec = { 1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000 };

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NthDigit n = new NthDigit();
		System.out.println(n.findNthDigit(198));
	}

	public int findNthDigit(int n) {
		int i = 0;
		while (n > counts[i]) {
			n -= counts[i++];
		}
		return (sec[i] + --n / ++i + "").charAt(n % i) - 48;
	}
}
