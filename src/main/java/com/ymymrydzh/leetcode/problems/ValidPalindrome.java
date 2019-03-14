/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * @author 033172
 * @date 2018-12-26 19:07:40
 * @description Given a string, determine if it is a palindrome, considering
 *              only alphanumeric characters and ignoring cases.
 * 
 *              Note: For the purpose of this problem, we define empty string as
 *              valid palindrome.
 * 
 *              Example 1:
 * 
 *              Input: "A man, a plan, a canal: Panama" Output: true
 * 
 *              Example 2:
 * 
 *              Input: "race a car" Output: false
 */
public class ValidPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ValidPalindrome v = new ValidPalindrome();
		String s = "0P";
		System.out.println(v.isPalindrome(s));
	}

	public boolean isPalindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			while (i < s.length() && !Character.isLetterOrDigit(s.charAt(i))) {
				i++;
			}
			while (j > -1 && !Character.isLetterOrDigit(s.charAt(j))) {
				j--;
			}
			if (i < j && Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
