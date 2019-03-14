/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * @author 033172
 * @date 2019-01-02 20:03:55
 * @description Write a function that takes an unsigned integer and return the
 *              number of '1' bits it has (also known as the Hamming weight).
 * 
 * 
 * 
 *              Example 1:
 * 
 *              Input: 00000000000000000000000000001011 Output: 3 Explanation:
 *              The input binary string 00000000000000000000000000001011 has a
 *              total of three '1' bits.
 * 
 *              Example 2:
 * 
 *              Input: 00000000000000000000000010000000 Output: 1 Explanation:
 *              The input binary string 00000000000000000000000010000000 has a
 *              total of one '1' bit.
 * 
 *              Example 3:
 * 
 *              Input: 11111111111111111111111111111101 Output: 31 Explanation:
 *              The input binary string 11111111111111111111111111111101 has a
 *              total of thirty one '1' bits.
 * 
 * 
 *              Note:
 * 
 *              Note that in some languages such as Java, there is no unsigned
 *              integer type. In this case, the input will be given as signed
 *              integer type and should not affect your implementation, as the
 *              internal binary representation of the integer is the same
 *              whether it is signed or unsigned. In Java, the compiler
 *              represents the signed integers using 2's complement notation.
 *              Therefore, in Example 3 above the input represents the signed
 *              integer -3.
 * 
 * 
 *              Follow up:
 * 
 *              If this function is called many times, how would you optimize
 *              it?
 */
public class Numberof1Bits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	// you need to treat n as an unsigned value
	public int hammingWeight(int n) {
		// return Integer.toBinaryString(n).replaceAll("0", "").length();

		String b = Integer.toBinaryString(n);
		int i = 0;
		for (char c : b.toCharArray()) {
			if (c == 49) {
				i++;
			}
		}
		return i;
	}
}
