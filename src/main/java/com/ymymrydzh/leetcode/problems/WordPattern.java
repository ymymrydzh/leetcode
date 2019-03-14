/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

import java.util.HashSet;
import java.util.Set;

/**
 * @author CC
 * @date 2019年1月10日09:29:29
 * @description Given a pattern and a string str, find if str follows the same
 *              pattern.
 * 
 *              Here follow means a full match, such that there is a bijection
 *              between a letter in pattern and a non-empty word in str.
 * 
 *              Example 1:
 * 
 *              Input: pattern = "abba", str = "dog cat cat dog" Output: true
 * 
 *              Example 2:
 * 
 *              Input:pattern = "abba", str = "dog cat cat fish" Output: false
 * 
 *              Example 3:
 * 
 *              Input: pattern = "aaaa", str = "dog cat cat dog" Output: false
 * 
 *              Example 4:
 * 
 *              Input: pattern = "abba", str = "dog dog dog dog" Output: false
 * 
 *              Notes: You may assume pattern contains only lowercase letters,
 *              and str contains lowercase letters separated by a single space.
 */
public class WordPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WordPattern wp = new WordPattern();
		String pattern = "abbc";
		String str = "dog cat cat dog";
		System.out.println(wp.wordPattern(pattern, str));
	}

	public boolean wordPattern(String pattern, String str) {
		// String[] ss = str.split(" ");
		// if (pattern.length() != ss.length) {
		// return false;
		// }
		// char[] pc = pattern.toCharArray();
		// Map<Character, String> map = new HashMap<>();
		// for (int i = 0; i < pattern.length(); i++) {
		// String ps = map.get(pc[i]);
		// if (ps != null) {
		// if (!ps.equals(ss[i])) {
		// return false;
		// }
		// } else {
		// if (map.containsValue(ss[i])) {
		// return false;
		// }
		// map.put(pc[i], ss[i]);
		// }
		// }
		// return true;

		String[] strs = str.split(" ");
		char[] chars = pattern.toCharArray();
		if (strs.length != chars.length) {
			return false;
		}
		int[] plocation = new int[26];
		int pcount = 0;
		Set<String> sset = new HashSet<>();
		for (int i = 0; i < chars.length; i++) {
			if (plocation[chars[i] - 97] == 0) {
				plocation[chars[i] - 97] = i + 1;
				pcount++;
				sset.add(strs[i]);
			} else {
				if (!strs[i].equals(strs[plocation[chars[i] - 97] - 1])) {
					return false;
				}
			}
		}
		return pcount == sset.size();
	}
}
