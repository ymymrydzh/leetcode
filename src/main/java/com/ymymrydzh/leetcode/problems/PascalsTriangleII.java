/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

import java.util.Arrays;
import java.util.List;

/**
 * @author 033172
 * @date 2018-12-25 18:20:56
 * @description Given a non-negative index k where k ≤ 33, return the kth index
 *              row of the Pascal's triangle.
 * 
 *              Note that the row index starts from 0.
 * 
 * 
 *              In Pascal's triangle, each number is the sum of the two numbers
 *              directly above it.
 * 
 *              Example:
 * 
 *              Input: 3 Output: [1,3,3,1]
 * 
 *              Follow up:
 * 
 *              Could you optimize your algorithm to use only O(k) extra space?
 */
public class PascalsTriangleII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PascalsTriangleII p = new PascalsTriangleII();
		System.out.println(p.getRow(3));
	}

	public List<Integer> getRow(int rowIndex) {
//		List<Integer> result = new ArrayList<>();
//		result.add(1);
//		for (int j = 1; j <= rowIndex; j++) {
//			List<Integer> next = new ArrayList<>();
//			next.add(1);
//			for (int i = 1; i < j; i++) {
//				next.add(result.get(i - 1) + result.get(i));
//			}
//			next.add(1);
//			result = next;
//		}
//		return result;
		
		Integer[] result = new Integer[rowIndex + 1];
		Arrays.fill(result, 0);
		result[0] = 1;
		for (int i = 0; i <= rowIndex; i++) {
			for (int j = i; j > 0; j--) {
				result[j] = result[j] + result[j - 1];
			}
		}
		return Arrays.asList(result);
	}
}
