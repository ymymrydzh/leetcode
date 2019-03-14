/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * @author 033172
 * @date 2018-12-18 15:30:33
 * @description Implement int sqrt(int x).
 * 
 *              Compute and return the square root of x, where x is guaranteed
 *              to be a non-negative integer.
 * 
 *              Since the return type is an integer, the decimal digits are
 *              truncated and only the integer part of the result is returned.
 * 
 *              Example 1:
 * 
 *              Input: 4 Output: 2
 * 
 *              Example 2:
 * 
 *              Input: 8 Output: 2 Explanation: The square root of 8 is
 *              2.82842..., and since the decimal part is truncated, 2 is
 *              returned.
 */
public class Sqrtx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Sqrtx s = new Sqrtx();
		int x = 808201;
		System.out.println(s.sqrt(x));
		System.out.println(Math.sqrt(x));
	}

	public int sqrt(int x) {
		if (x < 0)
			return 0;
		double k = 1.0;
		while (Math.abs(k * k - x) > 1e-5) {
			k = (k + x / k) / 2;
		}
		return (int) k;
	}
}
