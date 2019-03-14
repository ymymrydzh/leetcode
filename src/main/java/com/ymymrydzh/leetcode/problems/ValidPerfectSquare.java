/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * @author 033172
 * @date 2019-01-10 18:17:21
 * @description Given a positive integer num, write a function which returns
 *              True if num is a perfect square else False.
 * 
 *              Note: Do not use any built-in library function such as sqrt.
 * 
 *              Example 1:
 * 
 *              Input: 16 Output: true
 * 
 *              Example 2:
 * 
 *              Input: 14 Output: false
 */
public class ValidPerfectSquare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ValidPerfectSquare v = new ValidPerfectSquare();
		int num = 808201;
		System.out.println(v.isPerfectSquare(num));
		System.out.println(Long.MAX_VALUE);
	}

	public boolean isPerfectSquare(int num) {
		int i = 1;
		int j = num;
		int k = 1;
		while (j - i > 1) {
			k = (k + num / k) / 2;
			long k2 = (long) k * k;
			if (k2 == num) {
				return true;
			} else if (j == k || i == k) {
				return false;
			} else if (k2 > num) {
				j = k;
			} else {
				i = k;
			}
		}
		return num == 0 || num == 1;

		// 跟上边的方法收敛方式一样。
		// 但不知道r收敛到平方根另一侧以后为什么就可以判定结束了
		// long r = num;
		// while (r * r > num) {
		// r = (r + num / r) / 2;
		// }
		// return r * r == num;
	}
}
