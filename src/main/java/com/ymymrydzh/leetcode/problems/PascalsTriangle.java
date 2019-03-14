/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 033172
 * @date 2018-12-21 16:29:59
 * @description Given a non-negative integer numRows, generate the first numRows
 *              of Pascal's triangle.
 * 
 * 
 *              In Pascal's triangle, each number is the sum of the two numbers
 *              directly above it.
 * 
 *              Example:
 * 
 *              Input: 5 Output: 
 *              
 *              [
 *                   [1],
 *                  [1,1],
 *                 [1,2,1],
 *                [1,3,3,1],
 *               [1,4,6,4,1]
 *              ]
 */
public class PascalsTriangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PascalsTriangle p = new PascalsTriangle();
		System.out.println(p.generate(7));
	}

	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> pt = new ArrayList<>();
		if (numRows >= 1) {
			List<Integer> r = new ArrayList<>();
			r.add(1);
			pt.add(r);
			for (int j = 1; j < numRows; j++) {
				List<Integer> c = new ArrayList<>();
				c.add(1);
				for (int i = 1; i < j; i++) {
					c.add(pt.get(j - 1).get(i - 1) + pt.get(j - 1).get(i));
				}
				c.add(1);
				pt.add(c);
			}
		}
		return pt;
	}
}
