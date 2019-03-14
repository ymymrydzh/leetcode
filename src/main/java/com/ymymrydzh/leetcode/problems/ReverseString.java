/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * 
 * @author 033172
 * @date 2019-01-10 15:40:54
 * @description Write a function that takes a string as input and returns the
 *              string reversed.
 * 
 *              Example 1:
 * 
 *              Input: "hello" Output: "olleh"
 * 
 *              Example 2:
 * 
 *              Input: "A man, a plan, a canal: Panama" Output: "amanaP :lanac a
 *              ,nalp a ,nam A"
 */
public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ReverseString r = new ReverseString();
		System.out.println(r.reverseString("hello"));
	}

	public String reverseString(String s) {
		// char[] sc = s.toCharArray();
		// for (int i = 0, j = sc.length - 1; i < j; i++, j--) {
		// char tmp = sc[i];
		// sc[i] = sc[j];
		// sc[j] = tmp;
		// }
		// return new String(sc);

		return new StringBuffer(s).reverse().toString();
	}
}
