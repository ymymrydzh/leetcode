/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * @author 033172
 * @date 2019-01-02 11:21:19
 * @description Given a positive integer, return its corresponding column title
 *              as appear in an Excel sheet.
 * 
 *              For example:
 * 
 *              <li>1 -> A
 *              <li>2 -> B
 *              <li>3 -> C
 *              <li>...
 *              <li>26 -> Z
 *              <li>27 -> AA
 *              <li>28 -> AB
 *              <li>...
 * 
 *              Example 1:
 * 
 *              Input: 1 Output: "A"
 * 
 *              Example 2:
 * 
 *              Input: 28 Output: "AB"
 * 
 *              Example 3:
 * 
 *              Input: 701 Output: "ZY"
 */
public class ExcelSheetColumnTitle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExcelSheetColumnTitle e = new ExcelSheetColumnTitle();
		System.out.println(e.convertToTitle(52));
	}

	public String convertToTitle(int n) {
		return n < 27 ? (char) (n + 64) + "" : convertToTitle((n - 1) / 26) + convertToTitle((n - 1) % 26 + 1);
	}

}
