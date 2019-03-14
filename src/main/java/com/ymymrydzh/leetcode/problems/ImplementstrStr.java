/**
 *
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * @author cc
 * @date 2018年12月13日16:05:23
 * @description Implement strStr().
 * 
 *              Return the index of the first occurrence of needle in haystack,
 *              or -1 if needle is not part of haystack.
 * 
 *              Example 1:
 * 
 *              Input: haystack = "hello", needle = "ll" Output: 2
 * 
 *              Example 2:
 * 
 *              Input: haystack = "aaaaa", needle = "bba" Output: -1
 *              Clarification:
 * 
 *              What should we return when needle is an empty string? This is a
 *              great question to ask during an interview.
 * 
 *              For the purpose of this problem, we will return 0 when needle is
 *              an empty string. This is consistent to C's strstr() and Java's
 *              indexOf().
 */
public class ImplementstrStr {

	public static void main(String[] args) {
		ImplementstrStr i = new ImplementstrStr();
		String haystack = "mississippi";
		String needle = "issippi";
		int r = i.strStr(haystack, needle);
		System.out.println(r);
	}

	public int strStr(String haystack, String needle) {

		// 暴力(快)(比底下的牛逼算法快。。。)
		if (needle == null || needle.isEmpty()) {
			return 0;
		}
		int h = 0;
		int n = 0;
		while (n < needle.length() && (h + n) < haystack.length()) {
			if (needle.charAt(n) == haystack.charAt(h + n)) {
				n++;
			} else {
				h++;
				n = 0;
			}
		}
		if (n == needle.length()) {
			return h;
		}
		return -1;

		// 暴力(慢)为啥？
		// if (needle == null || needle.isEmpty()) {
		// return 0;
		// }
		// for (int i = 0; i < haystack.length(); i++) {
		// int j = 0;
		// while (j < needle.length() && (i + j) < haystack.length()) {
		// if (needle.charAt(j) != haystack.charAt(i + j)) {
		// break;
		// }
		// j++;
		// }
		// if (j == needle.length()) {
		// return i;
		// }
		// }
		// return -1;

		// KMP
		// if (needle == null || needle.isEmpty()) {
		// return 0;
		// }
		// int[] p = new int[needle.length()];
		// int n = -1, h = 0;
		// p[0] = -1;
		// while (h < needle.length() - 1) {
		// if (n == -1 || needle.charAt(n) == needle.charAt(h)) {
		// p[++h] = ++n;
		// } else {
		// n = p[n];
		// }
		// }
		// n = h = 0;
		// while (h < haystack.length() && n < needle.length()) {
		// if (n == -1 || needle.charAt(n) == haystack.charAt(h)) {
		// h++;
		// n++;
		// } else {
		// n = p[n];
		// }
		// }
		// if (n == needle.length()) {
		// return h - needle.length();
		// }
		// return -1;

		// Sunday
		// if (needle == null || needle.isEmpty()) {
		// return 0;
		// }
		// Map<Character, Integer> l = new HashMap<>();
		// for (int i = needle.length() - 1; i > -1; i--) {
		// if (!l.containsKey(needle.charAt(i))) {
		// l.put(needle.charAt(i), i);
		// }
		// }
		// int h = 0;
		// int n = 0;
		// while (h < haystack.length() - needle.length() + 1) {
		// n = 0;
		// while (needle.charAt(n) == haystack.charAt(h + n)) {
		// n++;
		// if (n == needle.length()) {
		// return h;
		// }
		// }
		// if (h + needle.length() >= haystack.length()) {
		// break;
		// }
		// Integer j = l.get(haystack.charAt(h + needle.length()));
		// if (j == null) {
		// j = -1;
		// }
		// h += needle.length() - j;
		// }
		// return -1;
	}
}
