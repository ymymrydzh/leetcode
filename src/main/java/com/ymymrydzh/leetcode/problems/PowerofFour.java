/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * @author 033172
 * @date 2019-01-10 15:05:12
 * @description Given an integer (signed 32 bits), write a function to check
 *              whether it is a power of 4.
 * 
 *              Example 1:
 * 
 *              Input: 16 Output: true
 * 
 *              Example 2:
 * 
 *              Input: 5 Output: false
 * 
 *              Follow up: Could you solve it without loops/recursion?
 */
public class PowerofFour {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PowerofFour p = new PowerofFour();
		System.out.println(p.isPowerOfFour(0));
	}

	public boolean isPowerOfFour(int num) {
		char[] binary = Integer.toBinaryString(num).toCharArray();
		int count = 0;
		for (int i = 0; i < binary.length; i++) {
			if (binary[binary.length - i - 1] == '1') {
				if (i % 2 == 1 || ++count > 1) {
					return false;
				}
			}
		}
		return count == 1;
	}
}
