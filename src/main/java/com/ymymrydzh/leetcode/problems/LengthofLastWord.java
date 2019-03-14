/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * @author cc
 * @date 2018年12月18日13:31:27
 * @description Given a string s consists of upper/lower-case alphabets and
 *              empty space characters ' ', return the length of last word in
 *              the string.
 * 
 *              If the last word does not exist, return 0.
 * 
 *              Note: A word is defined as a character sequence consists of
 *              non-space characters only.
 * 
 *              Example:
 * 
 *              Input: "Hello World" Output: 5
 */
public class LengthofLastWord {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LengthofLastWord l = new LengthofLastWord();
		String s = " a  da ";
		System.out.println(l.lengthOfLastWord(s));
	}

	public int lengthOfLastWord(String s) {
		if (s.length() <= 0) {
			return 0;
		}
		int l = s.length() - 1;
		int w = 0;
		while (l >= 0 && s.charAt(l) == ' ') {
			l--;
			w++;
		}
		while (l >= 0 && s.charAt(l) != ' ') {
			l--;
		}
		return s.length() - 1 - w - l;

		// s = s.trim();
		// int p = s.lastIndexOf(" ");
		// if (p == -1) {
		// return s.length();
		// } else {
		// return s.length() - p - 1;
		// }
	}
}
