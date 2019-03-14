/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * @author 033172
 * @date 2019-01-02 15:13:47
 * @description Given a column title as appear in an Excel sheet, return its
 *              corresponding column number.
 * 
 *              For example:
 * 
 *              <li>A -> 1
 *              <li>B -> 2
 *              <li>C -> 3
 *              <li>...
 *              <li>Z -> 26
 *              <li>AA -> 27
 *              <li>AB -> 28
 *              <li>...
 * 
 *              Example 1: Input: "A" Output: 1
 * 
 *              Example 2: Input: "AB" Output: 28
 * 
 *              Example 3: Input: "ZY" Output: 701
 */
public class ExcelSheetColumnNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExcelSheetColumnNumber e = new ExcelSheetColumnNumber();
		System.out.println(e.titleToNumber("AZ"));
	}

	public int titleToNumber(String s) {
		int n = 0;
		for (char c : s.toCharArray()) {
			n = n * 26 + (c - 64);
		}
		return n;
	}
}
