/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * @author cc
 * @date 2018年12月12日15:29:24
 * @description Write a function to find the longest common prefix string
 *              amongst an array of strings.
 * 
 *              If there is no common prefix, return an empty string "".
 * 
 *              Example 1:
 * 
 *              Input: ["flower","flow","flight"] Output: "fl"
 * 
 *              Example 2:
 * 
 *              Input: ["dog","racecar","car"] Output: "" Explanation: There is
 *              no common prefix among the input strings.
 * 
 *              Note: All given inputs are in lowercase letters a-z.
 */
public class LongestCommonPrefix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		// String[] strs = { "sfffffffff", "sffffffffff", "sfffffffffdsf",
		// "sffffffffdffdsa", "sfffffffffasf",
		// "sfffffffff", "sfffffffff", "sfffffffff", "sfffffffff", "sfffffa",
		// "sffffa", "sfffa", "sffa", "sfa" };
		String[] strs = { "aa", "c" };
		System.out.println(new LongestCommonPrefix().longestCommonPrefix(strs));
		System.out.println(System.currentTimeMillis() - startTime);
	}

	public String longestCommonPrefix(String[] strs) {
		// String s = "";
		// if (strs.length > 0) {
		// s = strs[0];
		// for (int i = 1; i < strs.length; i++) {
		// int j = 0;
		// for (; j < s.length() && j < strs[i].length(); j++) {
		// if (s.charAt(j) != strs[i].charAt(j)) {
		// break;
		// }
		// }
		// s = s.substring(0, j);
		// if ("".equals(s)) {
		// break;
		// }
		// }
		// }
		// return s;

		String s = "";
		if (strs.length > 0) {
			s = strs[0];
			for (int i = 1; i < strs.length; i++) {
				int j = Math.min(s.length(), strs[i].length());
				for (; j > 0; j--) {
					s = s.substring(0, j);
					if (strs[i].startsWith(s)) {
						break;
					}
				}
				if (j == 0) {
					s = "";
					break;
				}
			}
		}
		return s;
	}

}
