/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * @author 033172
 * @date 2019-01-03 15:10:32
 * @description Write an algorithm to determine if a number is "happy".
 * 
 *              A happy number is a number defined by the following process:
 *              Starting with any positive integer, replace the number by the
 *              sum of the squares of its digits, and repeat the process until
 *              the number equals 1 (where it will stay), or it loops endlessly
 *              in a cycle which does not include 1. Those numbers for which
 *              this process ends in 1 are happy numbers.
 * 
 *              Example:
 * 
 *              <li>Input: 19
 *              <li>Output: true
 *              <li>Explanation:
 *              <li>1^2 + 9^2 = 82
 *              <li>8^2 + 2^2 = 68
 *              <li>6^2 + 8^2 = 100
 *              <li>1^2 + 0^2 + 0^2 = 1
 */
public class HappyNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HappyNumber h = new HappyNumber();
		System.out.println(h.isHappy(19));
	}

	public boolean isHappy(int n) {
		if (n == 1 || n == 7) {
			return true;
		} else if (n < 10) {
			return false;
		}

		int sum = 0;
		while (n != 0) {
			sum += Math.pow(n % 10, 2);
			n /= 10;
		}
		return isHappy(sum);
	}
}
