/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * @author 033172
 * @date 2019-01-09 17:33:33
 * @description Given a non-negative integer num, repeatedly add all its digits
 *              until the result has only one digit.
 * 
 *              Example:
 * 
 *              Input: 38 Output: 2 Explanation: The process is like: 3 + 8 =
 *              11, 1 + 1 = 2. Since 2 has only one digit, return it.
 * 
 *              Follow up: Could you do it without any loop/recursion in O(1)
 *              runtime?
 */
public class AddDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AddDigits a = new AddDigits();
		System.out.println(a.addDigits(0));
	}

	public int addDigits(int num) {
		// while (num > 9) {
		// num = num % 10 + addDigits(num / 10);
		// }
		// return num;

		while (num > 9) {
			int sum = 0;
			while (num > 0) {
				sum += num % 10;
				num /= 10;
			}
			num = sum;
		}
		return num;
	}
}
