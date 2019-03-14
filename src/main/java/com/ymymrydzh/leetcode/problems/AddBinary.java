/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * @author 033172
 * @date 2018-12-18 14:21:12
 * @description Given two binary strings, return their sum (also a binary
 *              string).
 * 
 *              The input strings are both non-empty and contains only
 *              characters 1 or 0.
 * 
 *              Example 1:
 * 
 *              Input: a = "11", b = "1" Output: "100"
 * 
 *              Example 2:
 * 
 *              Input: a = "1010", b = "1011" Output: "10101"
 */
public class AddBinary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AddBinary s = new AddBinary();
		String a = "11";
		String b = "11";
		System.out.println(s.addBinary(a, b));
	}

	public String addBinary(String a, String b) {
		int l = Math.abs(a.length() - b.length());
		StringBuffer c = new StringBuffer("");
		while (l-- > 0) {
			c.append("0");
		}
		if (a.length() > b.length()) {
			b = c.append(b).toString();
		} else {
			a = c.append(a).toString();
		}
		char[] s = new char[a.length() + 1];
		int i = a.length() - 1;
		boolean more = false;
		while (i > -1) {
			more = dealDigit(a, b, i--, s, more);
		}
		if (i == -1 && more) {
			s[0] = '1';
		}
		return new String(s).trim();
	}

	private boolean dealDigit(String a, String b, int i, char[] s, boolean more) {
		int c = a.charAt(i) + b.charAt(i) + (more ? 49 : 48);
		s[i + 1] = (char) (c % 48 % 2 + 48);
		return c > 145;
	}
}
