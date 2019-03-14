/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * @author CC
 * @date 2018年12月18日15:57:15
 * @description You are climbing a stair case. It takes n steps to reach to the
 *              top.
 * 
 *              Each time you can either climb 1 or 2 steps. In how many
 *              distinct ways can you climb to the top?
 * 
 *              Note: Given n will be a positive integer.
 * 
 *              Example 1:
 * 
 *              Input: 2 Output: 2 Explanation: There are two ways to climb to
 *              the top.
 *              <li>1. 1 step + 1 step
 *              <li>2. 2 steps
 * 
 *              Example 2:
 * 
 *              Input: 3 Output: 3 Explanation: There are three ways to climb to
 *              the top.
 *              <li>1. 1 step + 1 step + 1 step
 *              <li>2. 1 step + 2 steps
 *              <li>3. 2 steps + 1 step
 */
public class ClimbingStairs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClimbingStairs cs = new ClimbingStairs();
		// System.out.println(cs.fixed1Steps(22,13));
		System.out.println(cs.climbStairs(38));
	}

	public int climbStairs(int n) {

		// 排列组合
		// if (n < 2) {
		// return n;
		// }
		// double sum = 1;
		// for (int i = 1; i <= n / 2; i++) {
		// double tmp = 1;
		// for (int j = 0; j < i; j++) {
		// tmp *= (double) (n - i - j) / (i - j);
		// }
		// sum += tmp;
		// }
		// DecimalFormat decimalFormat = new DecimalFormat("###0");
		// return Integer.valueOf(decimalFormat.format(sum));

		// 斐波那契数列
		int i = 1, j = 2, k = 0;
		if (n <= 2) {
			k = n;
		}
		while (n-- > 2) {
			k = i + j;
			i = j;
			j = k;
		}
		return k;
	}
}
