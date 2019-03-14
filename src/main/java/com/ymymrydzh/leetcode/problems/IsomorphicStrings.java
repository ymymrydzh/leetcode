/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * @author 033172
 * @date 2019-01-04 08:46:36
 * @description Given two strings s and t, determine if they are isomorphic.
 * 
 *              Two strings are isomorphic if the characters in s can be
 *              replaced to get t.
 * 
 *              All occurrences of a character must be replaced with another
 *              character while preserving the order of characters. No two
 *              characters may map to the same character but a character may map
 *              to itself.
 * 
 *              Example 1:
 * 
 *              Input: s = "egg", t = "add" Output: true
 * 
 *              Example 2:
 * 
 *              Input: s = "foo", t = "bar" Output: false
 * 
 *              Example 3:
 * 
 *              Input: s = "paper", t = "title" Output: true
 * 
 *              Note: You may assume both s and t have the same length.
 */
public class IsomorphicStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IsomorphicStrings i = new IsomorphicStrings();
		System.out.println(i.isIsomorphic("qwertyuiop[]asdfghjkl;'\\zxcvbn,/", "',.pyfgcrl/=aoeuidhtns-\\;qjkxbwz"));
		System.out.println(i.isIsomorphic("paper", "title"));
	}

	public boolean isIsomorphic(String s, String t) {

		if (s.length() != t.length()) {
			return false;
		}
		int[] smap = new int[256];
		int[] tmap = new int[256];
		char[] schars = s.toCharArray();
		char[] tchars = t.toCharArray();
		for (int i = 0; i < schars.length; i++) {
			char schar = schars[i];
			char tchar = tchars[i];
			if (smap[schar] == 0 && tmap[tchar] == 0) {
				smap[schar] = i + 1;
				tmap[tchar] = i + 1;
			} else if (smap[schar] != tmap[tchar]) {
				return false;
			}
		}
		return true;

		// if (s == null || t == null || s.length() != t.length()) {
		// return false;
		// }
		// Set<Integer> dealedbit = new HashSet<>();
		// Set<Character> dealedchar = new HashSet<>();
		// char[] chars = s.toCharArray();
		// for (int i = 0; i < chars.length; i++) {
		// if (!dealedbit.contains(i)) {
		// if (dealedchar.contains(t.charAt(i))) {
		// return false;
		// } else {
		// for (int j = i, c = chars[i]; j < chars.length; j++) {
		// if (chars[j] == c && !dealedbit.contains(j)) {
		// chars[j] = t.charAt(i);
		// dealedbit.add(j);
		// dealedchar.add(t.charAt(i));
		// }
		// }
		// }
		// }
		// }
		// return new String(chars).equals(t);
	}
}
