/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * @author 033172
 * @date 2019-01-10 15:52:10
 * @description Write a function that takes a string as input and reverse only
 *              the vowels of a string.
 * 
 *              Example 1:
 * 
 *              Input: "hello" Output: "holle"
 * 
 *              Example 2:
 * 
 *              Input: "leetcode" Output: "leotcede" Note: The vowels does not
 *              include the letter "y".
 */
public class ReverseVowelsofaString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ReverseVowelsofaString r = new ReverseVowelsofaString();
		System.out.println(r.reverseVowels("leetcode"));
	}

	public String reverseVowels(String s) {
		char[] sc = s.toCharArray();
		int i = 0;
		int j = sc.length - 1;
		while (i < j) {
			while (i < j && !isVowel(Character.toLowerCase(sc[i]))) {
				i++;
			}
			while (i < j && !isVowel(Character.toLowerCase(sc[j]))) {
				j--;
			}
			char tmp = sc[i];
			sc[i++] = sc[j];
			sc[j--] = tmp;
		}
		return new String(sc);
	}

	private boolean isVowel(char c) {
		return c == 'a' ? true : c == 'e' ? true : c == 'i' ? true : c == 'o' ? true : c == 'u' ? true : false;
	}
}
