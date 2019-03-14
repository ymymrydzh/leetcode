/**
 *
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * @author cc
 * @date 2018年12月12日14:51:10
 * @description Roman numerals are represented by seven different symbols: I, V,
 *              X, L, C, D and M.
 * 
 *              Symbol Value I 1 V 5 X 10 L 50 C 100 D 500 M 1000
 * 
 *              For example, two is written as II in Roman numeral, just two
 *              one's added together. Twelve is written as, XII, which is simply
 *              X + II. The number twenty seven is written as XXVII, which is XX
 *              + V + II.
 * 
 *              Roman numerals are usually written largest to smallest from left
 *              to right. However, the numeral for four is not IIII. Instead,
 *              the number four is written as IV. Because the one is before the
 *              five we subtract it making four. The same principle applies to
 *              the number nine, which is written as IX. There are six instances
 *              where subtraction is used:
 * 
 *              I can be placed before V (5) and X (10) to make 4 and 9. X can
 *              be placed before L (50) and C (100) to make 40 and 90. C can be
 *              placed before D (500) and M (1000) to make 400 and 900. Given a
 *              roman numeral, convert it to an integer. Input is guaranteed to
 *              be within the range from 1 to 3999.
 * 
 *              Example 1:
 * 
 *              Input: "III" Output: 3
 * 
 *              Example 2:
 * 
 *              Input: "IV" Output: 4
 * 
 *              Example 3:
 * 
 *              Input: "IX" Output: 9
 * 
 *              Example 4:
 * 
 *              Input: "LVIII" Output: 58 Explanation: L = 50, V= 5, III = 3.
 *              Example 5:
 * 
 *              Input: "MCMXCIV" Output: 1994 Explanation: M = 1000, CM = 900,
 *              XC = 90 and IV = 4.
 */
public class RomanToInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RomanToInteger rti = new RomanToInteger();
		int result = rti.romanToInt("MCMLXXXIV");
		System.out.println(result);
	}

	int romanToInt(String s) {
//		int r = 0, c = 0;
//		for (int i = 0; i < s.length(); i++) {
//			switch (s.charAt(i)) {
//			case 'I':
//				c = 1;
//				if (i + 1 < s.length()) {
//					if (s.charAt(i + 1) == 'V') {
//						c = 4;
//						i++;
//					} else if (s.charAt(i + 1) == 'X') {
//						c = 9;
//						i++;
//					}
//				}
//				break;
//			case 'V':
//				c = 5;
//				break;
//			case 'X':
//				c = 10;
//				if (i + 1 < s.length()) {
//					if (s.charAt(i + 1) == 'L') {
//						c = 40;
//						i++;
//					} else if (s.charAt(i + 1) == 'C') {
//						c = 90;
//						i++;
//					}
//				}
//				break;
//			case 'L':
//				c = 50;
//				break;
//			case 'C':
//				c = 100;
//				if (i + 1 < s.length()) {
//					if (s.charAt(i + 1) == 'D') {
//						c = 400;
//						i++;
//					} else if (s.charAt(i + 1) == 'M') {
//						c = 900;
//						i++;
//					}
//				}
//				break;
//			case 'D':
//				c = 500;
//				break;
//			case 'M':
//				c = 1000;
//				break;
//			default:
//				c = 0;
//			}
//			r += c;
//		}
//		return r;

		int result = 0, pre = 0, cur = 0;
		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
			case 'I':
				cur = 1;
				break;
			case 'V':
				cur = 5;
				break;
			case 'X':
				cur = 10;
				break;
			case 'L':
				cur = 50;
				break;
			case 'C':
				cur = 100;
				break;
			case 'D':
				cur = 500;
				break;
			case 'M':
				cur = 1000;
				break;
			default:
				cur = 0;
			}
			if (cur > pre) {
				result += cur - pre - pre;
			} else {
				result += cur;
			}
			pre = cur;
		}
		return result;
	}

}
