/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

import java.util.Arrays;

/**
 * @author 033172
 * @date 2019-01-11 08:36:29
 * @description Given an integer, write an algorithm to convert it to
 *              hexadecimal. For negative integer, two’s complement method is
 *              used.
 * 
 *              Note:
 * 
 *              <li>All letters in hexadecimal (a-f) must be in lowercase.
 *              <li>The hexadecimal string must not contain extra leading 0s. If
 *              the number is zero, it is represented by a single zero character
 *              '0'; otherwise, the first character in the hexadecimal string
 *              will not be the zero character.
 *              <li>The given number is guaranteed to fit within the range of a
 *              32-bit signed integer.
 *              <li>You must not use any method provided by the library which
 *              converts/formats the number to hex directly.
 * 
 *              Example 1:
 * 
 *              Input: 26 Output: "1a"
 * 
 *              Example 2:
 * 
 *              Input: -1 Output: "ffffffff"
 */
public class ConvertaNumbertoHexadecimal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConvertaNumbertoHexadecimal c = new ConvertaNumbertoHexadecimal();
		int num = -26;
		System.out.println(Integer.toHexString(num));
		System.out.println(Integer.toBinaryString(num));
		System.out.println(c.toHex(num));
	}

	public String toHex(int num) {
		if (num == 0) {
			return "0";
		}
		char[] bin = new char[32];
		int i = 31;
		int n = num;
		for (; i > 0 && n != 0; i--) {
			bin[i] = (char) (n & 1);
			n = n >> 1;
		}
		if (num < 0) {
			Arrays.fill(bin, 0, i + 1, (char) 1);
			i = -1;
		}
		char[] hex = new char[8];
		int j = 31;
		int h = 0;
		for (; j > i; j -= 4) {
			h = j / 4;
			hex[h] = (char) (bin[j] + bin[j - 1] * 2 + bin[j - 2] * 4 + bin[j - 3] * 8 + '0');
			if (hex[h] > 57) {
				hex[h] += 39;
			}
		}
		return new String(Arrays.copyOfRange(hex, h, 8));
	}
}
