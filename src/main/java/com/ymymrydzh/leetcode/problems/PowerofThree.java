/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * @author cc
 * @date 2019年1月10日14:56:47
 * @description Given an integer, write a function to determine if it is a power
 *              of three.
 * 
 *              Example 1:
 * 
 *              Input: 27 Output: true
 * 
 *              Example 2:
 * 
 *              Input: 0 Output: false
 * 
 *              Example 3:
 * 
 *              Input: 9 Output: true
 * 
 *              Example 4:
 * 
 *              Input: 45 Output: false
 * 
 *              Follow up: Could you do it without using any loop / recursion?
 * 
 * 
 */
public class PowerofThree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PowerofThree p = new PowerofThree();
		System.out.println(p.isPowerOfThree(0));
	}

	public boolean isPowerOfThree(int n) {
		// return (n > 0 && 1162261467 % n == 0);

		while (n > 1 && n % 3 == 0) {
			n /= 3;
		}
		return n == 1;
	}
}
