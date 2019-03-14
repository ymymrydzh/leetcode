/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

import java.util.Arrays;

/**
 * @author 033172
 * @date 2019-01-09 16:21:54
 * @description Given two strings s and t , write a function to determine if t
 *              is an anagram of s.
 * 
 *              Example 1:
 * 
 *              Input: s = "anagram", t = "nagaram" Output: true
 * 
 *              Example 2:
 * 
 *              Input: s = "rat", t = "car" Output: false
 * 
 *              Note: You may assume the string contains only lowercase
 *              alphabets.
 * 
 *              Follow up: What if the inputs contain unicode characters? How
 *              would you adapt your solution to such case?
 */
public class ValidAnagram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		char[] sc = s.toCharArray();
		char[] tc = t.toCharArray();
		Arrays.sort(sc);
		Arrays.sort(tc);
		return Arrays.equals(sc, tc);

		// if (s.length() != t.length()) {
		// return false;
		// }
		// int[] scount = new int[26];
		// int[] tcount = new int[26];
		// char[] sc = s.toCharArray();
		// char[] tc = t.toCharArray();
		// for (int i = 0; i < sc.length; i++) {
		// scount[sc[i] - 'a']++;
		// tcount[tc[i] - 'a']++;
		// }
		// for (int i = 0; i < 26; i++) {
		// if (scount[i] != tcount[i]) {
		// return false;
		// }
		// }
		// return true;
	}
}
