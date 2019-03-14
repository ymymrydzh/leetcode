/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * @author 033172
 * @date 2019-01-14 16:13:55
 * @description Given a string, find the first non-repeating character in it and
 *              return it's index. If it doesn't exist, return -1.
 * 
 *              Examples:
 * 
 *              s = "leetcode" return 0.
 * 
 *              s = "loveleetcode", return 2.
 * 
 *              Note: You may assume the string contain only lowercase letters.
 */
public class FirstUniqueCharacterinaString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FirstUniqueCharacterinaString f = new FirstUniqueCharacterinaString();
		System.out.println(f.firstUniqChar("loveleetcode"));
	}

	public int firstUniqChar(String s) {
		char[] cs = s.toCharArray();
		int[] loc = new int[26];
		for (int i = 0; i < cs.length; i++) {
			int cl = cs[i] - 97;
			if (loc[cl] == 0) {
				loc[cl] = i + 1;
			} else {
				loc[cl] = -1;
			}
		}
		int first = cs.length;
		for (int i = 0; i < loc.length; i++) {
			if (loc[i] != 0 && loc[i] != -1) {
				if (loc[i] - 1 < first) {
					first = loc[i] - 1;
				}
			}
		}
		return first == cs.length ? -1 : first;
	}
}
