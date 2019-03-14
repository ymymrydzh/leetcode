/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * @author 033172
 * @date 2019-01-02 16:04:10
 * @description Given an integer n, return the number of trailing zeroes in n!.
 * 
 *              Example 1:
 * 
 *              Input: 3 Output: 0 Explanation: 3! = 6, no trailing zero.
 * 
 *              Example 2:
 * 
 *              Input: 5 Output: 1 Explanation: 5! = 120, one trailing zero.
 * 
 *              Note: Your solution should be in logarithmic time complexity.
 */
public class FactorialTrailingZeroes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	public int trailingZeroes(int n) {
		// return n < 5 ? 0 : n / 5 + trailingZeroes(n / 5);

		// 每5个数中有,1个5，每有1个5，则结果包含1个0。n/5为5的个数。
		// 循环表示遇到了5的多次方，每多1次方，结果会多1个0，结果相加即为答案。
		int count = 0;
		while (n > 4) {
			n /= 5;
			count += n;
		}
		return count;
	}
}
