/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * @author cc
 * @date 2018年12月12日13:58:25
 * @description Determine whether an integer is a palindrome. An integer is a
 *              palindrome when it reads the same backward as forward.
 * 
 *              Example 1:
 * 
 *              Input: 121 Output: true
 * 
 *              Example 2:
 * 
 *              Input: -121 Output: false Explanation: From left to right, it
 *              reads -121. From right to left, it becomes 121-. Therefore it is
 *              not a palindrome.
 * 
 *              Example 3:
 * 
 *              Input: 10 Output: false Explanation: Reads 01 from right to
 *              left. Therefore it is not a palindrome.
 * 
 *              Follow up:
 * 
 *              Coud you solve it without converting the integer to a string?
 */
public class PalindromeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long start = System.currentTimeMillis();

		PalindromeNumber p = new PalindromeNumber();
		int i1 = 0;
		System.out.println(p.isPalindrome(i1));
		int i2 = 2112332112;
		System.out.println(p.isPalindrome(i2));
		int i3 = 10001;
		System.out.println(p.isPalindrome(i3));

		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

	public boolean isPalindrome(int x) {

		// if (x < 0 || (x >= 10 && x % 10 == 0)) {
		// return false;
		// }
		// int r = 0;
		// while (x > r) {
		// r = r * 10 + x % 10;
		// x /= 10;
		// }
		// return x == r || x == r / 10;

		// if (x < 0) {
		// return false;
		// }
		// String s = String.valueOf(x);
		// int i = s.length() / 2 + s.length() % 2 - 1, j = s.length() / 2;
		// for (; i >= 0; i--, j++) {
		// if (s.charAt(i) != s.charAt(j)) {
		// return false;
		// }
		// }
		// return true;

		String s = String.valueOf(x);
		int i = 0, j = s.length() - 1;
		for (; i < j; i++, j--) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
		}
		return true;
	}
}
