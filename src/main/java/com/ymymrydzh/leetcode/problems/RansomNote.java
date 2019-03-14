/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * @author 033172
 * @date 2019-01-14 15:02:37
 * @description Given an arbitrary ransom note string and another string
 *              containing letters from all the magazines, write a function that
 *              will return true if the ransom note can be constructed from the
 *              magazines ; otherwise, it will return false.
 * 
 *              Each letter in the magazine string can only be used once in your
 *              ransom note.
 * 
 *              Note: You may assume that both strings contain only lowercase
 *              letters.
 * 
 *              <li>canConstruct("a", "b") -> false
 *              <li>canConstruct("aa", "ab") -> false
 *              <li>canConstruct("aa", "aab") -> true
 */
public class RansomNote {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RansomNote r = new RansomNote();
		System.out.println(r.canConstruct("a", "b"));
	}

	public boolean canConstruct(String ransomNote, String magazine) {
		// char[] rc = ransomNote.toCharArray();
		// char[] mc = magazine.toCharArray();
		// Arrays.sort(rc);
		// Arrays.sort(mc);
		// int r = 0;
		// int m = 0;
		// while (r < rc.length && m < mc.length) {
		// if (rc[r] > mc[m]) {
		// m++;
		// } else if (rc[r] == mc[m]) {
		// r++;
		// m++;
		// } else {
		// return false;
		// }
		// }
		// return r == rc.length;

		if (magazine.length() < ransomNote.length()) {
			return false;
		}
		int[] count = new int[26];
		for (char c : magazine.toCharArray()) {
			count[c - 'a']++;
		}
		for (char c : ransomNote.toCharArray()) {
			if (count[c - 'a'] == 0) {
				return false;
			}
			count[c - 'a']--;
		}
		return true;
	}
}
