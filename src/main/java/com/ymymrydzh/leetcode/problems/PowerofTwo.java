/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * @author 033172
 * @date 2019-01-09 09:41:58
 * @description Given an integer, write a function to determine if it is a power
 *              of two.
 * 
 *              Example 1:
 * 
 *              Input: 1 Output: true Explanation: 2^0 = 1
 * 
 *              Example 2:
 * 
 *              Input: 16 Output: true Explanation: 2^4 = 16
 * 
 *              Example 3:
 * 
 *              Input: 218 Output: false
 */
public class PowerofTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PowerofTwo p = new PowerofTwo();
		System.out.println(p.isPowerOfTwo(2));
	}

	public boolean isPowerOfTwo(int n) {
		// return n > 0 && Integer.toBinaryString(n).replaceAll("0",
		// "").length() == 1;

		// if (n < 1) {
		// return false;
		// }
		// char[] cs = Integer.toBinaryString(n).toCharArray();
		// if (cs[0] != '1') {
		// return false;
		// }
		// for (int i = 1; i < cs.length; i++) {
		// if (cs[i] != '0') {
		// return false;
		// }
		// }
		// return true;

		// if (n < 1) {
		// return false;
		// }
		// while (n != 1 && n % 2 == 0) {
		// n >>= 1;
		// }
		// return n == 1;

		// 当且仅当n为2的幂，n的最高位为1其余为0，n-1最高位为0，其余为1，(n & (n - 1)) == 0。否则两数差值不为1
		return n > 0 && (n & (n - 1)) == 0;
	}
}
